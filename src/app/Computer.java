package app;

import java.util.Random;

// player 2 : computer
public class Computer {
    private int victory;

    // counter computer wins
    protected void CounterVictories() { this.victory++; }

    public int GenerateRandomNumber() {
        Random randomNumber = new Random();
        return randomNumber.nextInt(3);
    }

    public String Historic() {
        return "Number of Computer Victories: " + victory;
    }
}
