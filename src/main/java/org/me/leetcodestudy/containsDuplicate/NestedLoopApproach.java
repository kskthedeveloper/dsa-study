package org.me.leetcodestudy.containsDuplicate;


public class NestedLoopApproach implements ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        boolean result = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) return true;
            }
        }
        return  result;
    }
}
