package P04_Functions;

public class P6_Scope_of_variables {
    public static void main(String[] args) {
        int a = 10, b = 20;
        String name = "Aman";
        System.out.println(a + " " + b);
        // System.out.println(marks);   // marks is not accessible here

        // Block scope
        {
            // int a = 30; // gives error (a is already initialized)
            a = 50;     // we can access & modify the variables as this variable is in the scope of the parent block
            int c = 30; // we can access and modify this variable only inside this block (it can't be accessed in the parent)
            System.out.println(a + " " + c);
            name = "Rahul";
            System.out.println(name);
        }
        // c = 100;    // can't access c here
        int c = 200;   // we can re-initialize c here
        System.out.println("value of a and c are : " + a + " " + c);    // value of a gets changed (as we are using the same reference to modify)
        System.out.println(name);

        // Scope i in for loop
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");  // We can access i here
        }
        //System.out.println(i);    // We can't access i here
    }

    static void displayMarks() {
        int marks = 92;
        System.out.println(marks);
    }
}

/*
    Scope - Where we can access our variables.
    Function scope - variables defined inside a function can only be accessed within that function (also holds true for arguments) e.g. any variable inside main method can only be accessed inside main and not inside other methods.

    Any variable that is initialized in the parent method cannot be re-initialized inside the same parents block.
    But the variables of the parent can be modified and accessed inside the block.
    Any variable that is initialized in the block of a parent method, can be re-initialized in the parent method.
    But the variables of the block cannot be accessed inside the parent.
*/