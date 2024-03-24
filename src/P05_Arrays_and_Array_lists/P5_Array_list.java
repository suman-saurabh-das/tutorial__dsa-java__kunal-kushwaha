package P05_Arrays_and_Array_lists;

import java.util.ArrayList;
import java.util.Scanner;

public class P5_Array_list {
    public static void main(String[] args) {
        /* Syntax of an array-list
            ArrayList<Integer> list = new ArrayList<Integer>(initialSize);

            Generics tell us what is the type of data that we can store in this list object.
            We can use array list without specifying the data-type, but it is not a good practice.
            Here Integer is the wrapper class for primitive data-type int.
            We can specify the initial size of list in the constructor.
        */
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>(5);
        list.add(10);   // add method is used to add a value to the list
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);   // internally calls the toString method.
        System.out.println(list.contains(50));  // check if list contains an element.
        list.set(0, 100);           // update/modifies the element at the index with the value.
        list.remove(2);       // deletes an element from the index.
        System.out.println(list);

        // Taking input from user
        System.out.print("Enter 5 values in array list : ");
        ArrayList<Integer> nums = new ArrayList<Integer>(2);
        for (int i = 0; i < 5; i++) {
            nums.add(sc.nextInt()); // add(element) is used to add the elements
        }

        // Printing all elements
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " "); // get(index) is used to get the elements
        }
        sc.close();
    }
}

/*
    ArrayList - can contain variable number of elements.
    It is a part of collections framework and is part of java.util package
    It is just a class.
    Size of an array list is fixed internally.
    When the array list fills by some amount, then a new array list is created whose length is calculated internally and the values from the old list is copied to the new list and the old list gets deleted.
    It has a time complexity : O(1) amortized
*/
