/**
 * 
 */
package de.hpi.schuelerkolleg.ev3.letztesmal;

import de.hpi.schuelerkolleg.ev3.Pilot;
import de.hpi.schuelerkolleg.ev3.TastSensor;
import de.hpi.schuelerkolleg.ev3.UltraschallSensor;
import lejos.robotics.navigation.MovePilot;

/**
 * @author christian.flach
 *
 */
public class C1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TastSensor taster1 = new TastSensor(3);
		TastSensor taster2 = new TastSensor(2);
		MovePilot pilot = Pilot.initPilot();
		UltraschallSensor ultraschall = new UltraschallSensor(1);
		
		pilot.forward();
		while (taster2.isUp()){
			
		}
		pilot.stop();
		
		
		 if (ultraschall.getDistance(5)){
			 pilot.stop();
			 }
		 else{
			 pilot.forward();	 
		}
		
		
		
		

		


	}

}
