package P03_Switch_statements_and_Nested_case;

import java.util.Scanner;

public class P1_Switch_statements {
    public static void main(String[] args) {
        /*
            Comparing strings - while comparing strings use the .equals() method instead of == because .equals() method compares only the value but the == operator compares both the vale and the address (reference)
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Whats you favorite fruit ? ");
        String fruit = sc.next();
        // Old Syntax for switch (here we need to specify break else fall-through occurs)
//        switch (fruit) {
//            case "apple":
//                System.out.println("A sweet red fruit");
//                break;
//            case "banana":
//                System.out.println("Banananananaa");
//                break;
//            case "mango":
//                System.out.println("King of all fruits");
//                break;
//            case "orange":
//                System.out.println("A round orange orange");
//                break;
//            case "grapes":
//                System.out.println("Small sour fruits");
//                break;
//            default:
//                System.out.println("Is it a fruit ???");
//                break;
//        }
        // Enhanced switch statements - here break is not required
        switch (fruit) {
            case "apple" -> System.out.println("A sweet red fruit");
            case "banana" -> System.out.println("Banananananaa");
            case "mango" -> System.out.println("King of all fruits");
            case "orange" -> System.out.println("A round orange orange");
            case "grapes" -> System.out.println("Small sour fruits");
            default -> System.out.println("Is it a fruit ???");
        }

        // Printing days
        System.out.print("Enter the day : ");
        int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
        // NOTE - We can use { } if we need to group together multiple statements

        // Printing whether Weekday or Weekend (case where break is not required)
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.println("Weekends");
        }
        sc.close();
    }
}
