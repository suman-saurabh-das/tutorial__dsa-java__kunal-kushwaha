package P00_Assignment.A03_Conditionals_loops_and_methods;

/*
    01. Calculate sum of digits of a number, sum of n numbers, average of n numbers, power of a number,
    subtract the product and sum of digits of an integer, print fibonacci series,
    input a number and print all the factors of that number (use loops).
*/

public class Q01_Conditionals_loops_methods {
    public static void main(String[] args) {
        System.out.println("1. Sum of digits of number is : " + sumOfDigits(123));
        System.out.println("2. Sum of n numbers is : " + sumOfNumbers(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println("3. Avg of n numbers is : " + avgOfNumbers(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println("4. Num raised to the power is : " + powerOfNumber(5, 3));
        System.out.println("5. Result of product minus sum for number is : " + productMinusSum(24));
        System.out.print("6. Fibonacci series up to n : ");
        printFibonacci(10);
        System.out.println();
        System.out.print("7. Factors of number are : ");
        printFactors(20);
    }

    // Sum of digits of a number
    static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int remainder = num % 10;
            sum = sum + remainder;
            num = num / 10;
        }
        return sum;
    }

    // Sum of n numbers
    static int sumOfNumbers(int... nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }

    // Average of n numbers
    static int avgOfNumbers(int... nums) {
        int sum = sumOfNumbers(nums);
        return sum / nums.length;
    }

    // Power of a number
    static int powerOfNumber(int num, int power) {
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * num;
        }
        return result;
    }

    // Subtract the product and sum of digits of an integer
    static int productMinusSum(int num) {
        int product = 1, sum = 0;
        while (num > 0) {
            int remainder = num % 10;
            product = product * remainder;
            sum = sum + remainder;
            num = num / 10;
        }
        return (product - sum);
    }

    // Print fibonacci series up to n
    static void printFibonacci(int n) {
        int a = 0, b = 1;
        if (n == 1)
            System.out.println(a);
        else if (n == 2)
            System.out.println(a + " " + b);
        else {
            System.out.print(a + " " + b + " ");
            for (int i = 2; i < n; i++) {
                int temp = b;
                b = a + b;
                a = temp;
                System.out.print(b + " ");
            }
        }
    }

    // Input a number and print all the factors of that number
    static void printFactors(int num) {
        int divisor = 2;
        while (divisor <= num / 2) {
            if (num % divisor == 0) {
                System.out.print(divisor + " ");
            }
            divisor++;
        }
    }
}
