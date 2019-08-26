package week3;

import javax.swing.*;
import java.util.Random;

class Game {
    int wins;
    int count;

    //    Secret is assigned a random value between 1-10 inclusive
    private Random random = new Random();
    int secret = random.nextInt(10) + 1;

    void makeGuess(int value) {
        count++;

        if (value == secret) {
            JOptionPane.showMessageDialog(null, "You Won!");
            wins++;

        } else {
            JOptionPane.showMessageDialog(null, "You fuckin lost idiot");
        }
    }
}
