package de.hpi.schuelerkolleg.ev3.letztesmal;

import de.hpi.schuelerkolleg.ev3.Pilot;
import de.hpi.schuelerkolleg.ev3.TastSensor;
import de.hpi.schuelerkolleg.ev3.UltraschallSensor;
import lejos.robotics.navigation.MovePilot;

public class E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovePilot pilot = Pilot.initPilot();
		TastSensor taster1 = new TastSensor(1);
		TastSensor taster2 = new TastSensor(4);
		UltraschallSensor ultraschall = new UltraschallSensor(2);
		ultraschall.waitForWall(5)
				
				
			}
	}

	}

}
