package P02_Conditionals_and_Loops;

// Q. Enter a letter and check whether it is lowercase or uppercase

import java.util.Scanner;

public class P4_Character_case_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = sc.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase");
        } else {
            System.out.println("Not a letter !");
        }
        sc.close();
    }
}
