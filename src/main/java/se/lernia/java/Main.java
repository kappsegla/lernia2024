package se.lernia.java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String s = "Heja";
        System.out.println(letterCounter(s));
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
}

//Todo: Skriv en metod som tar en String som inparameter och returnerar hur många a det finns
//Todo: Skriv en metod som tar två String som inparametrar och returnerar true eller false om de är lika eller olika
//Todo: Skapa en metod som ovan men som ignorerar case vid jämförelsen

//Todo: Skapa en metod som tar en string innehållande siffror som inparameter och tar bort inledande nollor. Input: 00000123569 Output : 123569
//Todo: Skapa en metod som returnerar en String reversed
//Todo: Skapa en metod som returnerar true om en String är ett palindrom
