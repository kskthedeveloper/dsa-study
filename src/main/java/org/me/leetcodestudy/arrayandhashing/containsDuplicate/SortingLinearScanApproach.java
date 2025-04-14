package org.me.leetcodestudy.arrayandhashing.containsDuplicate;

import java.util.Arrays;

public class SortingLinearScanApproach implements ContainsDuplicate{
    @Override
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) return true;
        }
        return false;
    }
}
