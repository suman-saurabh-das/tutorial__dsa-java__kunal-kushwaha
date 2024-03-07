package P02_Conditionals_and_Loops;

// Q. Calculator to perform + - * / %

import java.util.Scanner;

public class P8_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char op;
        int num1 = 0, num2 = 0, result = 0;
        do {
            System.out.print("Operators : add(+) sub(-) mul(*) div(/) rem(%) exit(x) : ");
            op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter the numbers : ");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
            }
            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Cannot divide by zero 0");
                    }
                    break;
                case '%':
                    result = num1 % num2;
                    break;
                case 'x':
                    System.out.println("Exiting program !");
                    break;
                default:
                    System.out.println("Wrong op !");
            }
            System.out.println("Result is : " + result);
            result = 0;
        }
        while (op != 'x');
        sc.close();
    }
}
