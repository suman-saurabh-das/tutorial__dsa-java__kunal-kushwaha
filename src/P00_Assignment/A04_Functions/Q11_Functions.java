package P00_Assignment.A04_Functions;

// 11. Write a function to check if a given triplet is a Pythagorean triplet or not.
// (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

public class Q11_Functions {
    public static void main(String[] args) {
        System.out.println("Numbers form a pythagorean triplet : " + isPythagoreanTriplet(4, 3, 5));
    }

    static boolean isPythagoreanTriplet(int num1, int num2, int num3) {
        if (num1 * num1 + num2 * num2 == num3 * num3)
            return true;
        else if (num1 * num1 + num3 * num3 == num2 * num2)
            return true;
        else if (num2 * num2 + num3 * num3 == num1 * num1)
            return true;
        else
            return false;
    }
}
