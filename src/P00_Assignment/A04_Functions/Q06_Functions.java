package P00_Assignment.A04_Functions;

// 06. Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

public class Q06_Functions {
    public static void main(String[] args) {
        System.out.println("Circumference is : " + findCircumference(7));
        System.out.println("Area is : " + findArea(7));
    }

    static double findCircumference(int radius) {
        return 2 * Math.PI * radius;
    }

    static double findArea(int radius) {
        return Math.PI * radius * radius;
    }
}
