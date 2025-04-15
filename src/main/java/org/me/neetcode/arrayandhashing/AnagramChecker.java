package org.me.neetcode.arrayandhashing;

/*
Is Anagram
Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example 1:

Input: s = "racecar", t = "carrace"

Output: true
Example 2:

Input: s = "jar", t = "jam"

Output: false
Constraints:

s and t consist of lowercase English letters.

 */

import java.util.HashMap;

public class AnagramChecker {
    /**
     * Time Complexity
     * Loop through the strings: O(n) where n is the length of the strings.
     * <p>
     * Final loop to check the counts: O(26) → treated as constant time O(1).
     * <p>
     * Total: O(n)
     * <p>
     * Space Complexity
     * One integer array of size 26 → constant space.
     * <p>
     * Total: O(1)
     */
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        int[] charCount = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i)-'a']++;
            charCount[t.charAt(i)-'a']--;
        }

        for (int count: charCount) {
            if (count!=0)
                return false;
        }

        return true;
    }

    /**
     *
     * Time Complexity
     * Loop through the strings: O(n)
     * <p>
     * HashMap put() and getOrDefault() operations are O(1) on average.
     * <p>
     * equals() compares all keys and values: O(k) where k is the number of unique characters.
     * <p>
     * Total: O(n + k) → In the worst case with unique characters, O(n)
     * <p>
     * Space Complexity
     * Two hash maps with at most 26 keys (lowercase English letters).
     * <p>
     * Total: O(k) → at most O(26) → O(1) in practice, but technically O(k)
     * <p>
     * | Approach                              | Time Complexity | Space Complexity |
     * |---------------------------------------|-----------------|------------------|
     * | Array-based (optimized for lowercase) | O(n)            | O(1)             |
     * | HashMap-based                         | O(n + k)        | O(k)             |
     */

    public boolean isAnagramHashTable(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }

        return sMap.equals(tMap);
    }
}
