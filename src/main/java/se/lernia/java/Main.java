package se.lernia.java;

import java.text.Collator;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String s = "Heja";
        System.out.println(letterCounter(s));

        System.out.println(wordComparerIgnoreCase("aA", "Aa"));
    }

    public static int letterCounter(String word) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)== 'a') {
                count++;
            }
        }
        return count;
    }

    public static boolean wordComparerIgnoreCase(String word1, String word2){
        return word1.equalsIgnoreCase(word2);
    }

    public static String reverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}


//Todo: Skapa en metod som returnerar en String reversed
//Todo: Skapa en metod som tar en string innehållande siffror som inparameter och tar bort inledande nollor. Input: 00000123569 Output : 123569
//Todo: Skapa en metod som returnerar true om en String är ett palindrom
