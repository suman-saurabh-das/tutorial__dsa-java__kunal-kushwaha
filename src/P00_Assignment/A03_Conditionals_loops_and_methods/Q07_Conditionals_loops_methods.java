package P00_Assignment.A03_Conditionals_loops_and_methods;

// 07. Take integer inputs till the user enters 0 and print the largest number from all, print the sum of all numbers.
// (HINT: while loop).

import java.util.Scanner;

public class Q07_Conditionals_loops_methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers (0 to stop) : ");
        int sum = 0, num = 1, max = Integer.MIN_VALUE;
        while (num != 0) {
            num = sc.nextInt();
            sum = sum + num;
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Largest number : " + max + " Sum : " + sum);
        sc.close();
    }
}
