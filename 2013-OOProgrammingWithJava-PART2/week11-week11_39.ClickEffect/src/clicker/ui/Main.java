package clicker.ui;

import clicker.applicationlogic.Calculator;
import clicker.applicationlogic.PersonalCalculator;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        Calculator calc = new PersonalCalculator();
        System.out.println("Value: " + calc.giveValue());
        calc.increase();
        System.out.println("Value: " + calc.giveValue());
        calc.increase();
        System.out.println("Value: " + calc.giveValue());

        UserInterface ui = new UserInterface(new PersonalCalculator());
        SwingUtilities.invokeLater(ui);
    }
}
