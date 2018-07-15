package ru.job4j.calculate;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.GetResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenMinOneMinusOneThenOne() {
        Calculator calc = new Calculator();
        calc.min(2D, 1D);
        double result = calc.GetResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenDelTwoOnTwoThenTwo() {
        Calculator calc = new Calculator();
        calc.del(4D, 2D);
        double result = calc.GetResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenUmnTwoOnTwoThenFore() {
        Calculator calc = new Calculator();
        calc.umn(2D, 2D);
        double result = calc.GetResult();
        double expected = 4D;
        assertThat(result, is(expected));
    }
}
