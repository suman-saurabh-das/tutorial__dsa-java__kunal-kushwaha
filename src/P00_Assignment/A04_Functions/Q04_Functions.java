package P00_Assignment.A04_Functions;

// 04. Write a program to print the sum of two numbers entered by user by defining your own method.

public class Q04_Functions {
    public static void main(String[] args) {
        System.out.println("The sum of 2 numbers is : " + calcSum(49, 26));
    }

    static int calcSum(int num1, int num2) {
        return num1 + num2;
    }
}
