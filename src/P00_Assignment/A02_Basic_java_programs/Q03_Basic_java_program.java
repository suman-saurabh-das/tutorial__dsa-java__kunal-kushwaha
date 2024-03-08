package P00_Assignment.A02_Basic_java_programs;

// 03. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class Q03_Basic_java_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal, time, and rate : ");
        float p = sc.nextFloat();
        float r = sc.nextFloat();
        float t = sc.nextFloat();
        float si = (p * r * t) / 100;
        System.out.println("Simple interest is : " + si);
        sc.close();
    }
}
