/* Write a Java application that uses looping to print the following table of values:
 * https://holooly.com/wp-content/uploads/2020/10/yyyy.png */


package shubham;

public class Application { // begin class
	public static void main(String[] args) { // begin the main method
		int counter=1; // initialize variables
		System.out.printf("N\t10*N\t100*N\t1000*N\n\n", counter, counter*10, counter*100, counter*1000); // display header
		for (counter=1; counter<=5;counter++){ // loop five times, 1 to 5
		System.out.printf("%d\t%d\t%d\t%d\n", counter, counter*10, counter*100, counter*1000); // display the table of values
		}
		}
}