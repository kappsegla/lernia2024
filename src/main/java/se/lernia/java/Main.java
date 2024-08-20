package se.lernia.java;

public class Main {

    public static void main(String[] args) {

        int result =max(10, 5);
        System.out.println(result);

        float averageValue = average(15.4f, 4.3f);
        System.out.println(averageValue);

        averageValue = average(15.4f, 4.3f, 1.0f);
        System.out.println(averageValue);
    }

    static int max(int tal1, int tal2) {
        if (tal1 > tal2) {
            return tal1;
        }
        return tal2;
    }

    static float average(int number1, int number2){
        return (number1 + number2) / 2.0f;
    }
    static float average(float number1, float number2){
        return (number1 + number2) / 2;
    }
    //This is method overloading, multiple methods with same name but different parameters.
    static float average(float number1, float number2, float number3){
        return (number1 + number2 + number3) / 3;
    }

}

//Todo: Skriv en metod som tar 3 float som inparametrar och returnerar medelvärdet
//Todo: Skriv en metod som tar MÅNGA värden och returnerar medelvärdet... (Olika sätt att lösa det på finns)

//Todo: Skriv en metod som tar en String som inparameter och returnerar hur många a det finns
//Todo: Skriv en metod som tar två String som inparametrar och returnerar true eller false om de är lika eller olika
//Todo: Skapa en metod som ovan men som ignorerar case vid jämförelsen

//Todo: Skapa en metod som tar en string innehållande siffror som inparameter och tar bort inledande nollor. Input: 00000123569 Output : 123569
//Todo: Skapa en metod som returnerar en String reversed
//Todo: Skapa en metod som returnerar true om en String är ett palindrom
