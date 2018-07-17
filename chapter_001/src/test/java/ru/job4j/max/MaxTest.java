package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenFirstLessSecond() {
        Max val = new Max();
        int result = val.maxim(2, 3);
        assertThat(result, is(3));
    }
}