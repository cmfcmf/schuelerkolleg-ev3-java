package de.hpi.schuelerkolleg.ev3;

import java.util.Collection;

import lejos.hardware.Bluetooth;
import lejos.hardware.LocalBTDevice;
import lejos.hardware.RemoteBTDevice;
import lejos.hardware.lcd.LCD;
import lejos.remote.nxt.NXTCommConnector;
import lejos.remote.nxt.NXTConnection;
import lejos.utility.Delay;

public class BluetoothVerbindung {
	
	private static RemoteBTDevice getDevice(String name) {
		LocalBTDevice lbt = Bluetooth.getLocalDevice();
		Collection<RemoteBTDevice> pairedDevices = lbt.getPairedDevices();
		RemoteBTDevice remoteDevice = pairedDevices.stream()
													.filter(x -> x.getName() == name)
													.findFirst()
													.get();
		return remoteDevice;
	}
	
	public static NXTConnection connect(String name) {		
		NXTCommConnector connector = Bluetooth.getNXTCommConnector();
		NXTConnection connection = connector.connect(name, NXTConnection.PACKET);
		
		if(connection == null) {
			LCD.drawString("Es konnte keine Verbindung hergestellt werden", 0, 0);
			Delay.msDelay(2000);
			System.exit(1);
		}
		return connection;
	}
	
	public static NXTConnection waitforConnection() {
		NXTCommConnector connector = Bluetooth.getNXTCommConnector();
		NXTConnection connection = connector.waitForConnection(20000, NXTConnection.PACKET);
		
		if(connection == null) {
			LCD.drawString("Es konnte keine Verbindung hergestellt werden", 0, 0);
			Delay.msDelay(2000);
			System.exit(1);
		}
		return connection;
	}
}
