package P00_Assignment.A01_Flow_of_programs;

// 01. Input a year and find whether it is a leap year or not.

import java.util.Scanner;

public class Q01_Flow_of_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year to check if it is a leap year : ");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
        sc.close();
    }
}
