package P04_Functions;

import java.util.Scanner;

public class P2_Sum_of_2_numbers {
    public static void main(String[] args) {
        int result = sum();
        System.out.println("Sum of 2 numbers is : " + result);
    }

    static int sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        return num1 + num2;
        // System.out.println("This will never execute");
    }
}
