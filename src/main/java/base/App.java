package base;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Marc-Anthony Cross
 */

/*
 * You’ll often write programs that deal with numbers. And depending on the programming language you use, you’ll have to convert the inputs you get to numerical data types.
 *
 * Write a program that prompts for two numbers. Print the sum, difference, product, and quotient of those numbers as shown in the example output:
 * Example Output
 *
 * What is the first number? 10
 * What is the second number? 5
 * 10 + 5 = 15
 * 10 - 5 = 5
 * 10 * 5 = 50
 * 10 / 5 = 2
 *
 * Constraints
 *
 *     Values coming from users will be strings. Ensure that you convert these values to numbers before doing the math.
 *     Keep the inputs and outputs separate from the numerical conversions and other processing.
 *     Generate a single output statement with line breaks in the appropriate spots.
 *
 * Challenges
 *
 *     Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
 *     Don’t allow the user to enter a negative number.
 *     Break the program into functions that do the computations.
 *     Implement this program as a GUI program that automatically updates the values when any value changes.
 *
 */

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        String first = myApp.getFirstNum();
        String second = myApp.getSecondNum();
        int sum = myApp.getSum(first, second);
        int diff = myApp.getDifference(first, second);
        int product = myApp.getProduct(first, second);
        int quotient = myApp.getQuotient(first, second);
        String outputString = myApp.generateOutput(first, second,sum, diff, product, quotient);
        myApp.printOutput(outputString);
    }

    private String getFirstNum() {
        System.out.print("What is the first number? ");
        String first = in.nextLine();
        return first;
    }

    private String getSecondNum() {
        System.out.print("What is the second number? ");
        String second = in.nextLine();
        return second;
    }

    private void printOutput(String outputString) {
        System.out.println(outputString);

    }

    private String generateOutput(String first, String second, int sum, int diff, int product, int quotient) {
        return first + " + " + second + " = " + sum + "\n" + first + " - " + second + " = " + diff + "\n" +
                first + " * " + second + " = " + product + "\n" + first + " / " + second + " = " + quotient;
    }

    private int getSum(String first, String second) {
         return Integer.parseInt(first) + Integer.parseInt(second);
    }

    private int getDifference(String first, String second) {
        return Integer.parseInt(first) - Integer.parseInt(second);
    }

    private int getProduct(String first, String second) {
        return Integer.parseInt(first) * Integer.parseInt(second);
    }

    private int getQuotient(String first, String second) {
        return Integer.parseInt(first) / Integer.parseInt(second);
    }


}
