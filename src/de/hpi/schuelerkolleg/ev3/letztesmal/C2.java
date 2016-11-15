package de.hpi.schuelerkolleg.ev3.letztesmal;


import de.hpi.schuelerkolleg.ev3.Pilot;
import de.hpi.schuelerkolleg.ev3.TastSensor;
import lejos.hardware.motor.Motor;
import lejos.robotics.chassis.Chassis;
import lejos.robotics.chassis.Wheel;
import lejos.robotics.chassis.WheeledChassis;
import lejos.robotics.navigation.MovePilot; 

public class C2 {
public static void main() {
	TastSensor taster = new TastSensor(1);
	TastSensor taster2 = new TastSensor(4);
	MovePilot pilot= Pilot.initPilot();
	
for (){ 
	if(taster.isDown()){
		pilot.stop(); 
	}
	else {
		pilot.forward(); 	
	}
}
}
}