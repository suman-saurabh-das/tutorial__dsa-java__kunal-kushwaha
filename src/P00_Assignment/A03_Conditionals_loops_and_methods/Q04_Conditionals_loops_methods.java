package P00_Assignment.A03_Conditionals_loops_and_methods;

// 04. Calculate factorial of a number, HCF & LCM Of two numbers, compound interest.

import java.util.Scanner;

public class Q04_Conditionals_loops_methods {
    public static void main(String[] args) {
        System.out.println("1. Factorial of a number : " + calcFactorial(5));
        System.out.println("2. HCF & LCM of 2 numbers are : " + findHCF(72, 30) + " and " + findLCM(72, 30));
        System.out.println("3. Compound interest : " + calcCompoundInterest());
    }

    static int calcFactorial(int num) {
        int fact = 1;
        while (num > 1) {
            fact = fact * num;
            num--;
        }
        return fact;
    }

    static int findHCF(int num1, int num2) {
        int hcf = Math.min(num1, num2);
        while (hcf >= 1) {
            if (num1 % hcf == 0 && num2 % hcf == 0) {
                break;
            } else {
                hcf--;
            }
        }
        return hcf;
    }

    static int findLCM(int num1, int num2) {
        return (num1 * num2) / findHCF(num1, num2);
    }

    static float calcCompoundInterest() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle, Rate of interest, Number of time periods elapsed : ");
        float p = sc.nextFloat();
        float r = sc.nextFloat();
        float t = sc.nextFloat();
        sc.close();
        return (float) ((p * (Math.pow(1 + r / 100, t))) - p);
    }
}
