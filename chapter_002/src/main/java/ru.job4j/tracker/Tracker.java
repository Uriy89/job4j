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
    private final Item[] items = new Item[100];
    public static final Random RN = new Random();
    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;
    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }
    /**
     *  Метод заменяет ячеку в массиве.
     */
    public void replace(String id, Item item) {
        for (int i = 0; i < position; i++) {
            if (item.getId().equals(id)) {
                items[i] = item;
                break;
            }
        }
    }
    /**
     *  Метод удаляет ячейку в массиве.
     */
    public boolean delete(String id) {
        for (Item item : this.items) {
            if (item.getId().equals(id)) {
                System.arraycopy(this.items, position, this.items, position - 1, items.length);
            }
        }
        return true;
    }
    /**
     * Метод возвращает копию массива без null элементтов.
     * @return копия массива.
     */
    public Item[] findAll() {
        return Arrays.copyOf(this.items, this.position);
    }
    /**
     * Метод проверяет все элементы массива с аргументом key
     * Если элементы совпадают, они записываются в новый массив.
     * @return Массив с проверенными элементами.
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[]{};
        for (int i = 0; i < result.length; i++) {
            if (items[position].equals(key)) {
                result[i] = items[position];
            }
        }
        return Arrays.copyOf(result, result.length);
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