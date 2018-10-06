package ru.job4j.tracker;

public class MenuTracker {
    /**
     * Получение данных от пользователя.
     */
    private final Input input;
    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;
    private UserAction[] actions = new UserAction[6];
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void fillActions() {
        this.actions[0] = new AddItem();
    }

    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }

    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    private class AddItem implements UserAction {

        public int key() {
            return 0;
        }
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Введите имя заявки: ");
            String desc = input.ask("Введите описание заявки: ");
            tracker.add(new Item(desc, name));
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Добавление новой заявки.");
        }
    }
}
