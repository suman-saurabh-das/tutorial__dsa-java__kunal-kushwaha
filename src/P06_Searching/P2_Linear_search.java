package P06_Searching;

public class P2_Linear_search {
    public static void main(String[] args) {
        String name = "Saurabh Das";
        char ch = 'u';
        int[] arr = {12, 81, -6, 57, 39, 21, -43, 99};

        boolean result = findCharacter(name, ch);
        System.out.println("Character is found : " + result);

        boolean result2 = findCharacterForEach(name, ch);
        System.out.println("Character is found : " + result2);

        printMaxAndMinValueInAnArray(arr);
    }

    // Linear search - Find if character is present in string
    static boolean findCharacter(String word, char target) {
        if (word.length() == 0)
            return false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == target)
                return true;
        }
        return false;
    }

    // Linear search - Find if character is present in string
    static boolean findCharacterForEach(String word, char target) {
        if (word.length() == 0)
            return false;
        for (char ch : word.toCharArray()) {
            if (ch == target)
                return true;
        }
        return false;
    }

    // Linear search - Minimum value & maximum value
    static void printMaxAndMinValueInAnArray(int[] arr) {
        int minVal = Integer.MAX_VALUE, maxVal = Integer.MIN_VALUE;
        // Enhanced for loop
        for (int element : arr) {
            if (element < minVal)
                minVal = element;
            if (element > maxVal)
                maxVal = element;
        }

//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < minVal)
//                minVal = arr[i];
//            if (arr[i] > maxVal)
//                maxVal = arr[i];
//        }
        System.out.println("The maximum and minimum values are : " + maxVal + " and " + minVal);
    }
}
