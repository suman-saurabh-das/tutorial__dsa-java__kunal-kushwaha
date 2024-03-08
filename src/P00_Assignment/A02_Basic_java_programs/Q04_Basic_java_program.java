package P00_Assignment.A02_Basic_java_programs;

// 04. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Q04_Basic_java_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.print("Enter the operator : ");
        char op = sc.next().trim().charAt(0);
        int result = 0;
        if (op == '+') {
            result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
        } else if (op == '-') {
            result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + result);
        } else if (op == '*') {
            result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
        } else if (op == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
            } else {
                System.out.println("Cannot divide by zero");
            }
        } else {
            System.out.println("Invalid operator !");
        }
        sc.close();
    }
}
