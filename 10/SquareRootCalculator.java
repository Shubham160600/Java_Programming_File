/* Write a Java program to: a) Read a number from the keyboard. b) Write a try-throw-catch block to calculate the square root of the entered number.
An exception should be handled if the entered number is negative. Use the exception class.
 */

package shubham;

import java.util.Scanner;

public class SquareRootCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        try {
            if (number < 0) {
                throw new Exception("Number cannot be negative");
            }
            double squareRoot = Math.sqrt(number);
            System.out.println("Square root of " + number + " is " + squareRoot);

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());

        }
        scanner.close();
    }
}
