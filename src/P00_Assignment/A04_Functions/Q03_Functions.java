package P00_Assignment.A04_Functions;

// 03. A person is eligible to vote if his/her age is greater than or equal to 18.
// Define a method to find out if he/she is eligible to vote.

public class Q03_Functions {
    public static void main(String[] args) {
        int age = 17;
        if (isAllowedToVote(age))
            System.out.println("User is eligible to vote.");
        else
            System.out.println("User is not eligible to vote.");
    }

    static boolean isAllowedToVote(int age) {
        return age >= 18;
    }
}
