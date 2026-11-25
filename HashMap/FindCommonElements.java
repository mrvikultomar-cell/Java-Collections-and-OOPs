// Question: Find Common Elements in Two Arrays.
// Given two arrays, print the distinct elements that occur in both arrays using a HashMap.

import java.util.*;

public class FindCommonElements {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4};
        int[] b = {2, 2, 4, 6};

        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : a) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        HashSet<Integer> printed = new HashSet<>();
        for (int num : b) {
            if (freq.containsKey(num) && !printed.contains(num)) {
                System.out.print(num + " ");
                printed.add(num);
            }
        }
    }
}
