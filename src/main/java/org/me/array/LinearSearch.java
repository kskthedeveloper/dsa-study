package org.me.array;

import org.me.Searchable;

public class LinearSearch extends Array implements Searchable {
    public LinearSearch(int[] items) {
        super(items);
    }

    public LinearSearch(int size) {
        super(size);
    }

    @Override
    public int findItem(int item) {
        int length = this.items.length;

        for (int i = 0; i < length; i++) {
            if (this.items[i] == item)
                return i;
        }
        return -1;
    }
}
