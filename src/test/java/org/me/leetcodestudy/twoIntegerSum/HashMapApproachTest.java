package org.me.leetcodestudy.twoIntegerSum;

import org.junit.jupiter.api.Test;
import org.me.leetcodestudy.arrayandhashing.twoIntegerSum.HashMapApproach;

import static org.junit.jupiter.api.Assertions.*;

class HashMapApproachTest {

    private final HashMapApproach solution = new HashMapApproach();

    @Test
    void testArrayLengthTooShort() {
        int[] nums = {1};  // Array length is less than 2
        int target = 5;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            solution.twoSum(nums, target);
        });
        assertEquals("Array length must be between 2 and 1000.", exception.getMessage());
    }

    @Test
    void testArrayLengthTooLong() {
        int[] nums = new int[1001];  // Array length is greater than 1000
        int target = 5;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            solution.twoSum(nums, target);
        });
        assertEquals("Array length must be between 2 and 1000.", exception.getMessage());
    }

    @Test
    void testTargetOutOfRangeLow() {
        int[] nums = {3, 4};
        int target = -10_000_001;  // Target is below the allowed range
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            solution.twoSum(nums, target);
        });
        assertEquals("Target must be between -10,000,000 and 10,000,000.", exception.getMessage());
    }

    @Test
    void testTargetOutOfRangeHigh() {
        int[] nums = {3, 4};
        int target = 10_000_001;  // Target is above the allowed range
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            solution.twoSum(nums, target);
        });
        assertEquals("Target must be between -10,000,000 and 10,000,000.", exception.getMessage());
    }

    @Test
    void testElementOutOfRangeLow() {
        int[] nums = {-10_000_001, 4};  // Element is below the allowed range
        int target = 5;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            solution.twoSum(nums, target);
        });
        assertEquals("Each number in the array must be between -10,000,000 and 10,000,000.", exception.getMessage());
    }

    @Test
    void testElementOutOfRangeHigh() {
        int[] nums = {3, 10_000_001};  // Element is above the allowed range
        int target = 5;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            solution.twoSum(nums, target);
        });
        assertEquals("Each number in the array must be between -10,000,000 and 10,000,000.", exception.getMessage());
    }

    @Test
    void testValidInput() {
        int[] nums = {3, 4, 5, 6};
        int target = 7;
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(new int[] {0, 1}, result);  // Check if the output is as expected
    }

}