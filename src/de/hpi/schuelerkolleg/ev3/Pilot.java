package de.hpi.schuelerkolleg.ev3;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.chassis.Chassis;
import lejos.robotics.chassis.Wheel;
import lejos.robotics.chassis.WheeledChassis;
import lejos.robotics.navigation.MovePilot;

public class Pilot {

	public static MovePilot initPilot() {
		return initPilot(5.2); //f�r Standardwerte (Speed) 5.1 benutzen
	}
	
	public static MovePilot initPilot(double diameter) {
		EV3LargeRegulatedMotor b = new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor c = new EV3LargeRegulatedMotor(MotorPort.C);
		Wheel wheel1 = WheeledChassis.modelWheel(b, diameter).offset(-6);
		Wheel wheel2 = WheeledChassis.modelWheel(c, diameter).offset(6);
		Chassis chassis = new WheeledChassis(new Wheel[] { wheel1, wheel2 }, WheeledChassis.TYPE_DIFFERENTIAL);
		MovePilot pilot = new MovePilot(chassis);
		pilot.setLinearSpeed(20);
		pilot.setAngularSpeed(90);
		return pilot;
	}
}
