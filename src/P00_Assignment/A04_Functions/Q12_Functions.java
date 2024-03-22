package P00_Assignment.A04_Functions;

// 12. Write a function that returns all prime numbers between two given numbers.

public class Q12_Functions {
    public static void main(String[] args) {
        System.out.print("Prime numbers in the range are : ");
        printPrimeNumbers(5, 78);
    }

    static void printPrimeNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
    }

    static boolean isPrime(int num) {
        if (num == 1)
            return false;
        int count = 2;
        while (count <= num / 2) {
            if (num % count == 0)
                return false;
            count++;
        }
        return true;
    }
}
