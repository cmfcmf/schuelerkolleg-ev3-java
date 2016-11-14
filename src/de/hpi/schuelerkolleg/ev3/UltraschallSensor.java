package de.hpi.schuelerkolleg.ev3;

import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.sensor.SensorModes;
import lejos.robotics.SampleProvider;

public class UltraschallSensor {
	private SampleProvider sampleProvider;
	
	private float[] sample;
	
	public UltraschallSensor(int portNumber) {
		Port port = LocalEV3.get().getPort("S".concat(Integer.toString(portNumber)));

		EV3UltrasonicSensor sensor = new EV3UltrasonicSensor(port);
		sensor.enable();

		this.sampleProvider = sensor.getDistanceMode();

		this.sample = new float[this.sampleProvider.sampleSize()];
	}
	
	public double getDistance() {
		this.sampleProvider.fetchSample(sample, 0);
		
		return this.sample[0] * 100;
	}
	
	public boolean seesWall() {
		this.sampleProvider.fetchSample(sample, 0);
		
		return !Float.isInfinite(this.sample[0]);
	}

	public void waitForWall() {
		do {
			this.sampleProvider.fetchSample(sample, 0);
			Thread.yield();
		} while (Float.isInfinite(this.sample[0]));
	}

	public void waitForWall(double distance) {
		do {
			this.sampleProvider.fetchSample(sample, 0);
			Thread.yield();
		} while (this.sample[0] * 100 > distance);
	}

	public void waitForNoWall() {
		do {
			this.sampleProvider.fetchSample(sample, 0);
			Thread.yield();
		} while (Float.isFinite(this.sample[0]));
	}

	public void waitForNoWall(double distance) {
		do {
			this.sampleProvider.fetchSample(sample, 0);
			Thread.yield();
		} while (this.sample[0] * 100 <= distance);
	}
}
