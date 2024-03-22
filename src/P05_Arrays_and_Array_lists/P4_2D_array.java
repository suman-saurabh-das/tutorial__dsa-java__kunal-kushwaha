package P05_Arrays_and_Array_lists;

import java.util.Arrays;
import java.util.Scanner;

public class P4_2D_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Syntax for 2D array
        // int[][] arr = new int[rows][cols];

        // Here adding the number of rows is compulsory but number of columns is not compulsory Because a 2D array is an array of arrays and every sub-array can have variable sizes (arr2) so we need not mention the column size (assigned automatically during initialization)

        // int[][] arr = new int[3][];
        int[][] arr2 = {
                {1, 2, 3},      // 0th index
                {4, 5},         // 1st index
                {6, 7, 8, 9}    // 2nd index
        };

        // Printing an array with variable length sub-array lengths
        for (int row = 0; row < arr2.length; row++) {
            for (int col = 0; col < arr2[row].length; col++) {
                System.out.print(arr2[row][col] + " ");
            }
            System.out.println();
        }

        // Here we have to mention both row and column sizes (as we will be taking input from user so size must be known beforehand)
        int[][] arr3 = new int[3][3];
        // Taking input for 2D array
        System.out.print("Enter 9 elements in 2D array : ");
        for (int row = 0; row < arr3.length; row++) {
            for (int col = 0; col < arr3[row].length; col++) {
                arr3[row][col] = sc.nextInt();
            }
        }
        // Printing 2D array with for loops
        for (int row = 0; row < arr3.length; row++) {
            for (int col = 0; col < arr3[row].length; col++) {
                System.out.print(arr3[row][col] + " ");
            }
            System.out.println();
        }
        // Printing 2D array with toString method
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(Arrays.toString(arr3[i]));
        }
        // Printing using enhanced for loop
        for (int[] a : arr3) {
            System.out.println(Arrays.toString(a));
        }
        sc.close();
    }
}
