package se.lernia.java.functional;

import java.util.List;

public class StreamDemo {

    public static void main(String[] args) {
        List<String> list = List.of("Martin", "Kalle", "Anna", "Rasmus", "Åke", "Kalle");

        var countNamesWithMoreThan4Chars = list.stream()
                .filter(s -> s.length() > 4)
                .count();

        var nameLengthSum = list.stream()
                .map(String::length)
                .mapToInt(Integer::intValue)
                .sum();

        var uniqueNames = list.stream()
                .filter(s -> s.length() > 4)
                .distinct()
                .count();
        System.out.println(uniqueNames);

        System.out.println(countNamesWithMoreThan4Chars);
        System.out.println(nameLengthSum);

        var longNames = list.stream()
                .filter(s -> s.length() > 5)
                .toList();

        longNames.forEach(System.out::println);

        var first3LetterName = list.stream()
                .filter(s -> s.length() == 3)
                .findFirst();

        first3LetterName.ifPresent(System.out::println);


    }
}
