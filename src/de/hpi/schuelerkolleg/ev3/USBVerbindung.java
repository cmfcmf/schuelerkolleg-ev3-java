package de.hpi.schuelerkolleg.ev3;

import java.util.Collection;

import lejos.hardware.Bluetooth;
import lejos.hardware.LocalBTDevice;
import lejos.hardware.RemoteBTDevice;
import lejos.hardware.lcd.LCD;
import lejos.remote.nxt.NXTCommConnector;
import lejos.remote.nxt.NXTConnection;
import lejos.remote.nxt.SocketConnection;
import lejos.remote.nxt.SocketConnector;
import lejos.utility.Delay;

public class USBVerbindung {
	public static SocketConnection connect(String ip) {	
		LCD.clear();
		LCD.drawString("Verbinde...", 0, 0);
		LCD.drawString(ip, 0, 1);
		
		SocketConnector connector = new SocketConnector();
		SocketConnection connection = (SocketConnection)connector.connect(ip, NXTConnection.PACKET);
		
		if(connection == null) {
			LCD.drawString("Es konnte keine Verbindung hergestellt werden", 0, 0);
			Delay.msDelay(2000);
			System.exit(1);
		}
		
		LCD.clear();
		LCD.drawString("VERBUNDEN!!", 0, 0);
		
		return connection;
	}
	
	public static SocketConnection waitforConnection() {
		LCD.clear();
		LCD.drawString("Warte...", 0, 0);
		
		SocketConnector connector = new SocketConnector();
		SocketConnection connection = (SocketConnection)connector.waitForConnection(20000, NXTConnection.PACKET);
		
		if(connection == null) {
			LCD.drawString("Es konnte keine Verbindung hergestellt werden", 0, 0);
			Delay.msDelay(2000);
			System.exit(1);
		}
		
		LCD.clear();
		LCD.drawString("VERBUNDEN!!", 0, 0);
		
		return connection;
	}
}
