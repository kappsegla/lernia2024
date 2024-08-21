package se.lernia.java;

public class Complex {

    public static void main(String[] args) {
        stackOverflow();
    }

    public static void stackOverflow() {
        int scorePlayer1 = 0;
        int scorePlayer2 = 0;

        Player player1 = new Player("Martin", 0);
        player1.increaseScore();
        System.out.println(player1.getName() + " has score " +player1.getScore());

        Player player2 = new Player();

    }
}
