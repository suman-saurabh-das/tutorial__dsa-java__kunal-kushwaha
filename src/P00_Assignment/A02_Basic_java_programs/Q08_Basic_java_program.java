package P00_Assignment.A02_Basic_java_programs;

// 08. To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Q08_Basic_java_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String input = sc.next();
        int i = 0, j = input.length() - 1;
        boolean isPalindrome = true;
        while (i < j) {
            if (input.charAt(i) != input.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        if (isPalindrome) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }
        sc.close();
    }
}
