package de.hpi.schuelerkolleg.ev3;

import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;

public class UltraschallSensor {
	private EV3UltrasonicSensor sensor;
	
	private SampleProvider sampleProvider;
	
	/**
	 * Distance in meters
	 */
	private float[] sample;
	
	public UltraschallSensor(int portNumber) {
		Port port = LocalEV3.get().getPort("S".concat(Integer.toString(portNumber)));

		this.sensor = new EV3UltrasonicSensor(port);
		this.sensor.enable();

		this.sampleProvider = this.sensor.getDistanceMode();

		this.sample = new float[this.sampleProvider.sampleSize()];
	}
	
	public float getDistanceAsFloat() {
		this.sampleProvider.fetchSample(sample, 0);
		
		return this.sample[0] * 100;
	}
	
	public int getDistance() {
		return Math.round(this.getDistanceAsFloat());
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

	public void waitForWall(float distance) {
		do {
			this.sampleProvider.fetchSample(sample, 0);
			Thread.yield();
		} while (this.sample[0] * 100 > distance);
	}

	public void waitForWall(int distance) {
		this.waitForWall((float)distance);
	}

	public void waitForNoWall() {
		do {
			this.sampleProvider.fetchSample(sample, 0);
			Thread.yield();
		} while (Float.isFinite(this.sample[0]));
	}

	public void waitForNoWall(float distance) {
		do {
			this.sampleProvider.fetchSample(sample, 0);
			Thread.yield();
		} while (this.sample[0] * 100 <= distance);
	}

	public void waitForNoWall(int distance) {
		this.waitForNoWall((float)distance);
	}
	
	public void close() {
		this.sensor.close();
	}
}
