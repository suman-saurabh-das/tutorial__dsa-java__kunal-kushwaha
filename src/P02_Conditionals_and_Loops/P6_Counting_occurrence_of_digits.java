package P02_Conditionals_and_Loops;

// Q. Counting the number of occurrence of a digit in the number

import java.util.Scanner;

public class P6_Counting_occurrence_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number and digit to be checked : ");
        int number = sc.nextInt();
        int digitToBeChecked = sc.nextInt();
        int count = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit == digitToBeChecked) {
                count++;
            }
            number = number / 10;
        }
        System.out.println(digitToBeChecked + " occurred " + count + " times");
        sc.close();
    }
}
