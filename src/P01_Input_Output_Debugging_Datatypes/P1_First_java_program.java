package P01_Input_Output_Debugging_Datatypes;

import java.util.Scanner;

public class P1_First_java_program {
    public static void main(String[] args) {
        System.out.println("Hello World 🌍!");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine());
        sc.close();
    }
}

/*
	• Every file with extension .java is itself a class.
	• class - Named group of properties and functions.
        • By convention, class names should start with a capital letter.
        • The public class and file name should be exactly same.

	• public - Access modifier - It means this class can be accessed from anywhere.

	• To run a java program, write below commands in terminal -
		• javac filename.java - Creates the .class file from .java file.
		• java filename - Runs the byte code present in .class file.

	• methods - group of code which can be run again and again. (functions inside classes are called as methods)

	• main() method - entry point for the java program, it should be having public access modifier so that it can be accessed from anywhere.

	• static - static variables and methods, do not depend on the object. (we can access these functions or properties without creating an object of the class)

	• void - return type of our method.

	• String[] args - command line arguments (array of strings) whatever arguments we provide in terminal while running the code will be stored in this array.

	• package - folder where our java file lies. (used to organize the files and add data privacy)

	• System class - it is inside the java.lang package and is inherited by default. It contains several useful methods. e.g. for output we have print and println.
*/
