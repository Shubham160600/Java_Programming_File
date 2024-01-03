/* To create a java program to implement the string operation.
 */

package shubham;

public class StringOperations {
    public static void main(String[] args) {
    	String str1="Hello";
    	String str2="World";

        // Concatenation
    	String result = str1 + " "+str2;
        System.out.println("Concatenation: " + result);

        // length
        int length = result.length();
        System.out.println("Length: " + length);

        // Substring
        String substring = result.substring(6,11);
        System.out.println("Substring: " + substring);
        // Uppercase
        String uppercase = result.toUpperCase();
        System.out.println("Uppercase: " + uppercase);

        // Lowercase
        String lowercase = result.toLowerCase();
        System.out.println("Lowercase: " + lowercase);

        // Replace
        String replaced = result.replace("World", "Java");
        System.out.println("Replace: " + replaced);
        
        //Split
        String[] splitArray=result.split(" ");
        System.out.print("Split: ");
        for(String str: splitArray) {
        	System.out.print(str+" ");
        }
        System.out.println();
        
        // Check if a string contains a specific substring
        boolean containsSubstring=result.contains("Hello");
        System.out.println("Contains 'Hello': "+containsSubstring);
        
        //Check if two strings are equal
        boolean areEqual=str1.equals(str2);
        System.out.println("Are equal: " + areEqual);
    }
}

