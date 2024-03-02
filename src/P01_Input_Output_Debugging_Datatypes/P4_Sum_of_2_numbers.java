package P01_Input_Output_Debugging_Datatypes;

import java.util.Scanner;

public class P4_Sum_of_2_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float sum = num1 + num2;
        System.out.println("Sum of the 2 numbers is : " + sum);
        sc.close();
    }
}
