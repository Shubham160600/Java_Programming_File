/* Write an application that ask the user to enter two integers obtain them from the user and print their sum, product, difference and quotient 
 * (division). */


package shubham;

import java.util.Scanner;

public class Application {
    public static void main(String[] args){
    	Scanner in = new Scanner(System.in);
        System.out.print("Enter first integer : ");
        int firstInteger = in.nextInt();

        System.out.print("Enter second integer : ");
        int secondInteger = in.nextInt();

        System.out.printf("Sum of two integers: %d%n",firstInteger+secondInteger);
        System.out.printf("Product of two integers: %d%n",firstInteger*secondInteger);
        System.out.printf("Difference of two integers: %d%n",firstInteger-secondInteger);
        System.out.printf("Division of two integers: %d%n",firstInteger/secondInteger);

    }
}
