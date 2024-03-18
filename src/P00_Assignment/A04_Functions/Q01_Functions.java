package P00_Assignment.A04_Functions;

// 01. Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

public class Q01_Functions {
    public static void main(String[] args) {
        System.out.println("Maximum number is : " + findMaximum(78, 56, 94));
        System.out.println("Minimum number is : " + findMinimum(78, 56, 94));
    }

    static int findMaximum(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max)
            max = num2;
        if (num3 > max)
            max = num3;
        return max;
    }

    static int findMinimum(int num1, int num2, int num3) {
        int min = num1;
        if (num2 < min)
            min = num2;
        if (num3 < min)
            min = num3;
        return min;
    }
}
