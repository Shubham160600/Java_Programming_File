/* Write a Java program to find odd or even number? */

package shubham;

import java.util.Scanner;
public class OddEven {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		if(number % 2 == 0) {
			System.out.println(number + " is an even number.");
		} else {
			System.out.println(number + " is an odd number.");
		}
		scanner.close();
	}
}
