package P05_Arrays_and_Array_lists;

// Q. Swap elements in an array based on index input

import java.util.Arrays;
import java.util.Scanner;

public class P7_Swap_elements_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 23, 51, 69, 17, 39, 82};
        System.out.print("Enter the indexes to be swapped : ");
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();
        System.out.println(Arrays.toString(arr));
        swap(arr, index1, index2);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }
}
