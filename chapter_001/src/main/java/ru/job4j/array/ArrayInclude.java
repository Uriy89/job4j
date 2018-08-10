package ru.job4j.array;

public class ArrayInclude {
    public int[] concat(int[] a, int[] b) {
        int[] arr = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length)
            arr[k++] = a[i] < b[j] ? a[i++] :  b[j++];
        while (i < a.length)
            arr[k++] = a[i++];
        while (j < b.length)
            arr[k++] = b[j++];
        return arr;
    }
}
