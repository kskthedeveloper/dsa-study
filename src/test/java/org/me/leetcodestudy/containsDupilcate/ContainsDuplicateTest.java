package org.me.leetcodestudy.containsDupilcate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.me.leetcodestudy.TestCase;
import org.me.leetcodestudy.TestRunner;
import org.me.leetcodestudy.arrayandhashing.containsDuplicate.*;

import java.util.List;


class ContainsDuplicateTest {
    private static List<TestCase<int[], Boolean>> testCases;

    @BeforeAll
    public static void setUp() {
        testCases = List.of(
                new TestCase<>(new int[]{1, 2, 3, 4, 2}, true),
                new TestCase<>(new int[]{1, 2, 2, 3, 4, 4}, true),
                new TestCase<>(new int[]{1, 2, 3, 4, 5}, false),
                new TestCase<>(new int[]{}, false),
                new TestCase<>(new int[]{10}, false),
                new TestCase<>(new int[]{5, 5, 5, 5}, true)
        );
    }

    @Test
    public void testNestedLoopApproach() {
        ContainsDuplicate nestedLoopApproach = new NestedLoopApproach();
        TestRunner.runTests(nestedLoopApproach, testCases, "NestedLoopApproach");
    }

    @Test
    public void testSortingLinearScan() {
        ContainsDuplicate sortingLinearScan = new SortingLinearScanApproach();
        TestRunner.runTests(sortingLinearScan, testCases, "SortingLinearScan");
    }

    @Test
    public void testHashSetApproach() {
        ContainsDuplicate hashSetApproach = new HashSetApproach();
        TestRunner.runTests(hashSetApproach, testCases, "HashSetApproach");
    }

    @Test
    public void testHashMapFrequencyCountApproach() {
        ContainsDuplicate hashMapFrequencyCountApproach = new HashMapFrequencyCountApproach();
        TestRunner.runTests(hashMapFrequencyCountApproach, testCases, "HashSetApproach");
    }
}