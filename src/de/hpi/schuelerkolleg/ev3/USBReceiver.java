package de.hpi.schuelerkolleg.ev3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import lejos.hardware.lcd.LCD;
import lejos.remote.nxt.NXTConnection;
import lejos.utility.Delay;

public class USBReceiver {

	public static void main(String[] args) {
		//Auf Verbindung warten
		NXTConnection connection = USBVerbindung.waitforConnection(); 
		
		//Ein- und Ausgabe öffnen
		DataInputStream input = connection.openDataInputStream(); 
		DataOutputStream output = connection.openDataOutputStream();
		
		//Try und catch sind dazu da Fehler zu fangen, die auftreten
		try {
			//Int empfangen, alternativ funktionieren auch readChar(), readFloat(), readDouble(),
			//und readBoolean()
			int n = input.readInt(); 
			LCD.clear();
			LCD.drawInt(n, 0, 1);
			Delay.msDelay(3000);
		} catch (IOException e) {
			LCD.clear();
			LCD.drawString("Read Exception", 0, 1);
		}
		
		try {
			//Aufräumen
			input.close();
			output.close();
			connection.close();
		} catch (IOException ioe){
			LCD.clear();
			LCD.drawString("Close Exception", 0, 1);
		} 
		
	}

}
