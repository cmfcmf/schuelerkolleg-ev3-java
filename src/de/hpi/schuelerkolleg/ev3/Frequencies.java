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
        	put("c0", 130.81f);
        	put("c#0", 138.59f);
        	put("db0",138.59f);
        	put("d0", 146.83f);
        	put("d#0",155.56f);
        	put("eb0",155.56f);
        	put("e0",164.81f);
        	put("f0",174.61f);
        	put("f#0", 185.0f);
        	put("gb0",185.0f);
        	put("g0", 196.0f);
        	put("g#0", 207.65f);
        	put("ab0", 207.65f);
        	put("a0", 220.0f);
        	put("a#0", 233.08f);
        	put("bb0",233.08f);
        	put("b0", 246.94f);
        	put("c1", 261.63f);
        	put("c#1",277.18f);
        	put("db1",277.18f);
        	put("d1", 293.66f);
        	put("d#1", 311.13f);
        	put("eb1",311.13f);
        	put("e1",329.63f);
        	put("f1", 349.23f);
        	put("f#1",369.99f);
        	put("gb1", 369.99f);
        	put("g1", 392.0f);
        	put("g#1", 415.3f);
        	put("ab1", 415.3f);
        	put("a1", 440.0f);
        	put("a#1", 466.16f);
        	put("bb1",466.16f);
        	put("b1",493.88f);
        	put("c2", 523.25f);
        	put("c#2",554.37f);
        	put("db2", 554.37f);
        	put("d2", 587.33f);
        	put("d#2", 622.25f);
        	put("eb2", 622.25f);
        	put("e2", 659.26f);
        	put("f2", 698.46f);
        	put("f#2",739.99f);
        	put("gb2", 739.99f);
        	put("g2", 783.99f);
        	put("g#2",830.61f);
        	put("ab2", 830.61f);
        	put("a2", 880.0f);
        	put("a#2", 932.33f);
        	put("bb2", 932.33f);
        	put("b2", 987.77f);
        	put("c3",1046.5f);
        }
    };

    /*
    Use this method to retrieve the frequency according to a musical note as C0 or D#1.
     */
    public static int get(String note) {
        return (int) Math.round(Frequencies.frequencyMap.get(note));
    }
}
