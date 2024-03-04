package P00_Assignment.A01_Flow_of_programs;

// 04. Take 2 numbers as inputs and find their HCF and LCM.
// Hint : a * b = HCF(a,b) * LCM(a,b)

import java.util.Scanner;

public class Q04_Flow_of_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int hcf = Math.min(num1, num2);
        while (hcf >= 1) {
            if (num1 % hcf == 0 && num2 % hcf == 0) {
                break;
            } else {
                hcf--;
            }
        }
        int lcm = (num1 * num2) / hcf;
        System.out.println("HCF is : " + hcf + " LCM is : " + lcm);
        sc.close();
    }
}
