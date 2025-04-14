package org.me.neetcode.arrayandhashing;


import java.util.HashSet;

/*
Solutions
1. bruteforce search - T O(n^2), S O(1)
2. sort the array and compare adjacent items - T O(nlogn), S O(1)
2. using Hashset - T O(n), S O(n)
 */

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i: nums) {
            if (hashSet.contains(i))
                return true;
            hashSet.add(i);
        }
        return false;
    }
}
