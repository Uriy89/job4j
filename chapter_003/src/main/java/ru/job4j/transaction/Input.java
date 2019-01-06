package ru.job4j.transaction;

public interface Input {
    String ask(String question);
    int ask(String question, int[] range);
}
