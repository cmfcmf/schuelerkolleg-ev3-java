package de.hpi.schuelerkolleg.ev3;

import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3GyroSensor;
import lejos.robotics.SampleProvider;

public class GyroSensor {
	private EV3GyroSensor sensor;
	
	private SampleProvider sampleProvider;
	
	private float[] sample;
	
	public GyroSensor(int portNumber) {
		Port port = LocalEV3.get().getPort("S".concat(Integer.toString(portNumber)));

		this.sensor = new EV3GyroSensor(port);

		this.sampleProvider = this.sensor.getAngleAndRateMode();

		this.sample = new float[this.sampleProvider.sampleSize()];
	}
	
	public void reset() {
		this.sensor.reset();
	}
	
	public int winkel() {
		this.sampleProvider.fetchSample(sample, 0);

		return (int)this.sample[1];
	}
	
	public int veraenderung() {
		this.sampleProvider.fetchSample(sample, 0);
		
		return (int)this.sample[0];
	}
	
	public void close() {
		this.sensor.close();
	}
}
