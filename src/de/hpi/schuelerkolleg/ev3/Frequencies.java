package de.hpi.schuelerkolleg.ev3;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.lang.Math;

/*
Utility class to provide frequencies in Hz according to given note name.
 */
public class Frequencies {
    private static Map<String, Float> frequencyMap = new HashMap<String, Float>() {
        {
        	put("C0", 130.81f);
        	put("C#0", 138.59f);
        	put("Db0",138.59f);
        	put("D0", 146.83f);
        	put("D#0",155.56f);
        	put("Eb0",155.56f);
        	put("E0",164.81f);
        	put("F0",174.61f);
        	put("F#0", 185.0f);
        	put("Gb0",185.0f);
        	put("G0", 196.0f);
        	put("G#0", 207.65f);
        	put("Ab0", 207.65f);
        	put("A0", 220.0f);
        	put("A#0", 233.08f);
        	put("Bb0",233.08f);
        	put("B0", 246.94f);
        	put("C1", 261.63f);
        	put("C#1",277.18f);
        	put("Db1",277.18f);
        	put("D1", 293.66f);
        	put("D#1", 311.13f);
        	put("Eb1",311.13f);
        	put("E1",329.63f);
        	put("F1", 349.23f);
        	put("F#1",369.99f);
        	put("Gb1", 369.99f);
        	put("G1", 392.0f);
        	put("G#1", 415.3f);
        	put("Ab1", 415.3f);
        	put("A1", 440.0f);
        	put("A#1", 466.16f);
        	put("Bb1",466.16f);
        	put("B1",493.88f);
        	put("C2", 523.25f);
        	put("C#2",554.37f);
        	put("Db2", 554.37f);
        	put("D2", 587.33f);
        	put("D#2", 622.25f);
        	put("Eb2", 622.25f);
        	put("E2", 659.26f);
        	put("F2", 698.46f);
        	put("F#2",739.99f);
        	put("Gb2", 739.99f);
        	put("G2", 783.99f);
        	put("G#2",830.61f);
        	put("Ab2", 830.61f);
        	put("A2", 880.0f);
        	put("A#2", 932.33f);
        	put("Bb2", 932.33f);
        	put("B2", 987.77f);
        	put("C3",1046.5f);
        }
    };

    /*
    Use this method to retrieve the frequency according to a musical note as C0 or D#1.
     */
    public static int get(String note) {
        return (int) Math.round(Frequencies.frequencyMap.get(note.toUpperCase(Locale.ROOT)));
    }
}
