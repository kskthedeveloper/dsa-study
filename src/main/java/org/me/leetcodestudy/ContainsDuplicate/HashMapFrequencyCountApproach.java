package org.me.leetcodestudy.ContainsDuplicate;

import java.util.HashMap;

public class HashMapFrequencyCountApproach implements ContainsDuplicate{
    @Override
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> frequencyMap =  new HashMap<>();

        for (int num: nums) {
            if (frequencyMap.containsKey(num)) {
                return true;
            } else {
                frequencyMap.put(num, 1);
            }
        }
        return false;
    }
}
