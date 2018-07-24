package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactoriaTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial umn = new Factorial();
        int result = umn.calc(5);
        assertThat(result, is(120));
    }
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial umn = new Factorial();
        int result = umn.calc(0);
        assertThat(result, is(1));
    }
    @Test
    public void whenCalculateFactorialNegativNumber() {
        Factorial umn = new Factorial();
        int result = umn.calc(-2);
        assertThat(result, is(0));
    }

}
