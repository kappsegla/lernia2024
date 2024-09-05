package se.lernia.java.functional;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

public class Pure {

    //Pure method, output depends only on parameters
    public static int add(int a, int b) {
        return a + b;
    }


    public static int counter = 0;

    //Not pure, output depends on other things than parameters
    //Has side effects, modifies static variable
    public static int amount() {
        return ++counter;
    }

    //Not pure, random changes the output randomly
    public static double randomZeroToHero(int max) {
        return max * Math.random();
    }

    //Pure? If same random object?
    public static double randomZeroToHero(int max, Random random) {
        return max * random.nextDouble();
    }

    //Not pure, now changes everytime we call the method
    public static String greeting(final String name) {
        if (LocalTime.now().isBefore(LocalTime.of(12, 0)))
            return "Good morning " + name;
        return "Good afternoon " + name;
    }

    //Pure, output depends only on input parameters
    public static String greeting(final String name, LocalTime time) {
        if (time.isBefore(LocalTime.of(12, 0)))
            return "Good morning " + name;
        return "Good afternoon " + name;
    }
}
