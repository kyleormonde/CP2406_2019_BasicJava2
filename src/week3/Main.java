package week3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        String userInput = JOptionPane.showInputDialog("Enter A Number, BITCH! (1 - 10)");
        int userGuess = Integer.parseInt(userInput);

        game.makeGuess(userGuess);
    }
}
