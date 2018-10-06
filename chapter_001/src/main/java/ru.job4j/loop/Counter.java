package ru.job4j.loop;
/**
 * Подсчет суммы чётных чисел в диапазоне.
 * @autor Yuriy Averianov.
 * @since 20.07.2018.
 */
public class Counter {
    /**
     * Цикл диапозона чисел.
     * @param start стартовое число диапозона.
     * @param finish конечное число диапозона.
     * @return Сумма четных чисел в диапозоне start, finish.
     */
    public int add(int start, int finish) {
        int i = 0;
        for (; start <= finish; start++) {
            if (start % 2 == 0) {
                i += start;
            }
        }
        return i;
    }
}



