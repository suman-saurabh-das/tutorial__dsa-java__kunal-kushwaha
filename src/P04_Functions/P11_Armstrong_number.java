package P04_Functions;

// Q. Print all 3 digit armstrong numbers

import java.util.Scanner;

public class P11_Armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number to be checked : ");
        // int num = sc.nextInt();
        // System.out.println(isArmstrong(num));
        for (int i = 100; i <= 999; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }

    static boolean isArmstrong(int num) {
        int lastDigit = 0, sumOfDigits = 0, originalNum = num;
        while (num > 0) {
            lastDigit = num % 10;
            sumOfDigits = sumOfDigits + lastDigit * lastDigit * lastDigit;
            num = num / 10;
        }
        return (sumOfDigits == originalNum);
    }
}
