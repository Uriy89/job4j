package ru.job4j.loop;
/**
 * Вычисление факториала.
 * @author Yuriy Averianov.
 * @since 21.07.2018
 */
public class Factorial {
    /**
     * Факториал числа.
     *
     * @param n положительное целое число.
     * @return факториал n.
     */
    public int calc(int n) {
        int f = 1;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                f *= i;
            }
        }
        return f;
    }
}
