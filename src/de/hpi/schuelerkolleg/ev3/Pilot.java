package de.hpi.schuelerkolleg.ev3;

import lejos.hardware.motor.Motor;
import lejos.robotics.chassis.Chassis;
import lejos.robotics.chassis.Wheel;
import lejos.robotics.chassis.WheeledChassis;
import lejos.robotics.navigation.MovePilot;

public class Pilot {

	public static MovePilot initPilot() {
		return initPilot(5.2); //für Standardwerte (Speed) 5.1 benutzen
	}
	
	public static MovePilot initPilot(double diameter) {
		Wheel wheel1 = WheeledChassis.modelWheel(Motor.B, diameter).offset(-6);
		Wheel wheel2 = WheeledChassis.modelWheel(Motor.C, diameter).offset(6);
		Chassis chassis = new WheeledChassis(new Wheel[] { wheel1, wheel2 }, WheeledChassis.TYPE_DIFFERENTIAL);
		MovePilot pilot = new MovePilot(chassis);
		pilot.setLinearSpeed(20);
		pilot.setAngularSpeed(90);
		return pilot;
	}
}
