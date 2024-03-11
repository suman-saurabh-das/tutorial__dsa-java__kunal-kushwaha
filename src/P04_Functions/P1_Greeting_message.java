package P04_Functions;

public class P1_Greeting_message {
    public static void main(String[] args) {
        greet(); // function call
    }

    // function definition
    public static void greet() {
        System.out.println("Good evening !");
    }
}

/*
    NOTE - We can only call a static method from a static context hence we are adding static keyword. i.e. without creating an object, if we want to call the greet method from main method, we will have to make the method static (not associated to any object)

    Syntax of a function
    access-modifier return-type function-name (parameters) {
        // body of function
        // return statement
    }
    function-name(arguments)
*/
