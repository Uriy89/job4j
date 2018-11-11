package ru.job4j;
import java.util.List;
public class  ConvertList2Array {
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = list.size() / rows == 0 ? list.size() / rows : (list.size() / rows) + 1;
        int[][] array = new int[rows][cells];
        int row = 0;
        int colum = 0;
        for (int i : list) {
            array[row][colum++] = i;
            if (colum == cells) {
                colum = 0;
                row++;
            }
        }
        return array;
    }
}
