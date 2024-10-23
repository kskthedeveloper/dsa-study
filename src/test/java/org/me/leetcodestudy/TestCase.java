package org.me.leetcodestudy;

public class TestCase<T, R> {
    public T input;
    public R expected;

    public TestCase(T input, R expected) {
        this.input = input;
        this.expected = expected;
    }
}
