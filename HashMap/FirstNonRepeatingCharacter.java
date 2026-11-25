// Question: Find the First Non-Repeating Character.
// Given a string, use a HashMap to find the first character that appears exactly once. Print -1 if none exists.

import java.util.*;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "swiss";

        HashMap<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        char ans = '\0';
        for (char ch : s.toCharArray()) {
            if (freq.get(ch) == 1) {
                ans = ch;
                break;
            }
        }

        System.out.println(ans == '\0' ? "-1" : ans);
    }
}
