package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
            for (int i = 0; i < data.length; i++) {
                int j = i;
                if (i == j && data[i][j] == false) {
                    result = false;
            }
        }
        return result;
    }
}
