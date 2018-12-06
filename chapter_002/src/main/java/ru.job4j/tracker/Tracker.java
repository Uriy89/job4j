package ru.job4j.tracker;
import java.util.*;
/**
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final List<Item> items = new ArrayList<>();
    public static final Random RN = new Random();
    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items.add(items.size(), item);
        return item;
    }
    /**
     *  Метод заменяет ячеку в массиве.
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int i = 0; i < items.size(); i++) {
            if (item != null && items.get(i).getId().equals(id)) {
                items.set(i, item);
                item.setId(id);
                result = true;
                break;
            }
        }
        return result;
    }
    /**
     *  Метод удаляет ячейку в массиве.
     */
    public boolean delete(String id) {
        boolean result = false;
        Iterator it = items.iterator();
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(id)) {
                items.remove(it);
                result = true;
                break;
            }
        }
        return result;
    }
    /**
     * Метод возвращает копию массива без null элементтов.
     * @return копия массива.
     */
    public List<Item> findAll() {
        return items;
    }
    /**
     * Метод проверяет все элементы массива с аргументом key
     * Если элементы совпадают, они записываются в новый массив.
     * @return Массив с проверенными элементами.
     */
    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<>();
        for (Item i : items) {
            if (i.getName().equals(key)) {
                result.add(i);
            }
        }
        return result;
    }
    /**
     *  Метод проверяет элементы массива.
     * @param id - аргумент для сравнения элементов.
     * @return возвращает найденый элемент.
     */
    protected Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }
    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }
}
