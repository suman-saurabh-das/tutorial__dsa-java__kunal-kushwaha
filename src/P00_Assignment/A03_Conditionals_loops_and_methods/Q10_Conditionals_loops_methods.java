package P00_Assignment.A03_Conditionals_loops_and_methods;

// 12. Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

import java.util.Scanner;

public class Q10_Conditionals_loops_methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers (0 to exit) : ");
        int num = 1, sumOfNegativeNum = 0, sumOfPositiveNum = 0, sumOfPositiveOddNum = 0;
        while (num != 0) {
            num = sc.nextInt();
            if (num < 0) {
                sumOfNegativeNum = sumOfNegativeNum + num;
            }
            if (num > 0) {
                sumOfPositiveNum = sumOfPositiveNum + num;
            }
            if (num > 0 && num % 2 != 0) {
                sumOfPositiveOddNum = sumOfPositiveOddNum + num;
            }
        }
        System.out.println("Sum of negative numbers : " + sumOfNegativeNum);
        System.out.println("Sum of positive numbers : " + sumOfPositiveNum);
        System.out.println("Sum of positive odd number : " + sumOfPositiveOddNum);
        sc.close();
    }
}
