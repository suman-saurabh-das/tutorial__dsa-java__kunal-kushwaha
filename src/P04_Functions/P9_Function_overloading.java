package P04_Functions;

import java.util.Arrays;

public class P9_Function_overloading {
    public static void main(String[] args) {
        myFunc();
        myFunc(100);
        myFunc("Saurabh");
        myFunc(45, 90);
        myFunc(10, 20, 30);
    }

    static void myFunc() {
        System.out.println("Empty function");
    }

    static void myFunc(int a) {
        System.out.println(a);
    }

    static void myFunc(String str) {
        System.out.println(str);
    }

    static void myFunc(int a, int b) {
        System.out.println(a + " " + b);
    }

    // This will only run if we pass 3 or more integers during function call (as we already have methods for 1 int parameter and 2 int parameter as inputs)
    static void myFunc(int... arr) {
        System.out.println(Arrays.toString(arr));
    }
}
