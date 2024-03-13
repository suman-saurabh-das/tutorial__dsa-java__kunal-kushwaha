package P04_Functions;

import java.util.Arrays;

public class P8_Variable_length_arguments {
    public static void main(String[] args) {
        myFunc(2, 3, 5, 7, 12, 34, 98, 19, 45);
    }
    // We can call the myFunc method with zero or more than zero arguments the arguments passed will internally be converted into an array.
    static void myFunc(int ...arr) {
        String s = "";
        System.out.println(Arrays.toString(arr));
    }
}

/*
    VarArgs - variable length arguments.
    Here we can pass any number of arguments which will be input as an array. (length of arguments is not fixed)
    NOTE - variable length arguments should always come at the end.
*/