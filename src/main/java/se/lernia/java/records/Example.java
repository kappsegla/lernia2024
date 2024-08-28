package se.lernia.java.records;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Scanner;

public class Example {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Car car = new Car("Volvo", "EX30", 2024);
        Car car2 = car.with(2025);

        System.out.println(car.model());

        changeRegisteredAdress(car,
                new Adress(
                        new Road("First Road"),
                        City.of("New City"),
                        "Greatest state of them all",
                        "Greates country in the world")
        );
        //LocalTime
        //LocalDate
        //LocalDateTime
        String text = "Hej på dig";
        String input = scanner.nextLine();
        input = input.intern();

        System.out.println(text == input);
        System.out.println(text.equals(input));

        String input2 = scanner.nextLine().intern();
        int i = 1;
        Integer integerObject = Integer.valueOf(i);
        double d = 2.0;
        Double d2 = Double.valueOf(d);

        int sum = sum(integerObject,2);
        System.out.println(sum);
    }
    //Boxing of primitive values
    public static int sum(int a, Integer b) {
        return a + b;  //b is unboxed automatically
    }

    public static OwnerInfo retriveOwnerInformation(Car car) {
        //Some code..
        return new OwnerInfo(4, "Martin", LocalDateTime.of(2024, 6, 24, 12, 40));
    }

    public static void changeRegisteredAdress(Car car, Adress adress) {

    }
}

record City(String name) {

    private static HashMap<String, City> cities = new HashMap<>();

    public static City of(String name) {
        //Reuse city objects with same name
        if (cities.containsKey(name))
            return cities.get(name);
        City city = new City(name);
        cities.put(name, city);
        return city;
    }

}

//Immutable - can't modify the information/state of an object
//Can be used as data transfer objects - DTO
record Car(String manufacturer, String model, int year) {
    public Car with(int year){
        return new Car(manufacturer, model, year);
    }
}

record OwnerInfo(int count, String currenOwner, LocalDateTime latestChange) {
}

record Adress(Road street, City city, String state, String country) {
}


record Road(String name) {
}
