package P00_Assignment.A03_Conditionals_loops_and_methods;

// 05. Check if a year is leap year or not, if a number is perfect number, if a number is palindrome or not.

public class Q05_Conditionals_loops_methods {
    public static void main(String[] args) {
        System.out.println("1. Year is leap year : " + isLeapYear(2004));
        System.out.println("2. Number is prime : " + isPrime(13));
        System.out.println("3. Number is perfect : " + isPerfect(496));
        System.out.println("4. Number is palindrome : " + isPalindrome(1221));
    }

    static boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        int count = 2;
        while (count <= num / 2) {
            if (num % count == 0) {
                return false;
            }
            count++;
        }
        return true;
    }

    static boolean isPerfect(int num) {
        int sumOfDivisors = 0, divisor = 1;
        while (divisor < num) {
            if (num % divisor == 0) {
                sumOfDivisors = sumOfDivisors + divisor;
            }
            divisor++;
        }
        return sumOfDivisors == num;
    }

    static boolean isPalindrome(int num) {
        int reversedNum = 0, originalNum = num;
        while (num > 0) {
            int lastDigit = num % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            num = num / 10;
        }
        return reversedNum == originalNum;
    }
}
