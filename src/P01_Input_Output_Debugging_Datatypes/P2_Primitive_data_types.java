package P01_Input_Output_Debugging_Datatypes;

public class P2_Primitive_data_types {
    public static void main(String[] args) {
        // Primitive datatype - datatype which cannot be broken further
        int rollNumber = 1707238;
        char letter = 'S';
        float marks = 92.3f;              // default value is double, we add f/F to denote float
        double largeDecimalNumber = 12345.6789;
        long largeInteger = 987654321L;   // default value is int, we add l/L to denote long int
        boolean isPass = true;

        // Wrapper classes - Classes of primitive datatype having additional in-built methods
        Integer realNum = 25;
        System.out.println(realNum.floatValue());;   // using built-in methods

        // String is not a primitive datatype
        String season = "Summer";

        System.out.println(rollNumber);
        System.out.println(letter);
        System.out.println(marks);
        System.out.println(largeDecimalNumber);
        System.out.println(largeInteger);
        System.out.println(isPass);
        System.out.println(season);
    }
}
