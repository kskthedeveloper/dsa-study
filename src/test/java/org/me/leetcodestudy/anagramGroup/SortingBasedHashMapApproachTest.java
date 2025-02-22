package org.me.leetcodestudy.anagramGroup;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.me.leetcodestudy.TestCase;
import org.me.leetcodestudy.TestRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortingBasedHashMapApproachTest {
    private static List<TestCase<String[], List<List<String>>>> testCases;

    @BeforeAll
    public static void setUp() {
        testCases = List.of(
                new TestCase<>(new String[]{"act", "pots", "tops", "cat", "stop", "hat"},
                        List.of(
                                List.of("hat"),
                                List.of("act", "cat"),
                                List.of("pots", "tops", "stop")
                        )),
                new TestCase<>(new String[]{"listen", "silent", "enlist"},
                        List.of(
                                List.of("listen", "silent", "enlist")
                        )),
                new TestCase<>(new String[]{"rat", "car", "arc"},
                        List.of(
                                List.of("rat"),
                                List.of("car", "arc")
                        )),
                new TestCase<>(new String[]{"a"},
                        List.of(
                                List.of("a")
                        )),
                new TestCase<>(new String[]{""},
                        List.of(
                                List.of("")
                        )),
                new TestCase<>(new String[]{"tea", "eat", "ate", "bat"},
                        List.of(
                                List.of("tea", "eat", "ate"),
                                List.of("bat")
                        ))
        );
    }

    @Test
    public void testSortingBasedHashMapApproach() {
        SortingBasedHashMapApproach sortingBasedHashMapApproach = new SortingBasedHashMapApproach();
        TestRunner.runTests(sortingBasedHashMapApproach, testCases, "SortingBasedHashMapApproach");
    }
}