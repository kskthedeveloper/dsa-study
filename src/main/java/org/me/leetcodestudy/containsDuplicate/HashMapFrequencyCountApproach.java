package org.me.leetcodestudy.containsDuplicate;

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
