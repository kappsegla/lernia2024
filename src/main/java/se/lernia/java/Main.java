package se.lernia.java;

import java.text.Collator;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        printEvenNumbers();

        String s = "Heja";
        System.out.println(letterCounter(s));

        System.out.println(wordComparerIgnoreCase("aA", "Aa"));

        boolean palin = isPalindrome("racecar");
        System.out.println(palin);

        System.out.println(trimZero("00000123506"));
        System.out.println(trimZero("000100"));
        System.out.println(trimZero("0000"));
    }

    private static String trimZero(String number) {
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) != '0') {
                return number.substring(i);
            }
        }
        throw new RuntimeException("String with only zeros or other non digits found");
    }

    public static boolean isPalindrome(String word) {
        return wordComparerIgnoreCase(word, reverse(word));
    }

    public static int letterCounter(String word) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }

    public static boolean wordComparerIgnoreCase(String word1, String word2) {
        return word1.equalsIgnoreCase(word2);
    }

    public static String reverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    public static void printEvenNumbers(){
        for (int i = 2; i <= 10; i++) {
            if( i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}


//Todo: Skapa en metod som skriver ut jämna tal 2 4 6 osv...

//Todo: Skapa en metod som tar en string innehållande siffror som inparameter och tar bort inledande nollor.
// Input: 00000123569 Output : 123569
// Input: 000100 Output: 100
