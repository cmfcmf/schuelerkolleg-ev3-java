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
        	/*
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
        	put("b0",233.08f);
        	put("h0", 246.94f);
        	*/
        	put("c0", 261.63f);
        	put("c#0",277.18f);
        	put("db0",277.18f);
        	put("d0", 293.66f);
        	put("d#0", 311.13f);
        	put("eb0",311.13f);
        	put("e0",329.63f);
        	put("f0", 349.23f);
        	put("f#0",369.99f);
        	put("gb0", 369.99f);
        	put("g0", 392.0f);
        	put("g#0", 415.3f);
        	put("ab0", 415.3f);
        	put("a0", 440.0f);
        	put("a#0", 466.16f);
        	put("b0",466.16f);
        	put("h0",493.88f);
        	put("c1", 523.25f);
        	put("c#1",554.37f);
        	put("db1", 554.37f);
        	put("d1", 587.33f);
        	put("d#1", 622.25f);
        	put("eb1", 622.25f);
        	put("e1", 659.26f);
        	put("f1", 698.46f);
        	put("f#1",739.99f);
        	put("gb1", 739.99f);
        	put("g1", 783.99f);
        	put("g#1",830.61f);
        	put("ab1", 830.61f);
        	put("a1", 880.0f);
        	put("a#1", 932.33f);
        	put("b1", 932.33f);
        	put("h1", 987.77f);
        	put("c2",1046.5f);
        }
    };

    /*
    Use this method to retrieve the frequency according to a musical note as c0 or d#1.
     */
    public static int get(String note) {
        return (int) Math.round(Frequencies.frequencyMap.get(note));
    }
}
