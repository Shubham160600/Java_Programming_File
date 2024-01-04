/* Write a program in java to demonstrate the utilization of interface in java? */

package shubham;

//An interface
interface Shape {
double getArea();
}

//A class that implements the Shape interface
class Circle implements Shape {
private double radius;

public Circle(double radius) {
 this.radius = radius;
}

@Override
public double getArea() {
 return Math.PI * radius * radius;
}
}

//A class that implements the Shape interface
class Rectangle implements Shape {
private double length;
private double width;

public Rectangle(double length, double width) {
 this.length = length;
 this.width = width;
}

@Override
public double getArea() {
 return length * width;
}
}

//A class that uses the Shape interface
public class Main {
public static void main(String[] args) {
 // Create a Circle object
 Shape circle = new Circle(5);

 // Create a Rectangle object
 Shape rectangle = new Rectangle(3, 4);

 // Get the area of the Circle object
 double circleArea = circle.getArea();

 // Get the area of the Rectangle object
 double rectangleArea = rectangle.getArea();

 // Print the areas of the Circle and Rectangle objects
 System.out.println("The area of the Circle is: " + circleArea);
 System.out.println("The area of the Rectangle is: " + rectangleArea);
}
}
