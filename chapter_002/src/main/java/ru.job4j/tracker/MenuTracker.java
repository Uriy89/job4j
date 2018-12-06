package ru.job4j.tracker;
import java.util.List;
/**
 * Класс перезаписания заявки.
 */
class EditItem implements UserAction {
    public int key() {
        return 2;
    }
    public void execute(Input input, Tracker tracker) {
        String id = input.ask("Введите id заявки: ");
        String name = input.ask("Введите имя заявки: ");
        String desc = input.ask("Введите описание заявки: ");
        Item item = new Item(desc, name);
        item.setId(id);
        if (tracker.replace(id, item)) {
            System.out.println("Заявка успешно изменена!");
        } else {
            System.out.println("id не найден");
        }
    }

    public String info() {
        return String.format("%s. %s", this.key(), "Изменение заявки.");
    }
}

public class MenuTracker {
    /**
     * Получение данных от пользователя.
     */
    private final Input input;
    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;
    private int position = 0;
    private UserAction[] actions = new UserAction[6];
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Метод управления меню.
     */
    public void fillActions() {
        this.actions[position++] = this.new AddItem();
        this.actions[position++] = new MenuTracker.ShowItems();
        this.actions[position++] = new EditItem();
        this.actions[position++] = new MenuTracker.DeleteItems();
        this.actions[position++] = new MenuTracker.FindByIdItems();
        this.actions[position++] = new MenuTracker.FindByNameItems();
    }

    public void addActions(UserAction action) {
        this.actions[position++] = action;
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

    /**
     * Внутренний класс добавления новой заявки.
     */
    private class AddItem implements UserAction {

        public int key() {
            return 0;
        }
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Введите имя заявки: ");
            String desc = input.ask("Введите описание заявки: ");
            tracker.add(new Item(desc, name));
            System.out.println("Заявка успешно добавлена!");
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Добавление новой заявки.");
        }
    }
    /**
     * Внутренний класс отображения всех.
     */
    private static class ShowItems implements UserAction {

        public int key() {
            return 1;
        }
        public void execute(Input input, Tracker tracker) {
            for (Item item : tracker.findAll()) {
                System.out.println(
                        String.format("%s. %s", item.getId(), item.getName())
                );
            }
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Показать все заявки.");
        }
    }
    /**
     * Внутренний класс удаления заявки.
     */
    private static class DeleteItems implements UserAction {
        public int key() {
            return 3;
        }
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Введите id заявки: ");
            tracker.delete(id);
            if (tracker.delete(id)) {
                System.out.println("Заявка успешно удалена!");
            } else {
                System.out.println("id не найден!");
            }
        }
        public String info() {
            return String.format("%s. %s", this.key(), "Удаление заявки.");
        }
    }
    /**
     * Внутренний клас поиска заявки по Id.
     */
    private static class FindByIdItems implements UserAction {
        public int key() {
            return 4;
        }
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Введите id заявки: ");
            Item byId = tracker.findById(id);
            if (byId != null) {
                System.out.println(byId);
            } else {
                System.out.println("id не найден!");
            }
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Поиск заявки по Id.");
        }
    }
    /**
     * Внутренний клас поиска заявки по имени.
     */
    private static class FindByNameItems implements UserAction {
        public int key() {
            return 5;
        }
        public void execute(Input input, Tracker tracker) {
            String key = input.ask("Введите имя заявки: ");
            List<Item> byKey = tracker.findByName(key);
            if (byKey.size() != 0) {
                for (Item item : byKey) {
                    System.out.println(item);
                }
            } else {
                System.out.println("Имя не найдено!");
            }
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Поиск заявки по имени.");
        }
    }
}
