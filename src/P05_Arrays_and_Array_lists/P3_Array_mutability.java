package P05_Arrays_and_Array_lists;

import java.util.Arrays;

public class P3_Array_mutability {
    public static void main(String[] args) {
        int[] arr = {10, 19, 38, 27, 60, 45};
        System.out.println(Arrays.toString(arr));
        modifyArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void modifyArr(int[] nums) {
        nums[0] = 100;
    }
}

/*
    In java arrays are mutable i.e. their values can be modified.
    Here nums and arr point to the same object in heap, hence when we change the value of nums[0] the object gets modified and since arr points to the same object, we see the change for arr as well.
*/
