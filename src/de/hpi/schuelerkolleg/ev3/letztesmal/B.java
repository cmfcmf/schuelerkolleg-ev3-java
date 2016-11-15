package de.hpi.schuelerkolleg.ev3.letztesmal;

import de.hpi.schuelerkolleg.ev3.Pilot;
import de.hpi.schuelerkolleg.ev3.TastSensor;
import de.hpi.schuelerkolleg.ev3.UltraschallSensor;
import lejos.robotics.navigation.MovePilot;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TastSensor tasterlinks = new TastSensor(1);
TastSensor tasterrechts = new TastSensor(4);
int x = 1;	
int y = 1;
MovePilot pilot = Pilot.initPilot();
while(x==1){
	pilot.travel(3);
	if(tasterlinks.isDown()){
		 x=2;		
	
		
}
	if (tasterrechts.isDown()){
			x = 2;


		}

}

UltraschallSensor ultrschall = new UltraschallSensor (2);
int z = 1;
if(ultrschall.getDistance()<30){
	pilot.rotate(80);
	
}


	



 
	}

}
