package week3;

import javax.swing.*;
import java.util.Random;

class Game {
    int wins;
    int count;

    //    Secret is assigned a random value between 1-10 inclusive.
    private Random random = new Random();
    int secret = random.nextInt(10) + 1;

    public static void main(String[] args) {

        String user_input = JOptionPane.showInputDialog(null, "Enter a Guess!");


        while (user_input !=)
    }

    void makeGuess(int value) {
        if (value == secret) {
            wins++;
        }
        count++;


    }
}
