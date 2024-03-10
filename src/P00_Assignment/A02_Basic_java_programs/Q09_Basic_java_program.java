package P00_Assignment.A02_Basic_java_programs;

// 09. To find Armstrong Number between two given number.

import java.util.Scanner;

public class Q09_Basic_java_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers to be checked : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int n1 = num1, sumOfCube1 = 0;
        while (n1 > 0) {
            int rem = n1 % 10;
            sumOfCube1 = sumOfCube1 + (rem * rem * rem);
            n1 = n1 / 10;
        }
        if (sumOfCube1 == num1) {
            System.out.println(num1 + " is an Armstrong number.");
        } else {
            System.out.println(num1 + " is not an Armstrong number.");
        }
        int n2 = num2, sumOfCube2 = 0;
        while (n2 > 0) {
            int rem = n2 % 10;
            sumOfCube2 = sumOfCube2 + (rem * rem * rem);
            n2 = n2 / 10;
        }
        if (sumOfCube2 == num2) {
            System.out.println(num2 + " is an Armstrong number.");
        } else {
            System.out.println(num2 + " is not an Armstrong number.");
        }
        sc.close();
    }
}
