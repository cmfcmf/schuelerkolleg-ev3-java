package de.hpi.schuelerkolleg.ev3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import lejos.hardware.lcd.LCD;
import lejos.remote.nxt.NXTConnection;
import lejos.utility.Delay;

public class Connector {

	public static void main(String[] args) {
		//Auf Verbindung warten
		NXTConnection connection = BluetoothVerbindung.connect("11");
		
		//Ein- und Ausgabe öffnen
		DataInputStream input = connection.openDataInputStream();
		DataOutputStream output = connection.openDataOutputStream();
		
		//Try und catch sind dazu da Fehler zu fangen, die auftreten
		try {
			//Int senden, alternativ funktionieren auch writeChar(), writeFloat(), writeDouble(),
			//und writeBoolean()
			output.writeInt(2000);
			//Ohne flush() wird nichts gesendet!
			output.flush();
		} catch (IOException e) {
			LCD.drawString("Write exception", 0, 1);
			Delay.msDelay(3000);
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
