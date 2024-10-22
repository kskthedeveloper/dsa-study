package org.me.leetcodestudy.isAnagram;

import java.util.Arrays;

public class SortingApproach implements AnagramChecker {
    @Override
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) {
            return false;
        }

        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        Arrays.sort(charS);
        Arrays.sort(charT);
        return Arrays.equals(charS, charT);
    }

}
