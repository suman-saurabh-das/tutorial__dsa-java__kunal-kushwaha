package P01_Input_Output_Debugging_Datatypes;

import java.util.Scanner;

public class P3_Data_types_inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your roll number : ");
        int rollNumber = sc.nextInt();
        System.out.println("Your roll number is : " + rollNumber);

        String word = sc.next();          // takes only first word (before space is encountered)
        sc.nextLine();                    // used to take the newline after entering the word
        System.out.println(word);

        String sentence = sc.nextLine();  // takes the complete sentence (before new line is encountered)
        System.out.println(sentence);

        float marks = sc.nextFloat();     // takes a floating point number
        // if we enter an integer here, then type casting occurs and int is converted to float
        System.out.println(marks);

        sc.close();
    }
}
