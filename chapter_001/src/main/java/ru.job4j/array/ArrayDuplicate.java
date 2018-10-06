package ru.job4j.array;
import java.sql.Array;
import java.util.Arrays;
public class ArrayDuplicate {
    public String[] remove(String[] array) {
        int uniq = array.length;
        for (int outIdx = 0; outIdx < uniq; outIdx++) {
            for (int inIdx = outIdx + 1; inIdx < uniq; inIdx++) {
                if (array[outIdx].equals(array[inIdx])) {
                    array[inIdx] = array[uniq - 1];
                    uniq--;
                    inIdx--;
                }
            }
        }
        return Arrays.copyOf(array, uniq);
    }
}
