package org.me.leetcodestudy;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRunner {
    public static <T, R> void runTests
            (Algorithm<T, R> algorithm,
             List<TestCase<T, R>> testCases,
             String approachName) {
        for (int i = 0; i < testCases.size(); i++) {
            TestCase<T, R> testCase = testCases.get(i);
            R result = algorithm.apply(testCase.input);
            assertEquals(testCase.expected, result, String.format("%s failed for test case %d", approachName, i + 1));
        }
    }
}
