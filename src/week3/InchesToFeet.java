package week3;

import javax.swing.*;

public class InchesToFeet {
    public static void main(String[] args) {
        final int FEET = 12;

        String user_Input = JOptionPane.showInputDialog("Input an Integer");
        int inches = Integer.parseInt(user_Input);

        System.out.println("Inches to Feet is: " + (inches / FEET) + " feet and " + inches % FEET + " inches.");
    }
}
