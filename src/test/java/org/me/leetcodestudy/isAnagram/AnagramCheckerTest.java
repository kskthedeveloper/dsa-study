package org.me.leetcodestudy.isAnagram;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnagramCheckerTest {
    private static class TestCase {
        String s;
        String t;
        boolean expected;

        TestCase(String s, String t, boolean expected) {
            this.s = s;
            this.t = t;
            this.expected = expected;
        }
    }

    private static List<TestCase> testCases;

    @BeforeAll
    public static void setUp() {
        // Define the test cases and their expected results using the TestCase class
        testCases = List.of(
                new TestCase("listen", "silent", true),            // Simple anagram
                new TestCase("triangle", "integral", true),        // Another valid anagram
                new TestCase("apple", "pale", false),              // Not an anagram
                new TestCase("", "", true),                       // Empty strings are anagrams
                new TestCase("a", "a", true),                     // Single character strings, same
                new TestCase("rat", "car", false),                // Not an anagram
                new TestCase("abcdefg", "gfedcba", true),         // Reversed string
                new TestCase("hello", "world", false),            // Different lengths, not anagram
                new TestCase("anagram", "margana", true),         // Another valid anagram
                new TestCase("aabbcc", "abcabc", true)            // Same characters, different order
        );
    }

    @Test
    public void testHashTableApproach() {
        AnagramChecker hashTableApproach = new HashTableApproach();
        runTests(hashTableApproach, "HashTableApproach");
    }

    @Test
    public void testSortingApproach() {
        AnagramChecker sortingApproach = new SortingApproach();
        runTests(sortingApproach, "SortingApproach");
    }

    private void runTests(AnagramChecker implementation, String approachName) {
        for (int i = 0; i < testCases.size(); i++) {
            TestCase testCase = testCases.get(i);
            boolean result = implementation.isAnagram(testCase.s, testCase.t);
            assertEquals(testCase.expected, result, String.format("%s failed for test case %d: %s, %s",
                    approachName, i + 1, testCase.s, testCase.t));
        }
    }
}
