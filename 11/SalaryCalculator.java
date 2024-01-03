/* Write a java program to calculate gross salary & net salary taking the following data.
Input:empno,empname,basic
 Process:
 DA=50% of basic, HRA=25% of basic, CCA=Rs240/-, PF=10% of basic, PT=Rs100/ */

package shubham;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter Employee Number: ");
        int empno = scanner.nextInt();

        System.out.print("Enter Employee Name: ");
        String empname = scanner.next(); // Assuming single-word names for simplicity

        System.out.print("Enter Basic Salary: ");
        double basic = scanner.nextDouble();

        // Process
        double da = 0.5 * basic;
        double hra = 0.25 * basic;
        double cca = 240;
        double pf = 0.1 * basic;
        double pt = 100;

        double grossSalary = basic + da + hra + cca;
        double netSalary = grossSalary - (pf + pt);

        // Output
        System.out.println("\nSalary Slip");
        System.out.println("Employee Number: " + empno);
        System.out.println("Employee Name: " + empname);
        System.out.println("Basic Salary: " + basic);
        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("CCA: " + cca);
        System.out.println("PF: " + pf);
        System.out.println("PT: " + pt);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
        scanner.close();
    }
}
