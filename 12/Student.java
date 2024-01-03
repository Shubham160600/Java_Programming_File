/* Create a class called student with the following characteristics and behavior. Student is given a unique Roll number automatically starting 
with '1'. Student has name, address. He gives exam for three different subjects. The class should be able to provide the grade of the student on the 
basis of the following criterion. Total percentage grade
a. 80-100 "Excellent"
b. 65-80 "Good"
c. 50-65 "Pass"
d. <50 "Fail". */

package shubham;

import java.util.Scanner;

public class Student {
    private static int nextRollNumber = 1; // Automatic roll number generation starting with '1'
    private int rollNumber;
    private String name;
    private String address;
    private double subject1Marks;
    private double subject2Marks;
    private double subject3Marks;

    // Constructor to initialize the student with a unique roll number
    public Student(String name, String address) {
        this.rollNumber = nextRollNumber++;
        this.name = name;
        this.address = address;
    }

    // Method to take exam results for three subjects
    public void takeExam(double subject1Marks, double subject2Marks, double subject3Marks) {
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
    }

    // Method to calculate total percentage
    private double calculatePercentage() {
        return (subject1Marks + subject2Marks + subject3Marks) / 3.0;
    }

    // Method to determine the grade based on the total percentage
    public String calculateGrade() {
        double percentage = calculatePercentage();

        if (percentage >= 80 && percentage <= 100) {
            return "Excellent";
        } else if (percentage >= 65 && percentage < 80) {
            return "Good";
        } else if (percentage >= 50 && percentage < 65) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    // Display student details
    public void displayDetails() {
        System.out.println("\nStudent Details");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Subject 1 Marks: " + subject1Marks);
        System.out.println("Subject 2 Marks: " + subject2Marks);
        System.out.println("Subject 3 Marks: " + subject3Marks);
        System.out.println("Total Percentage: " + calculatePercentage() + "%");
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student address: ");
        String address = scanner.nextLine();

        Student student = new Student(name, address);

        System.out.print("Enter marks for Subject 1: ");
        double subject1Marks = scanner.nextDouble();

        System.out.print("Enter marks for Subject 2: ");
        double subject2Marks = scanner.nextDouble();

        System.out.print("Enter marks for Subject 3: ");
        double subject3Marks = scanner.nextDouble();

        student.takeExam(subject1Marks, subject2Marks, subject3Marks);

        student.displayDetails();

        scanner.close();
    }
}
