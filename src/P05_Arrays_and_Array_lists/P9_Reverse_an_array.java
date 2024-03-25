package P05_Arrays_and_Array_lists;

// Q. Reverse an array

import java.util.Arrays;

public class P9_Reverse_an_array {
    public static void main(String[] args) {
        int[] arr = {1, 23, 51, 69, 17, 39, 82};
        System.out.println(Arrays.toString(arr));
        reverseArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int start, int end, int[] arr) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static void reverseArr(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            swap(start, end, arr);
            start++;
            end--;
        }
    }
}
