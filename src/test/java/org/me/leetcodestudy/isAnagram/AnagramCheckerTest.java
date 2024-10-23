package org.me.leetcodestudy.isAnagram;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.me.leetcodestudy.TestCase;
import org.me.leetcodestudy.TestRunner;

import java.util.List;

class AnagramCheckerTest {
    private static List<TestCase<String[], Boolean>> testCases;

    @BeforeAll
    public static void setUp() {
        testCases = List.of(
                new TestCase<>(new String[]{"listen", "silent"}, true),
                new TestCase<>(new String[]{"triangle", "integral"}, true),
                new TestCase<>(new String[]{"apple", "pale"}, false),
                new TestCase<>(new String[]{"", ""}, true),
                new TestCase<>(new String[]{"a", "a"}, true),
                new TestCase<>(new String[]{"rat", "car"}, false)
        );
    }

    @Test
    public void testHashTableApproach() {
        AnagramChecker hashTableApproach = new HashTableApproach();
        TestRunner.runTests(hashTableApproach, testCases, "HashTableApproach");
    }

    @Test
    public void testSortingApproach() {
        AnagramChecker sortingApproach = new SortingApproach();
        TestRunner.runTests(sortingApproach, testCases, "SortingApproach");
    }

    @Test
    public void testSingleArrayApproach() {
        AnagramChecker singleArrayApproach = new SingleArrayApproach();
        TestRunner.runTests(singleArrayApproach, testCases, "SingleArrayApproach");
    }
}
