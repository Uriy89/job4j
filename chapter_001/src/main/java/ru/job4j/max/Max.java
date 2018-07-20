package ru.job4j.max;

public class Max {
    public int maxim(int first, int second) {
        return first > second ? first : second;
    }
    public int max(int first, int second, int third) {
        int temp = this.maxim(first, second);
        int temp2 = this.maxim(temp, third);
        return temp2;
    }
}
