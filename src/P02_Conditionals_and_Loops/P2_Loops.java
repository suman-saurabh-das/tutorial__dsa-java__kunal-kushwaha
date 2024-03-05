package P02_Conditionals_and_Loops;

public class P2_Loops {
    public static void main(String[] args) {
        /*  Syntax of for loop
            for(initialization; condition; increment/decrement) {
                // body
            }
        */
        // Print numbers from 1-5
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        /*  Syntax of while loop
            while(condition) {
                // body
                // increment/decrement
            }
        */
        // Print numbers from 6-10
        int num = 6;
        while (num <= 10) {
            System.out.print(num + " ");
            num++;
        }

        /*  Syntax of do-while loop
            do {
                // body
            }
            while(condition)
        */
        // Print numbers from 10-15
        int count = 11;
        do {
            System.out.print(count + " ");
            count++;
        } while (count <= 15);
    }
}
