package org.tpo.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HeapSortTest {
    @Test
    public void testNegativeArray() {
        int[] arr = new int[]{-1, -5, -2, -4, -3};
        HeapSort.apply(arr);
        assertArrayEquals(new int[]{-5, -4, -3, -2, -1}, arr);
    }

    @Test
    public void testPositiveArray() {
        int[] arr = new int[]{1, 5, 2, 4, 3};
        HeapSort.apply(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testMixedArray() {
        int[] arr = new int[]{-5, 10, 2, -1, 7, 1};
        HeapSort.apply(arr);
        assertArrayEquals(new int[]{-5, -1, 1, 2, 7, 10}, arr);
    }

    @Test
    public void testEmptyArray() {
        int[] arr = new int[]{};
        HeapSort.apply(arr);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    public void testNullArray() {
        assertThrows(NullPointerException.class, () -> HeapSort.apply(null));
    }
}
