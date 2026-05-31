package com.abd.model;


import java.awt.Component;
import javax.swing.JOptionPane;

public class Calculator {
    public Calculator() {
    }

    static void alert(String message) {
        JOptionPane.showMessageDialog((Component)null, message);
    }

    static double calculatorFunction(double x, double y, int choice) {
        double result = (double)0.0F;
        switch (choice) {
            case 1:
                result = x + y;
                break;
            case 2:
                result = x - y;
                break;
            case 3:
                result = x * y;
                break;
            case 4:
                if (y == (double)0.0F) {
                    JOptionPane.showMessageDialog((Component)null, "Denominator can't be zero!!", "Error", 0);
                    return Double.NaN;
                }

                result = x / y;
                break;
            default:
                throw new IllegalArgumentException("Invalid choice!");
        }

        return result;
    }

    public static void main(String[] args) {
        String menu = "Menu:\n    1. Addition\n    2. Subtraction\n    3. Multiplication\n    4. Division\n    5. Exit\nEnter your choice (1-5):";

        while(true) {
            String choiceStr = JOptionPane.showInputDialog((Component)null, menu, "Calculator", 3);
            if (choiceStr == null) {
                break;
            }

            int choice = 0;

            try {
                choice = Integer.parseInt(choiceStr.trim());
            } catch (NumberFormatException var13) {
                alert("Invalid choice!");
            }

            if (choice == 5) {
                alert("Exiting...");
                break;
            }

            if (choice >= 1 && choice <= 5) {
                try {
                    String num1Str = JOptionPane.showInputDialog((Component)null, "Enter first number:");
                    if (num1Str != null) {
                        double num1 = Double.parseDouble(num1Str);
                        String num2Str = JOptionPane.showInputDialog((Component)null, "Enter second number:");
                        if (num2Str != null) {
                            double num2 = Double.parseDouble(num2Str);
                            double ans = calculatorFunction(num1, num2, choice);
                            if (!Double.isNaN(ans)) {
                                alert("The answer is: " + ans);
                            }
                        }
                    }
                } catch (NumberFormatException var12) {
                    alert("Invalid choice!");
                }
            } else {
                alert("Invalid choice!");
            }
        }

    }
}

