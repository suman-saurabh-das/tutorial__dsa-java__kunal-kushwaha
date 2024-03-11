package P03_Switch_statements_and_Nested_case;

import java.util.Scanner;

public class P2_Nested_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id and department : ");
        int employeeId = sc.nextInt();
        String department = sc.next();
        System.out.print("Enter 1 to display name and 2 to display department : ");
        int choice = sc.nextInt();
        switch(choice) {
            case 1 -> {
                switch(employeeId) {
                    case 1 -> System.out.println("Abhay");
                    case 2 -> System.out.println("Priyanshi");
                    default -> System.out.println("User");
                }
            }
            case 2 -> {
                switch(department) {
                    case "frontend" -> System.out.println("Frontend lead");
                    case "backend" -> System.out.println("Backend lead");
                    default -> System.out.println("Software engineer");
                }
            }
        }
        sc.close();
    }
}
