package P00_Assignment.A01_Flow_of_programs;

// 02. Take two numbers and print the sum of both.

import java.util.Scanner;

public class Q02_Flow_of_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers : ");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float sum = num1 + num2;
        System.out.println("Sum of 2 numbers is : " + sum);
        sc.close();
    }
}
