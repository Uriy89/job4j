package ru.job4j.array;
public class BubbleSort {
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minI = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minI = j;
                }
            }
            if (i != minI) {
                int tmp = array[i];
                array[i] = array[minI];
                array[minI] = tmp;
            }
        }
        return array;
    }
}
