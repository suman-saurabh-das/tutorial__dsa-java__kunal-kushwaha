package P04_Functions;

public class P4_Pass_by_value {
    public static void main(String[] args) {
        int a = 10, b = 20;
        swap(a, b);  // Here swapping does not occur as we are only passing a copy of value of a and b
        System.out.println(a + " " + b);

        String name = "Suman";
        changeName(name);   // name remains unchanged as we have passed only a copy of name
        System.out.println(name);
    }

    static void swap(int n1, int n2) {
        int temp = n2;
        n2 = n1;
        n1 = temp;
    }

    static void changeName(String name) {
        name = "Saurabh";
    }
}

/*
    NOTE - In java, we only have pass by value and not pass by reference.
    For primitive data types, like int, char, boolean, float... -> passing the value
    For objects and other non-primitive datatype, -> passing the value of the reference
*/