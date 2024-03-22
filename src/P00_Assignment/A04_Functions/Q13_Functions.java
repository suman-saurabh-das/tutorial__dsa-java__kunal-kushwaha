package P00_Assignment.A04_Functions;

// 13. Write a function that returns the sum of first n natural numbers.

public class Q13_Functions {
    public static void main(String[] args) {
        System.out.println("Sum of natural numbers up to n : " + sumOfNumbers(9));
    }

    static int sumOfNumbers(int n) {
        int count = 1, sum = 0;
        while (count <= n) {
            sum = sum + count;
            count++;
        }
        return sum;
    }
}
