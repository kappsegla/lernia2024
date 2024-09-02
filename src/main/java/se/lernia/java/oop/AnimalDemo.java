package se.lernia.java.oop;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;

public class AnimalDemo {



    public static void main(String[] args) {
        Animal animal = new Dog();
        Animal animal2 = new Horse();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(animal);
        animals.add(animal2);

        animal.saySomething();
        animal2.saySomething();
    }
}

interface Animal {
    void saySomething();
}

interface VaccinationStatus {
   boolean isVaccinated();
}


class Dog extends Object implements Animal, VaccinationStatus {
    @Override
    public void saySomething() {
        System.out.println("Voff");
    }

    @Override
    public boolean isVaccinated() {
        return false;
    }
}

class Horse implements Animal {
    @Override
    public void saySomething() {
        System.out.println("Gnägg");
    }
}
