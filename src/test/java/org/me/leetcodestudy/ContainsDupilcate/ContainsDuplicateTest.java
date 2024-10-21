package org.me.leetcodestudy.ContainsDupilcate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.me.leetcodestudy.ContainsDuplicate.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {
    private static class TestCase {
        int[] nums;
        boolean expected;

        TestCase(int[] nums, boolean expected) {
            this.nums = nums;
            this.expected = expected;
        }
    }

    private static List<TestCase> testCases;

    @BeforeAll
    public static void setUp() {
        // Define the test cases and their expected results using the TestCase class
        testCases = List.of(
                new TestCase(new int[]{1, 2, 3, 4, 2}, true),                    // Contains a pair of duplicates
                new TestCase(new int[]{1, 2, 2, 3, 4, 4}, true),                 // Contains multiple pairs of duplicates
                new TestCase(new int[]{1, 2, 3, 4, 5}, false),                  // No duplicate elements
                new TestCase(new int[]{}, false),                               // Empty array
                new TestCase(new int[]{10}, false),                             // Single element array
                new TestCase(new int[]{5, 5, 5, 5}, true),                      // Multiple duplicates of the same element
                new TestCase(new int[]{-1, -2, -3, -1}, true),                  // Negative numbers with duplicates
                new TestCase(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE}, true), // Large numbers with duplicates
                new TestCase(new int[]{1, -1, 2, -2, 3, -3, Integer.MAX_VALUE, Integer.MIN_VALUE}, false), // All unique elements
                new TestCase(new int[]{0, 1, 0}, true)                          // Zeroes and duplicates
        );
    }

    @Test
    public void testNestedLoopApproach() {
        ContainsDuplicate nestedLoopApproach = new NestedLoopApproach();
        runTests(nestedLoopApproach, "NestedLoopApproach");
    }

    @Test
    public void testSortingLinearScan() {
        ContainsDuplicate sortingLinearScan = new SortingLinearScanApproach();
        runTests(sortingLinearScan, "SortingLinearScan");
    }

    @Test
    public void testHashSetApproach() {
        ContainsDuplicate hashSetApproach = new HashSetApproach();
        runTests(hashSetApproach, "HashSetApproach");
    }

    @Test
    public void testHashMapFrequencyCountApproach() {
        ContainsDuplicate hashMapFrequencyCountApproach = new HashMapFrequencyCountApproach();
        runTests(hashMapFrequencyCountApproach, "HashSetApproach");
    }

    private void runTests(ContainsDuplicate implementation, String approachName) {
        for (int i = 0; i < testCases.size(); i++) {
            TestCase testCase = testCases.get(i);
            boolean result = implementation.containsDuplicate(testCase.nums);
            assertEquals(testCase.expected, result, String.format("%s failed for test case %d: %s",
                    approachName, i + 1, Arrays.toString(testCase.nums)));
        }
    }
}