package de.hpi.schuelerkolleg.ev3.letztesmal;

import de.hpi.schuelerkolleg.ev3.TastSensor;
import de.hpi.schuelerkolleg.ev3.UltraschallSensor;
import lejos.hardware.Sound;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;
import lejos.utility.Delay;

public class F2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TastSensor taster1 = new TastSensor(3);
		TastSensor taster2 = new TastSensor(2);
		RegulatedMotor w1 = new EV3LargeRegulatedMotor(MotorPort.B);
		RegulatedMotor w2 = new EV3LargeRegulatedMotor(MotorPort.C);
		UltraschallSensor ultraschall = new UltraschallSensor(4);
		while(true) {
			double freq = ultraschall.getDistance();
			freq = freq * 1000;
			Sound.playTone((int)freq,100);
			}
		
			

	}

}
