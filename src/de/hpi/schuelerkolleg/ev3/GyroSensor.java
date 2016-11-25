package de.hpi.schuelerkolleg.ev3;

import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3GyroSensor;
import lejos.robotics.SampleProvider;

public class GyroSensor {
	private SampleProvider sampleProvider;
	
	private EV3GyroSensor sensor;
	
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
	
	public double winkel() {
		this.sampleProvider.fetchSample(sample, 0);

		return (double)this.sample[1];
	}
	
	public double veraenderung() {
		this.sampleProvider.fetchSample(sample, 0);
		
		return (double)this.sample[0];
	}
}
