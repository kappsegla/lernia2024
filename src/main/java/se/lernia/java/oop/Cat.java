package se.lernia.java.oop;

import java.util.Objects;
//Encapsulation
//Abstraction
//Inheritance

public class Cat extends Object {
    private final String name;
    private final int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Jack", 18);
        Cat cat2 = new Cat("Jack", 18);

        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat2.getName());
        System.out.println(cat2.getAge());

        System.out.println(cat.equals(cat2));

    }

}
