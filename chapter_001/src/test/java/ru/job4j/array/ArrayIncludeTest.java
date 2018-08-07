package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayIncludeTest {
    @Test
    public void whenOneArrayAndArrayTwoIncludeArrayThree() {
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8, 9};
        int[] except = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayInclude summ = new ArrayInclude();
        int[] result = summ.concat(a, b);
        assertThat(result, is(except));
    }
}
