package P00_Assignment.A02_Basic_java_programs;

// 01. Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class Q01_Basic_java_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
        sc.close();
    }
}
