package de.hpi.schuelerkolleg.ev3;

import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.SampleProvider;

public class FarbSensor {
	private EV3ColorSensor sensor;
	
	private SampleProvider color;
	private SampleProvider light;
	private SampleProvider ambient;

	private float[] colorSample;
	private float[] lightSample;
	private float[] ambientSample;
	
	public FarbSensor(int portNumber) {
		Port port = LocalEV3.get().getPort("S".concat(Integer.toString(portNumber)));

		this.sensor = new EV3ColorSensor(port);

		this.color = this.sensor.getColorIDMode();
		this.light = this.sensor.getRedMode();
		this.ambient = this.sensor.getAmbientMode();

		this.colorSample = new float[this.color.sampleSize()];
		this.lightSample = new float[this.light.sampleSize()];
		this.ambientSample = new float[this.ambient.sampleSize()];
	}
	
	public float getAmbientLight() {
		this.ambient.fetchSample(ambientSample, 0);
		
		return this.ambientSample[0];
	}
	
	public float getLightIntensity() {
		this.light.fetchSample(lightSample, 0);
		
		return this.lightSample[0];
	}
	
	public int getColor() {
		this.color.fetchSample(colorSample, 0);
		
		return (int)(this.colorSample[0]);
	}
	
	public void close() {
		this.sensor.close();
	}
}
