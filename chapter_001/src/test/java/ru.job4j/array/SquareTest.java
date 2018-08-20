package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void whenBound3Then149() {
        Square square = new Square();
        int[] rst = square.calculate(3);
        int[] expect = new int[] {1, 4, 9};
        assertThat(rst, is(expect));
    }
}
