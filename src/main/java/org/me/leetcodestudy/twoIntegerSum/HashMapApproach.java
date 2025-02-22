package org.me.leetcodestudy.twoIntegerSum;

import java.util.HashMap;
import java.util.Map;

public class HashMapApproach implements TwoIntegerSum {
    @Override
    public int[] twoSum(int[] nums, int target) {
        if (nums.length < 2 || nums.length > 1000) {
            throw new IllegalArgumentException("Array length must be between 2 and 1000.");
        }
        if (target < -10_000_000 || target > 10_000_000) {
            throw new IllegalArgumentException("Target must be between -10,000,000 and 10,000,000.");
        }
        for (int num : nums) {
            if (num < -10_000_000 || num > 10_000_000) {
                throw new IllegalArgumentException("Each number in the array must be between -10,000,000 and 10,000,000.");
            }
        }

        Map<Integer, Integer> map = new HashMap<>();  // To store number and its index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
