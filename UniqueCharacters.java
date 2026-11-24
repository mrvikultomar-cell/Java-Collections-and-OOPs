// Question: Check whether a string has all unique characters.
// Given a string, determine whether every character appears only once using a HashSet.

import java.util.*;

public class UniqueCharacters {
    public static void main(String[] args) {
        String s = "Planet";
        HashSet<Character> set = new HashSet<>();
        boolean unique = true;

        for (char ch : s.toCharArray()) {
            if (set.contains(ch)) {
                unique = false;
                break;
            }
            set.add(ch);
        }

        System.out.println(unique ? "Unique" : "Not Unique");
    }
}
