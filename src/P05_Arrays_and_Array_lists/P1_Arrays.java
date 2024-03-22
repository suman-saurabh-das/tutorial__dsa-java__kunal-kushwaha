package P05_Arrays_and_Array_lists;

public class P1_Arrays {
    public static void main(String[] args) {
        /* Syntax of an array
            datatype[] arrayName = new datatype[size];
        */

        // Declaring & initializing an array of roll no.
        // int[] rollNum1 = new int[5];
        // int[] rollNum2 = {1,2,3,4,5};

        int[] rollNum;  // declaring an array, rollNum (reference var) gets defined in the stack.
        rollNum = new int[5]; // initializing an array, actually here object is being created in the memory (heap).
        System.out.println(rollNum[0]); // int arrays are initialized with zero values.

        String[] str = new String[3];
        System.out.println(str[0]);     // String arrays are initialized with null values.

        // null - In Java, null is a literal, a special constant we can point to any non-primitive data-type whenever we wish to point to the absence of a value. It is neither an object nor a type, which is a common misconception.
        // null is the default value to which reference variables point to.
        // A literal is a source code representation of fixed value. e.g. 'A', 10

        boolean[] bool = new boolean[5];
        System.out.println(bool[0]);    // boolean arrays are initialized with false values.
    }
}
