package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort arr = new BubbleSort();
        int[] input = new int[] {1, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] tr = new int[] {0, 1, 1, 2, 3, 4, 5, 7, 8};
        int[] result = arr.sort(input);
        assertThat(result, is(tr));
    }

}
