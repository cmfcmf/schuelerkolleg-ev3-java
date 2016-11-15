package de.hpi.schuelerkolleg.ev3.letztesmal;

import de.hpi.schuelerkolleg.ev3.Pilot;
import de.hpi.schuelerkolleg.ev3.TastSensor;
import lejos.robotics.navigation.MovePilot;

public class E2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovePilot pilot = Pilot.initPilot();
		TastSensor taster1 = new TastSensor(1);
		TastSensor taster2 = new TastSensor(4);
		boolean wert1 = taster1.isDown();
		boolean wert2 = taster2.isDown();
		while(true){
			pilot.forward();
			taster1.waitForPress();
			pilot.backward();
			taster2.waitForPress();
			pilot.forward();
			if(wert1 == true&&wert2 == true ){
				
			}}
	}}


