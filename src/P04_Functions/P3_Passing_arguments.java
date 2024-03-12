package P04_Functions;

import java.util.Scanner;

public class P3_Passing_arguments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.next();
        System.out.println(greet(name));    // function call along with parameter passing
        sc.close();
    }

    static String greet(String name) {
        return ("Hello ! " + name);
    }
}
