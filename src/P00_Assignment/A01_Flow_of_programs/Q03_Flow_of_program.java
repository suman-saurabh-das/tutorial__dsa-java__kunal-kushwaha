package P00_Assignment.A01_Flow_of_programs;

// 03. Take a number as input and print the multiplication table for it.

import java.util.Scanner;

public class Q03_Flow_of_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number : ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
        sc.close();
    }
}
