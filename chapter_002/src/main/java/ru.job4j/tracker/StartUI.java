package ru.job4j.tracker;
/**
 * @version $Id$
 * @since 0.1
 */
public class StartUI {
    private Input input;

    public StartUI(Input input) {
        this.input = input;
    }
    /**
     * Метод для использования меню.
     */
    public void init() {
        Tracker tracker = new Tracker();
        MenuTracker menu = new MenuTracker(this.input, tracker);
        menu.fillActions();

        do {
            menu.show();
            int key = Integer.valueOf(input.ask("Выберете пункт: "));
            menu.select(key);
        } while(!"q".equals(this.input.ask("Для выхода нажмите: q  ")));
    }
    public static void main(String[] args) {
        Input input = new ConsoleInput();
        new StartUI(input).init();
    }
}
