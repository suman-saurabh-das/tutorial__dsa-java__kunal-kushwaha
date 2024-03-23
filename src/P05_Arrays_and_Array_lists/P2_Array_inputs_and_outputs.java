package P05_Arrays_and_Array_lists;

import java.util.Scanner;
import java.util.Arrays;

public class P2_Array_inputs_and_outputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array of primitive data-type
        int[] arr1 = new int[3];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;

        // Taking input in an array
        int[] arr2 = new int[3];
        System.out.print("Enter 3 numbers : ");
        for (int i = 0; i < 3; i++) {
            arr2[i] = sc.nextInt();
        }

        // Array of objects
        String[] arr3 = new String[3];
        System.out.print("Enter 3 strings : ");
        for (int i = 0; i < 3; i++) {
            arr3[i] = sc.next();
        }

        // Printing an array
        // Method 1 - for loop
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        // Method 2 - for-each loop
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Method 3 - toString method
        System.out.println(Arrays.toString(arr3));

        sc.close();
    }
}
