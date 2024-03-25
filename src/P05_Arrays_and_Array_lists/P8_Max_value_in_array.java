package P05_Arrays_and_Array_lists;

// Q. Find the max value in an array and in a given range in an array

public class P8_Max_value_in_array {
    public static void main(String[] args) {
        int[] arr = {14, 37, 29, 81, 74, 41, 56, 96, 16, 480};
        int start = 2, end = 6;
        int maxValue = findMax(arr);
        int maxValInRange = findMaxInRange(arr, start, end);
        System.out.println("Maximum val in array is : " + maxValue);
        System.out.println("Maximum val in the range for array is : " + maxValInRange);
    }

    static int findMax(int[] arr) {
        if (arr == null) {
            return -1;
        }
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal)
                maxVal = arr[i];
        }
        return maxVal;
    }

    static int findMaxInRange(int[] arr, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        if (end < start) {
            return -1;
        }
        int maxVal = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal)
                maxVal = arr[i];
        }
        return maxVal;
    }
}
