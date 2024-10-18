package org.me.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.me.Searchable;

public class LinearSearchTest {
    @Test
    public void testLinearSearch(){
        int[] items = new int[]{1, 2, 3, 4, 5};
        Searchable arr = new LinearSearch(items);

        int index = arr.findItem(4);

        assertEquals(3, index);
    }

    @Test
    public void testLinearSearchWorstCase(){
        int[] items = new int[]{1, 2, 3, 4, 5};
        Searchable arr = new LinearSearch(items);

        int index = arr.findItem(10);

        assertEquals(-1, index);
    }
}
