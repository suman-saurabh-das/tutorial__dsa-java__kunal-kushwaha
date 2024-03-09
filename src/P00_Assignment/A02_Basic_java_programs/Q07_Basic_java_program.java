package P00_Assignment.A02_Basic_java_programs;

// 07. To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Q07_Basic_java_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n (should be greater than or equal to 2) : ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print("Fibonacci series : 0 1 ");
        while (n > 2) {
            int temp = b;
            b = a + b;
            a = temp;
            System.out.print(b + " ");
            n--;
        }
        sc.close();
    }
}
