/* To create a Java program using classes and objects. */

package Shubham;

class Person {
	//Instance Variables
	String name;
	int age;
	
	//Constructor
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	//Method to display information about the person
	public void displayInfo() {
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
	}
}
public class class_and_object {
	public static void main(String[] args) {
		
		//Create an object of the Person class
		Person person1 = new Person("Shubham",22);
		
		//Call the displayInfo() method on the object
		person1.displayInfo();
	}
}
