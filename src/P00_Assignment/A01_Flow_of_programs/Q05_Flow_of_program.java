package P00_Assignment.A01_Flow_of_programs;

// 05. Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

import java.util.Scanner;

public class Q05_Flow_of_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String num = "";
        System.out.print("Enter a number or x to quit : ");
        while(!num.equals("x")) {
            num = sc.next();
            if(!num.equals("x")) {
                sum = sum + Integer.parseInt(num);
            }
        }
        System.out.println("Sum is : " + sum);
        sc.close();
    }
}
