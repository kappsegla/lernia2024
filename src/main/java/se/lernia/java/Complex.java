package se.lernia.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Complex {

    //This scanner object lives during the whole application and is used for reading from keyboard.
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        stackOverflow();
    }

    public static void stackOverflow() {
        int scorePlayer1 = 0;
        int scorePlayer2 = 0;

        //Fråga användaren efter namn?
        System.out.print("Please enter your name ");
        String name = sc.nextLine();
        System.out.println("Please enter your starting score");
        int startingScore = 0;
        try {
            startingScore = sc.nextInt();
        } catch (InputMismatchException e) {
            //Handle invalid inputs here
            System.out.println("You can't do that. You will get zero as score");
        }
        sc.nextLine(); //To remove trailing return after nextInt()

        Player player1 = new Player(name, startingScore);
        player1.increaseScore();
        System.out.println(player1.getName() + " has score " + player1.getScore());
        System.out.printf("%s has score %d\n", player1.getName(), player1.getScore());

        System.out.println("Please enter player twos name");
        String player2Name = sc.nextLine();
        System.out.println("You entered player twos name as " + player2Name);
        System.out.println("Please enter starting score for player 2");
    }


}
