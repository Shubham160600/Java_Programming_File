/* Write a Java program to reverse the letters present in the given string using array? */

package shubham;

public class Reverse {

	public static void main(String[] args) {
		String string = "Hello World";
		String reversedStr="";
		for(int i=string.length()-1; i>=0; i--) {
			reversedStr=reversedStr+string.charAt(i);
		}
		System.out.println("Original string: "+ string);
		System.out.println("Reversed of given string: "+ reversedStr);

	}

}
