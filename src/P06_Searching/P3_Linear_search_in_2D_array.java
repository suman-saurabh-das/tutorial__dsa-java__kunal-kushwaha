package P06_Searching;

import java.util.Arrays;

public class P3_Linear_search_in_2D_array {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 56;
        int[] index = findElement(arr, target);
        System.out.println("Index of the target element is : " + Arrays.toString(index));

        int[] minValMaxVal = findMaxAndMinVal(arr);
        System.out.println("Min value and Max value are : " + Arrays.toString(minValMaxVal));
    }

    // Linear search - Return the index in form of array [row, col]
    static int[] findElement(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target)
                    return new int[]{row, col};
            }
        }
        return new int[]{-1, -1};
    }

    // Linear search - Find Max and Min value
    static int[] findMaxAndMinVal(int[][] arr) {
        int minVal = Integer.MAX_VALUE, maxVal = Integer.MIN_VALUE;
        for (int[] colArr : arr) {
            for (int element : colArr) {
                if (element < minVal)
                    minVal = element;
                if (element > maxVal)
                    maxVal = element;
            }
        }
        return new int[]{minVal, maxVal};
    }
}
