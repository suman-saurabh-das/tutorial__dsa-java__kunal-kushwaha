package P02_Conditionals_and_Loops;

// Q. Reverse a number

import java.util.Scanner;

public class P7_Reverse_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be reversed : ");
        int num = sc.nextInt();
        int reversedNum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            num = num / 10;
        }
        System.out.println("Reversed number is : " + reversedNum);
        sc.close();
    }
}
