package P04_Functions;

public class P7_Shadowing {
    static int x = 10;  // class variable, will be shadowed by variable x inside main method at line 7

    public static void main(String[] args) {
        System.out.println(x);
        int x;  // shadowing of class variable occurs here (where the variable is declared)
        // System.out.println(x);  // x cannot be accessed here
        x = 20; // shadowing doesn't occur where variable is initialised with a value.
        System.out.println(x);
        myFunc();
    }

    static void myFunc() {
        System.out.println(x);  // 10
    }
}

/*
    Shadowing is the practice of using 2 variables with same name within a scope.
    Higher level scope gets overlapped by the lower level.
    e.g. here class variable x = 10 gets shadowed by the variable x = 20 in the main method.
    Shadowing doesn't take place in methods.
*/