package P06_Searching;

public class P1_Linear_search {
    public static void main(String[] args) {
        int[] arr = {12, 17, 43, -3, 51, 27, 97, 56, -121, 82};

        int elementIndex = searchElementIndex(arr, 51);
        System.out.println("Element found at index : " + elementIndex);

        int element = searchElement(arr, 97);
        System.out.println("Element " + element + " found");

        int elementIndex2 = searchElementIndexForRange(arr, 43, 1, 4);
        System.out.println("Element found at index : " + elementIndex2);
    }

    // Linear search - Return the index of the element
    static int searchElementIndex(int[] arr, int target) {
        // checking if empty array or not, if empty, return -1
        if (arr.length == 0)
            return -1;
        // using for loop we are checking at every index if element is equal to target
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        // If element is not found, we will return -1
        return -1;
    }

    // Linear search - Return the element if found (return MIN_VALUE if not found)
    static int searchElement(int[] arr, int target) {
        // checking if empty array or not, if empty, return -1
        if (arr.length == 0)
            return Integer.MIN_VALUE;
        // Using enhanced for loop
        for (int ele : arr) {
            if (ele == target)
                return ele;
        }
        // If element is not found, we will return min-val of an integer
        return Integer.MIN_VALUE;
    }

    // Linear search - Return the index of element in between a range
    static int searchElementIndexForRange(int[] arr, int target, int start, int end) {
        // checking if empty array or not, if empty, return -1
        if (arr.length == 0)
            return -1;
        for (int i = start; i <= end; i++) {
            if (arr[i] == target)
                return i;
        }
        // If element is not found, we will return -1
        return -1;
    }
}

/*
    Linear search

    In case of linear search we check for the element in the array one by one using a for loop.
    Best case time complexity : O(1) (constant)
    Worst case time complexity : O(n) (depends on size of array n)

    Time complexity
    Best case : Ideal case in which we make the least number of comparisons to get the desired result.
    In linear search best case will be element found at 0th index. Graphically : (y = 1)

    Worst case : Ideal case in which we make the maximum number of comparisons to get desired result.
    In linear search worst case will be element not found in array. Graphically : (y = mx)

    Space complexity
    Extra space that is being taken - (if array is copied or not or are we taking extra space)
    In linear search, we do not take any extra space only one variable for iteration.
*/
