package lab08CollectionsFramework.ExerciseOnLists;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class Lists {

    /**
    * Function to insert an element in to a list at the beginning
     */
    public static void insertFirst(List<Integer> list, int value) {
        list.add(0, value);
    }

    /**
     * Function to insert an element into a list at the end
     * @param list
     * @param value
     */
    public static void insertLast(List<Integer> list, int value) {
        list.add(value);
    }

    /**
     * Function to replace the 3rd element of a list with a given value
     */
    public static void replace(List<Integer> list, int value) {
        list.set(2, value);
    }

    /**
     * Function to remove the 3rd element from a list
     */
//    public static void removeThird(List)
}

