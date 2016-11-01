package de.hpi.schuelerkolleg.ev3;

import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.SensorModes;
import lejos.robotics.SampleProvider;

public class TastSensor {
	private SampleProvider sampleProvider;
	
	private float[] sample;
	
	public TastSensor(int portNumber) {
		Port port = LocalEV3.get().getPort("S".concat(Integer.toString(portNumber)));

		EV3TouchSensor sensor = new EV3TouchSensor(port);

		this.sampleProvider = sensor.getTouchMode();

		this.sample = new float[this.sampleProvider.sampleSize()];
	}
	
	public boolean isUp() {
		this.sampleProvider.fetchSample(sample, 0);
		
		return this.sample[0] == 0;
	}
	
	public boolean isDown() {
		this.sampleProvider.fetchSample(sample, 0);
		
		return this.sample[0] == 1;
	}
	
	public void waitForPress() {
		do {			
			this.sampleProvider.fetchSample(sample, 0);
			Thread.yield();
		} while (this.sample[0] == 0);
	}
}
