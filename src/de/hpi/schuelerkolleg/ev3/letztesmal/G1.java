package de.hpi.schuelerkolleg.ev3.letztesmal;

import de.hpi.schuelerkolleg.ev3.Pilot;
import de.hpi.schuelerkolleg.ev3.UltraschallSensor;
import lejos.robotics.navigation.MovePilot;

public class G1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	MovePilot pilot = Pilot.initPilot();	
	
	UltraschallSensor ultraschall = new UltraschallSensor(1);
	
	 pilot.forward();
	 
	 	if(ultraschall.getDistance()){
		
	 		pilot.rotate(90);
		
		
	 		}	
		}	
	}
