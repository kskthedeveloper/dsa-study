package org.me.leetcodestudy.anagramGroup;

import org.me.leetcodestudy.Algorithm;

import java.util.List;

public interface IAnagramGroup  extends Algorithm<String[], List<List<String>>> {
    List<List<String>> groupAnagrams(String[] strs);

    @Override
    default List<List<String>> apply(String[] input) {
        return groupAnagrams(input);
    }
}
