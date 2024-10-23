package org.me.leetcodestudy;

// common interface for testing purpose
public interface Algorithm<T, R> {
    R apply(T input);
}
