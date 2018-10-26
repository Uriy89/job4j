package ru.job4j;
import java.util.List;
public class ConvertList2Array {
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = rows;
        int[][] array = new int[rows][cells];
        for (int i : list) {
            for (int j : list) {
                if (j == rows) {
                    cells = list.indexOf(rows);
                }
            }
            array[rows][cells] = (list.indexOf(i));
        }
        return array;
    }
}
