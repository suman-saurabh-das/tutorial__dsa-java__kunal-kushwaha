package P00_Assignment.A03_Conditionals_loops_and_methods;

// 11. Kunal is allowed to go out with his friends only on the even days of a given month.
// Write a program to count the number of days he can go out in the month of August.

import java.util.Scanner;

public class Q09_Conditionals_loops_methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days : ");
        int daysInMonth = sc.nextInt(), numDays = 0;
        for (int i = 1; i <= daysInMonth; i++) {
            if (i % 2 == 0) {
                numDays++;
            }
        }
        System.out.println("You are allowed to go out " + numDays + " number of days");
        sc.close();
    }
}
