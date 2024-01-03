/* Write a Java class to find out the area and parameter of rectangle and box by using super and this keyboard. */

package shubham;

class Rectangle {
    protected double length;
    protected double width;

    // Constructor for Rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area of rectangle
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter of rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Box extends Rectangle {
    private double height;

    // Constructor for Box
    public Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    // Method to calculate volume of box
    public double calculateVolume() {
        return length*width*height;
    }
    
    // Method to calculate surface area of box
    public double calculateSurfaceArea() {
    	double baseArea = calculateArea();
        double lateralArea = 2 * (length * height) + (width * height);
        return 2*baseArea + lateralArea;
    }
}

public class ShapeCalculator {
    public static void main(String[] args) {
        // Create a Rectangle
        Rectangle rectangle = new Rectangle(5, 8);
        double rectangleArea=rectangle.calculateArea();
        double rectanglePerimeter=rectangle.calculatePerimeter();
        
        Box box = new Box(3,4,5);
        double boxVolume=box.calculateVolume();
        double boxSurfaceArea=box.calculateSurfaceArea();

        // Calculate and display area and perimeter of the rectangle
        System.out.println("Rectangle: ");
        System.out.println("Area: " + rectangleArea);
        System.out.println("Perimeter: " + rectanglePerimeter);

        // Calculate and display surface area and volume of the box
        System.out.println("\nBox: ");
        System.out.println("Volume: " + boxVolume);
        System.out.println("SurfaceArea: " + boxSurfaceArea);
    }
}

