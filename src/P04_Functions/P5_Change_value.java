package P04_Functions;

import java.util.Arrays;

public class P5_Change_value {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8};
        changeArrayVal(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void changeArrayVal(int[] num) {
        num[0] = 99;    // if we make a change to the object via this reference variable, same object will be changed
    }
}
/*
    Here we are passing the value of the reference variable arr to the function changeArrayVal().
    As both the references point to the same array, when we modify using either of the reference, the array gets modified.
*/