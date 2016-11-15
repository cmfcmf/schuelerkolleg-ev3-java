package de.hpi.schuelerkolleg.ev3.letztesmal;

import java.util.Random;

import de.hpi.schuelerkolleg.ev3.Pilot;
import de.hpi.schuelerkolleg.ev3.UltraschallSensor;
import lejos.robotics.navigation.MovePilot;
import lejos.utility.Delay;

public class C3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UltraschallSensor ultraschall = new UltraschallSensor(2);
		MovePilot pilot = Pilot.initPilot();  
		Random zufallsgenerator = new Random(); 
		  
		int x = zufallsgenerator.nextInt(350) + 45;
		
		while(true) {
			if (ultraschall.getDistance() == 5){ 
				pilot.stop(); 
				Delay.msDelay(1000);
				pilot.rotate(x);
			}
		}
		
	}

}

