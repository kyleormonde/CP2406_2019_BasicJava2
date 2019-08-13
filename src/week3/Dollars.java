package week3;

import javax.swing.*;

public class Dollars {
    public static void main(String[] args) {
        String user_input = JOptionPane.showInputDialog("Enter a currency to break into denominations");
        float currency = Integer.parseInt(user_input);

        float twenties = currency % 20;
        float tens = twenties % 10;
        float fives = tens % 5;
        float ones = fives % 1;


    }
}
