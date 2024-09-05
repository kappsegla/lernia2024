package se.lernia.java.functional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HigherOrder {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("Cdef");
        list.add("Abc");
        list.add("B");

        list.sort( sortingOrder() );
        list.forEach( System.out::println );

    }

    public static Comparator<String> sortingOrder(){
        return Comparator.comparing( String::length );
    }
}
