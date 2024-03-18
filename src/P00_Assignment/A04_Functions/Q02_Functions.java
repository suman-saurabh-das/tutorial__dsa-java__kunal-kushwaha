package P00_Assignment.A04_Functions;

// 02. Define a program to find out whether a given number is even or odd.

public class Q02_Functions {
    public static void main(String[] args) {
        System.out.println("Number is : " + isEvenOrOdd(15));
        System.out.println("Number is : " + isEvenOrOdd(12));
    }

    static String isEvenOrOdd(int num) {
        if (num % 2 == 0)
            return "Even";
        else
            return "Odd";
    }
}
