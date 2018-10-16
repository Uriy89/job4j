package ru.job4j.tracker;

public class ValidateInput implements Input  {
    private final Input input;
    public ValidateInput(final Input input) {
        this.input = input;
    }
    @Override
    public String ask(String question) {
        return this.input.ask(question);
    }
    public int ask(String qiestion, int[] range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = this.input.ask(qiestion, range);
                invalid = false;
            } catch (MenuOutException moe) {
                System.out.println("Введите правельный пункт меню");
            } catch (NumberFormatException nfe) {
                System.out.println("Введите правельный пункт меню");
            }
        } while (invalid);
        return value;
    }
}