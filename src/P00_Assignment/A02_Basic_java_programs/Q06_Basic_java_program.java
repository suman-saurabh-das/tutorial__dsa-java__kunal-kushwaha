package P00_Assignment.A02_Basic_java_programs;

// 06. Input currency in rupees and output in USD.

import java.util.Scanner;

public class Q06_Basic_java_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount in rupees : ");
        float amtINR = sc.nextFloat();
        float amtDLR = amtINR / 83.0f;
        System.out.println("₨ " + amtINR + " is equivalent to : " + amtDLR + "$");
        sc.close();
    }
}
