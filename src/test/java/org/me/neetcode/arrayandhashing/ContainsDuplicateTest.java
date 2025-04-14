package org.me.neetcode.arrayandhashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContainsDuplicateTest {
    ContainsDuplicate checker = new ContainsDuplicate();

    @Test
    public void testWithDuplicates() {
        int[] nums = new int[]{1, 2, 3, 4, 2};
        assertTrue(checker.containsDuplicate(nums));
    }

    @Test
    public void testWithoutDuplicates() {
        int[] nums = {1, 2, 3, 4};
        assertFalse(checker.containsDuplicate(nums));
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        assertFalse(checker.containsDuplicate(nums));
    }

    @Test
    public void testSingleElementArray() {
        int[] nums = {1};
        assertFalse(checker.containsDuplicate(nums));
    }

    @Test
    public void testAllSameElements() {
        int[] nums = {7, 7, 7, 7};
        assertTrue(checker.containsDuplicate(nums));
    }

    @Test
    public void testLargeArrayWithDuplicates() {
        int[] nums = new int[10000];
        for (int i = 0; i < 9999; i++) {
            nums[i] = i;
        }
        nums[9999] = 42; // Duplicate value
        assertTrue(checker.containsDuplicate(nums));
    }

    @Test
    public void testLargeArrayWithoutDuplicates() {
        int[] nums = new int[10000];
        for (int i = 0; i < 10000; i++) {
            nums[i] = i;
        }
        assertFalse(checker.containsDuplicate(nums));
    }
}
