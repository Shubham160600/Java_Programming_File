/* Create a java class which has method to find out the factorials of numbers from 1 to 10 using recursion? */

package shubham;

public class FactorialCalculator {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			long factorial = calculateFactorial(i);
			System.out.println("Factorial of " +i + "=" + factorial);
		}
	}
	public static long calculateFactorial(int number) {
		if(number==0||number==1) {
			return 1;
		} else {
			return number* calculateFactorial(number-1);
		}
	}
}
