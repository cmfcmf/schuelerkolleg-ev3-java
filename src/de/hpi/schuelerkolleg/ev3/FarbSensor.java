package de.hpi.schuelerkolleg.ev3;

import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;

public class FarbSensor {
	private SampleProvider color;
	private SampleProvider light;
	private SampleProvider ambient;

	private float[] colorSample;
	private float[] lightSample;
	private float[] ambientSample;
	
	public FarbSensor(int portNumber) {
		Port port = LocalEV3.get().getPort("S".concat(Integer.toString(portNumber)));

		EV3ColorSensor sensor = new EV3ColorSensor(port);

		this.color = sensor.getColorIDMode();
		this.light = sensor.getRedMode();
		this.ambient = sensor.getAmbientMode();

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
}
