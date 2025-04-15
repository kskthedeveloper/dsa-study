package org.me.neetcode.arrayandhashing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnagramCheckerTest {
    private final AnagramChecker checker = new AnagramChecker();

    @Test
    void testAnagrams() {
        assertTrue(checker.isAnagram("racecar", "carrace"));
        assertTrue(checker.isAnagram("listen", "silent"));
        assertTrue(checker.isAnagram("aabbcc", "baccab"));
    }

    @Test
    void testNotAnagrams() {
        assertFalse(checker.isAnagram("jar", "jam"));
        assertFalse(checker.isAnagram("hello", "world"));
        assertFalse(checker.isAnagram("test", "ttew"));
    }

    @Test
    void testDifferentLengths() {
        assertFalse(checker.isAnagram("abc", "ab"));
        assertFalse(checker.isAnagram("abcd", "abcde"));
    }

    @Test
    void testEmptyStrings() {
        assertTrue(checker.isAnagram("", ""));
    }

    @Test
    void testSingleCharacters() {
        assertTrue(checker.isAnagram("a", "a"));
        assertFalse(checker.isAnagram("a", "b"));
    }

    @ParameterizedTest
    @DisplayName("Should return true for valid anagrams")
    @CsvSource({
            "racecar, carrace",
            "listen, silent",
            "aabbcc, baccab",
            "abc, cba",
            "'', ''",
            "a, a"
    })
    void shouldReturnTrueForAnagrams(String s, String t) {
        assertTrue(checker.isAnagram(s, t));
    }

    @ParameterizedTest
    @DisplayName("Should return false for non-anagrams")
    @CsvSource({
            "jar, jam",
            "hello, world",
            "test, ttew",
            "a, b"
    })
    void shouldReturnFalseForNonAnagrams(String s, String t) {
        assertFalse(checker.isAnagram(s, t));
    }

    @ParameterizedTest
    @DisplayName("Should return false for strings with different lengths")
    @CsvSource({
            "abc, ab",
            "abcd, abcde",
            "a, ''",
            "'', a"
    })
    void shouldReturnFalseForDifferentLengths(String s, String t) {
        assertFalse(checker.isAnagram(s, t));
    }

    @ParameterizedTest
    @DisplayName("Valid anagrams using hash table")
    @CsvSource({
            "racecar, carrace",
            "listen, silent",
            "aabbcc, baccab",
            "abc, cba",
            "'', ''",
            "a, a"
    })
    void shouldReturnTrueForAnagramsUsingHashTable(String s, String t) {
        assertTrue(checker.isAnagramHashTable(s, t));
    }

    @ParameterizedTest
    @DisplayName("Invalid anagrams using hash table")
    @CsvSource({
            "jar, jam",
            "hello, world",
            "test, ttew",
            "a, b"
    })
    void shouldReturnFalseForNonAnagramsHashTable(String s, String t) {
        assertFalse(checker.isAnagramHashTable(s, t));
    }

    @ParameterizedTest
    @DisplayName("Different lengths should return false")
    @CsvSource({
            "abc, ab",
            "abcd, abcde",
            "a, ''",
            "'', a"
    })
    void shouldReturnFalseForDifferentLengthsHashTable(String s, String t) {
        assertFalse(checker.isAnagramHashTable(s, t));
    }
}
