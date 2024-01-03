/* Write a program to reverse a number of minimum 5 length number? */

package shubham;

public class ReverseNumber {

	public static void main(String[] args) {
		int number = 12345 , reverse = 0;
		while(number!=0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println("The reverse of the given number is " + reverse);
	}
}
