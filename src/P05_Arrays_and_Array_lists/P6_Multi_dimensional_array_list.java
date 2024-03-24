package P05_Arrays_and_Array_lists;

import java.util.ArrayList;
import java.util.Scanner;

public class P6_Multi_dimensional_array_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> mulDimList = new ArrayList<>(3);
        // Currently the ArrayList is empty (null) so we have to initialize it with an Arraylist
        // initially : mulDimList : [null, null, null]
        // Initializing the multidimensional array list
        for (int i = 0; i < 3; i++) {
            mulDimList.add(new ArrayList<>());
        }
        // After initialization : mulDimList : [arrList<>, arrList<>, arrList<>]
        // Adding elements
        System.out.print("Enter 9 elements in ArrayList : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mulDimList.get(i).add(sc.nextInt());
            }
        }
        System.out.println(mulDimList);
        sc.close();
    }
}
