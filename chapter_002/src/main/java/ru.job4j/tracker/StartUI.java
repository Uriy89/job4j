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
<<<<<<< Updated upstream
        Tracker tracker = new Tracker();
        MenuTracker menu = new MenuTracker(this.input, tracker);
        menu.fillActions();

        do {
            menu.show();
            int key = Integer.valueOf(input.ask("Выберете пункт: "));
            menu.select(key);
        } while(!"q".equals(this.input.ask("Для выхода нажмите: q  ")));
    }

=======
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if (ADD.equals(answer)) {
                this.createItem();
            } else if (SHOW.equals(answer)) {
                tracker.showALLItems();
            } else if (EDIT.equals(answer)) {
                this.replaceItem();
            } else if (DELETE.equals(answer)) {
                this.deleteItem();
            } else if (FINDBYID.equals(answer)) {
                this.setFindbyidItem();
            } else if (FINDBYNAME.equals(answer)) {
                this.setFindbyNameItem();
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }
    /**
     * Метод реализует добавленяи новый заявки в хранилище.
     */
    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки: ");
        String desc = this.input.ask("Введите описание заявки: ");
        Item item = new Item(desc, name);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с Id : " + item.getId() + "-----------");
    }
    /**
     * Метод запроса для изменения заявки.
     */
    private void replaceItem() {
        String id = this.input.ask("Введите id: ");
        String name = this.input.ask("Введите имя новой заявки: ");
        String desc = this.input.ask("Введите описание новой заявки: ");
        Item item = new Item(desc, name);
        if (this.tracker.replace(id, item)) {
            System.out.println("Заявка успешна изменена");
        } else {
            System.out.println("id не найден");
        }
    }
    /**
     * Метод запроса для удаления заявки.
     */
    private void deleteItem() {
        String id = this.input.ask("Введите id: ");
        if (this.tracker.delete(id)) {
            System.out.print("Заявка успешно удалена");
        } else {
            System.out.println("id не найден");
        }
    }
    /**
     * Метод для поиска заявки по имени.
     */
    private void setFindbyNameItem() {
        String key = this.input.ask("Введите ключевое слово: ");
        Item[] byName = this.tracker.findByName(key);
        for (Item item : byName) {
            System.out.println(item);
        }
    }
    /**
     * Метод запроса для поиска заявки по id.
     */
    private void setFindbyidItem() {
        String id = this.input.ask("Введите id: ");
        Item byId = this.tracker.findById(id);
        if (byId != null) {
            System.out.println(byId);
        } else {
            System.out.println("id не найден");
        }
    }
    /**
     * Метод отображает список меню.
     */
    private void showMenu() {
        System.out.println("Меню.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        System.out.println("Select:");
    }
    /**
     * Запускт программы.
     * @param args
     */
>>>>>>> Stashed changes
    public static void main(String[] args) {
        Input input = new ConsoleInput();
        new StartUI(input).init();
    }
}
