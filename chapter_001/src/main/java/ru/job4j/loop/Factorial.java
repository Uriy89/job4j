package ru.job4j.loop;

/**
 * Вычисление факториала.
 * @author Yuriy Averianov.
 * @since 21.07.2018
 */
public class Factorial {
    public int calc(int n) {
        int f = 1;
        if(n == 0) {
            return 1;
        } else {
            for (int i = 1; i <= n; i++) {
                f *= i;
            }
        }
        return f;
    }
}
