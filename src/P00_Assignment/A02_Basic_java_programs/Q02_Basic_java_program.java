package P00_Assignment.A02_Basic_java_programs;

// 02. Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class Q02_Basic_java_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name : ");
        String name = sc.nextLine();
        System.out.println("Hi ! " + name + " hope you are doing well.");
        sc.close();
    }
}
