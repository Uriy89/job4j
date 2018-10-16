package ru.job4j.tracker;
/**
 * @version $Id$
 * @since 0.1
 */
public class StartUI {
    private Input input;
    private int[] ranges = new int[]{0, 1, 2, 3, 4, 5};
    public StartUI(Input input, Tracker tracker) {
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
            menu.select(input.ask("Выбор: ", ranges));
        } while(!"q".equals(this.input.ask("Для выхода нажмите: q  ")));
    }
    public static void main(String[] args) {
        new StartUI(
                new ValidateInput(
                        new ConsoleInput()
                ),
                new Tracker()
        ).init();
    }
}
