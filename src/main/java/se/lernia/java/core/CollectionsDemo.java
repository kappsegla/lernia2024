package se.lernia.java.core;

import java.util.*;
import java.util.function.Consumer;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        var linkedList = new LinkedList<String>();

        list.add("A");
        list.add("B");

        linkedList.add("C");

        printList(list);
        printList(linkedList);

        Set<Snake> set = new HashSet<>();
        set.add(new Snake("Kalle",15));
        set.add(new Snake("Ká",600));
        set.add(new Snake("Kalle",14));
        set.add(new Snake("Kalle",14));

        set.forEach(System.out::println);

        Set<String> names = new HashSet<>();
        Consumer<Snake> snakeConsumer = snake -> names.add(snake.name());

        //Implementation of functional interface using lambda expression
        set.forEach(snake -> names.add(snake.name()));

        //Method reference
        names.forEach(CollectionsDemo::test);
        names.forEach(System.out::println);
    }

    public static void test(String name){
        System.out.println(name);
    }
    public static void printList(List<String> list) {
        list.forEach(System.out::println);
    }
}

record Snake(String name, int length){}

@FunctionalInterface
interface Test{
    void test();
}
