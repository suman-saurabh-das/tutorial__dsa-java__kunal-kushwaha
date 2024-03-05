package P02_Conditionals_and_Loops;

// Q. Find largest of 3 numbers

import java.util.Scanner;

public class P3_Largest_of_3_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a;
        if (b > a) {
            max = b;
        }
        if (c > a) {
            max = c;
        }
        System.out.println("Maximum of 3 numbers is : " + max);
        sc.close();
    }
}
