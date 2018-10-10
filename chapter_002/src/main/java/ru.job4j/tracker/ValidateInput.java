package ru.job4j.tracker;

public class ValidateInput extends ConsoleInput {
    public int ask(String qiestion, int[] range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.ask(qiestion, range);
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