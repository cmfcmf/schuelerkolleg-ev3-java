package de.hpi.schuelerkolleg.ev3;

import lejos.hardware.lcd.LCD;
import lejos.robotics.navigation.MovePilot;
import lejos.utility.Delay;

public class Einheit2 {
	public static void main(String[] args) {
		// Willkommensnachricht
		LCD.drawString("Hallo zur zweiten", 0, 0);
		LCD.drawString("Einheit!", 0, 1);
		Delay.msDelay(1000);
		LCD.clear();
		
		// Initialisiere Piloten
		MovePilot pilot = Pilot.initPilot();
		
		// Fahre ~20cm
		pilot.travel(5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Hier findet ihr noch ein paar Code Beispiele.
		// Wie immer gilt - fragt jederzeit nach bei Problemen!
		
		// # Sensor Initialisierungsbeispiel
		// UltraschallSensor ultra = new UltraschallSensor(<PORT>);
		// TastSensor taster1 = new TastSensor(<PORT>);
		// TastSensor taster2 = new TastSensor(<PORT>);

		// # Kommazahl (float) in Ganzzahl (int) konvertieren
		// float kommaZahl1 = 4.2f;
		// int ganzZahl1 = Math.round(kommaZahl1);
		
		// # Kommazahl (float) in Text(String) konvertieren
		// float kommaZahl2 = 4.2f;
		// String text2 = Float.toString(kommaZahl2);
		
		// # Kommazahl mit zwei Nachkommastellen in Text (String) konvertieren
		// float kommazahl3 = 4.2f;
		// String text3 = String.format("%.2f", kommazahl3);
	}
}
