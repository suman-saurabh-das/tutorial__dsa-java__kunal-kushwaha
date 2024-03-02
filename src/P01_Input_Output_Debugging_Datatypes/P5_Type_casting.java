package P01_Input_Output_Debugging_Datatypes;

import java.util.Scanner;

public class P5_Type_casting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // If one type of data is assigned to another type of variable, then automatic type conversion will take place if following conditions are met -
        // 1. Data-types should be compatible. (e.g. float and int)
        // 2. Destination type should be greater than Source type.
        // (e.g. asking for float and providing int)

        // Here if we enter an int, it automatically gets converted to float.
        float num = sc.nextFloat();
        System.out.println(num);

        // ----------------------------------------

        // Type casting - Explicit type conversion or Narrowing conversion.
        // Compressing the bigger number in a smaller type explicitly.
        int num2 = (int) (23.45321f);
        System.out.println(num2);

        // ----------------------------------------

        // Automatic type promotion in expression
        int num3 = 257;
        byte num4 = (byte) num3; // max range of byte is 256
        // but we are trying to store 257 hence result will be modulo of 257/256 i.e. 1
        System.out.println(num4);

        byte b1 = 40;
        byte b2 = 50;
        byte b3 = 100;
        int result = (b1 * b2) / b3;
        // Here the value of b1 * b2 is 2000 which is more that what byte can store,
        // hence java automatically converts the byte to int while evaluating the expression.
        System.out.println(result);

        // byte b4 = 50;
        // b4 = b4 * 2; // this assignment can't be done as expression is evaluated in int, and we are trying to store it in byte.

        // Rules by which conversion occurs
        // 1. All byte, char and short value are promoted to integer
        // 2. If any one of the operands is long, whole operation is promoted to long similarly for float and double.

        // ----------------------------------------

        int number = 'a';
        System.out.println(number);   // prints ascii value of 'a'
        System.out.println("नमस्ते");   // Java follows unicode principles

        // ----------------------------------------

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double res = (f * b) + (i / c) - (d * s);
        // float + int - double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(res);

        sc.close();
    }
}
