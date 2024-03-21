package P00_Assignment.A04_Functions;

// 10. Write a function to find if a number is a palindrome or not. Take number as parameter.

public class Q10_Functions {
    public static void main(String[] args) {
        System.out.println("Number is palindrome : " + isPalindrome(1334));
    }

    static boolean isPalindrome(int num) {
        int originalNum = num, reversedNum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            num = num / 10;
        }
        return originalNum == reversedNum;
    }
}
