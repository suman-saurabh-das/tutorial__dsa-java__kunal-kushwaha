package P04_Functions;

// Q. Check if a number is prime or not

import java.util.Scanner;

public class P10_Prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be checked : ");
        int num = sc.nextInt();
        boolean result = isPrime(num);
        System.out.println(result);
        sc.close();
    }

    static boolean isPrime(int num) {
        int c = 2;
        if (num <= 1) {
            return false;
        }
        while (c < num) {
            if (num % c == 0) {
                return false;
            } else {
                c++;
            }
        }
        return true;
    }
}
