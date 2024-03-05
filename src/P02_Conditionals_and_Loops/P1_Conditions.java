package P02_Conditionals_and_Loops;

public class P1_Conditions {
    public static void main(String[] args) {
        /* Syntax of if-else statement
            if (boolean expression either true or false) {
                code if expression is true
            } else {
                code if expression is false
            }
        */

//        int salary = 50000;
//        if (salary >= 40000) {
//            salary = salary + 8000;
//        } else {
//            salary = salary + 4000;
//        }

        // Multiple if-else statements
        int salary = 50000;
        if (salary > 40000) {
            salary = salary + 8000;
        } else if (salary > 20000) {
            salary = salary + 4000;
        } else {
            salary = salary + 2000;
        }
        System.out.println(salary);
    }
}
