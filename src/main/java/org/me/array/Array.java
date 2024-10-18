package org.me.array;

public class Array {
    int size;
    protected int[] items;

    public Array(int[] items) {
        this.items = items;
    }

    public Array(int size) {
        this.size = size;
    }

    void put(int index, int value) {
        this.items[index] = value;
    }

    int get(int index) {
        return this.items[index];
    }
}
