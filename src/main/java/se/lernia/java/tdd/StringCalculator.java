package se.lernia.java.tdd;

import java.util.Arrays;

public class StringCalculator {
    public static int add(String s) {
        if( s.isEmpty() )
            return 0;

        return Arrays.stream(s.split("[,\n]"))
                .mapToInt(Integer::valueOf)
                .sum();
    }
}
