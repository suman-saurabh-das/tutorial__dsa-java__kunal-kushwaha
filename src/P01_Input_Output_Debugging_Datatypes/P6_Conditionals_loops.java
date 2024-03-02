package P01_Input_Output_Debugging_Datatypes;

public class P6_Conditionals_loops {
    public static void main(String[] args) {
        // if-else
        int a = 10;
        if (a == 10) {
            System.out.println("Value of a is 10");
        } else {
            System.out.println("Value of a is not 10");
        }

        // while-loop
        int count = 1;
        while (count <= 5) {
            System.out.print(count + " ");
            count++;
        }

        // for loop
        for (int i = 6; i <= 10; i++) {
            System.out.print(i + " ");
        }

        // When we know how many times loop will run use for loop else use while loop
    }
}
