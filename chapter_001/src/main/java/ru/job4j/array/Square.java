package ru.job4j.array;

/**
 * Заполнение масива.
 * @author Yuriy Averianov.
 * @since 22.07.2018
 */
public class Square {
    /**
     * Заполнение массива степенями в квадрат.
     * @param bound длина массиваю.
     * @return возвращает элементы массива возведенные в степень.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for(int i = 0; i <= rst.length; i++) {
            rst[i++] = i * i;
        }
        return rst;
    }
}
