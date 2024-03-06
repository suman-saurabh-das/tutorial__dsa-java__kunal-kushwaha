package P02_Conditionals_and_Loops;

// Q. Print the nth fibonacci number

import java.util.Scanner;

public class P5_Fibonacci_sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        int a = 0, b = 1, count = 3;
        if (n == 1) {
            System.out.println(a);
        } else if (n == 2) {
            System.out.println(b);
        } else {
            while (count <= n) {
                int temp = b;
                b = a + b;
                a = temp;
                count++;
            }
            System.out.println(b);
        }
        sc.close();
    }
}
