package se.lernia.java.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Unmodifiable {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("B");
        list.add("C");
        list.add("A");

        List<String> copy = List.copyOf(list);
        List<String> unmodifiableList = Collections.unmodifiableList(list);
        List<String> myUnmodifiableList = new MyUnmodifiableList<>(list);
        list.add("D");
        var answer = evilListMethod(myUnmodifiableList);
    }

    public static String evilListMethod(List<String> strings){
        //strings.sort(String.CASE_INSENSITIVE_ORDER);
        //strings.add("E");
        strings.forEach(System.out::println);
        return "Done";
    }
}
