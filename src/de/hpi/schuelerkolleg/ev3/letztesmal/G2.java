package de.hpi.schuelerkolleg.ev3.letztesmal;

import de.hpi.schuelerkolleg.ev3.Pilot;
import de.hpi.schuelerkolleg.ev3.TastSensor;
import lejos.robotics.navigation.MovePilot;

public class G2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovePilot pilot = Pilot.initPilot();
	
		TastSensor taster = new TastSensor(1);
		
		
		
		while(taster.isUp()){		
			pilot.forward();
			
			}
		}
	}

