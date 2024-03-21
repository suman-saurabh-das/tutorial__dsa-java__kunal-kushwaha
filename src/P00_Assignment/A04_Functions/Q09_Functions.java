package P00_Assignment.A04_Functions;

/*
  09. Write a program to print the factorial of a number by defining a method named 'Factorial'.
    Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
    4! = 1 * 2 * 3 * 4 = 24
    3! = 3 * 2 * 1 = 6
    2! = 2 * 1 = 2
    Also,
    1! = 1
    0! = 1
*/

public class Q09_Functions {
    public static void main(String[] args) {
        System.out.println("Factorial is : " + factorial(7));
    }

    static long factorial(long num) {
        if (num == 1 || num == 0)
            return 1;
        long fact = 1;
        while (num > 1) {
            fact = fact * num;
            num--;
        }
        return fact;
    }
}
