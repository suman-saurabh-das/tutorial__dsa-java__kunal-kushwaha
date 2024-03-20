package P00_Assignment.A04_Functions;

// 07. Define a method to find out if a number is prime or not.

public class Q07_Functions {
    public static void main(String[] args) {
        System.out.println("Number is prime : " + isPrime(37));
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
