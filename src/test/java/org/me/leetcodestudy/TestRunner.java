package org.me.leetcodestudy;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRunner {
    public static <T, R> void runTests
            (Algorithm<T, R> algorithm,
             List<TestCase<T, R>> testCases,
             String approachName) {
        for (int i = 0; i < testCases.size(); i++) {
            TestCase<T, R> testCase = testCases.get(i);
            R result = algorithm.apply(testCase.input);

            // Sort the result and expected lists for comparison if they are lists of lists
            if (result instanceof List && testCase.expected instanceof List) {
                result = (R) sortListOfLists((List<List<String>>) result);
                testCase.expected = (R) sortListOfLists((List<List<String>>) testCase.expected);
            }

            assertEquals(testCase.expected, result, String.format("%s failed for test case %d", approachName, i + 1));
        }

    }

    private static List<List<String>> sortListOfLists(List<List<String>> listOfLists) {
        // Sort each inner list
        List<List<String>> sortedList = listOfLists.stream()
                .map(innerList -> innerList.stream().sorted().collect(Collectors.toList()))
                .collect(Collectors.toList());

        // Sort the outer list based on the first element of each inner list
        sortedList.sort((a, b) -> a.get(0).compareTo(b.get(0)));
        return sortedList;
    }
}
