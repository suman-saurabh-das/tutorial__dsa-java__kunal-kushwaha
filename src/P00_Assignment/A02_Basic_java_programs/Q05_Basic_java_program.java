package P00_Assignment.A02_Basic_java_programs;

// 05. Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class Q05_Basic_java_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " is largest");
        } else {
            System.out.println(num2 + " is largest");
        }
        sc.close();
    }
}
