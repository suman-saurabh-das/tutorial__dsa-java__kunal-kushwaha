package P00_Assignment.A03_Conditionals_loops_and_methods;

// 06. Reverse a string, find if a character is vowel or consonant.

public class Q06_Conditionals_loops_methods {
    public static void main(String[] args) {
        System.out.println("1. Reversed string : " + reversedString("reverse me"));
        System.out.println("2. Character is : " + (isVowel('a') ? "vowel" : "consonant"));
    }

    static String reversedString(String str) {
        int position = str.length() - 1;
        String reversedStr = "";
        while (position >= 0) {
            reversedStr = reversedStr + str.charAt(position);
            position--;
        }
        return reversedStr;
    }

    static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        } else {
            return false;
        }
    }
}
