package se.lernia.java;

public class Player {
    private int score;
    private String name;

    //Constructor, same name as class, no return type
    Player(String name, int score) {
        if (score < 0)
            throw new IllegalArgumentException();
        this.name = name;
        this.score = score;
    }

    Player() {
        this.score = 0;
        this.name = "";
    }

    int getScore() {
        return score;
    }

    void increaseScore() {
        score += 1;
    }

    public String getName() {
        return name;
    }

}
