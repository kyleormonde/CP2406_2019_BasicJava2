package week3;

import javax.swing.*;

public class Dollars {
    public static void main(String[] args) {
        String user_input = JOptionPane.showInputDialog("Enter a whole amount dollar to break into denominations");
        int currency = Integer.parseInt(user_input);

        int twenties = currency / 20;
        int tens = (currency % 20) / 10;
        int fives = (currency % 20 % 10) / 5;
        int ones = currency % 20 % 10 % 5;

        System.out.println("Twenties: " + twenties);
        System.out.println("Tens: " + tens);
        System.out.println("Fives: " + fives);
        System.out.println("Ones: " + ones);
    }
}
