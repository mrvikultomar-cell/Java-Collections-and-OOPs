// Question: Check whether two arrays have the same elements.
// Given two arrays, determine whether they contain the same distinct elements, ignoring order & duplicates.

import java.util.*;

public class CheckSameElements {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3};
        int[] b = {3, 2, 1, 1};

        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        for (int num : a) {
            setA.add(num);
        }

        for (int num : b) {
            setB.add(num);
        }

        System.out.println(setA.equals(setB) ? "Same" : "Different");
    }
}
