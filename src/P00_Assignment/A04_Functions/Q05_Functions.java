package P00_Assignment.A04_Functions;

// 05. Define a method that returns the product of two numbers entered by user.

public class Q05_Functions {
    public static void main(String[] args) {
        System.out.println("Product of 2 numbers is : " + findProduct(19, 14));
    }

    static int findProduct(int num1, int num2) {
        return num1 * num2;
    }
}
