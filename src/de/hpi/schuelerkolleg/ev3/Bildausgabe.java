package de.hpi.schuelerkolleg.ev3;

import lejos.hardware.BrickFinder;
import lejos.hardware.lcd.GraphicsLCD;
import lejos.hardware.lcd.Image;

public class Bildausgabe {
	public static void bild(Image image) {
		Bildausgabe.bild(image, 0, 0);
	}
	
	public static void bild(Image image, int x, int y) {
		GraphicsLCD lcd = BrickFinder.getDefault().getGraphicsLCD();
		lcd.drawImage(image, x, y, 0);
	}
}
