package ru.job4j;
import java.util.ArrayList;
import java.util.List;
public class ConvertList2Array {
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = list.size() / rows == 0 ? list.size() / rows : (list.size() / rows) + 1;
        int[][] array = new int[rows][cells];
        int row = 0;
        int colum = 0;
        for (int i : list) {
            array[row][colum++] = i;
            if (colum == array[row].length) {
                colum = 0;
                row++;
            }
        }
        return array;
    }
    public List<Integer> convert (List<int[]> list) {
        List<Integer> arr = new ArrayList<>();
        for (int[] i : list) {
            for (int j : i) {
                arr.add(j);
            }
        }
        return arr;
    }
}
