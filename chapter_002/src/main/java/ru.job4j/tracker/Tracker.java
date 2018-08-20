package ru.job4j.tracker;

import java.lang.ref.SoftReference;
import java.util.*;
import java.lang.String;
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
    public void Item replace(String id, Item item) {
        for (; position < items.length; position++) {
            if (item.getId().equals(id)) {
                 items[position] = items[position].replaceAll(Item);

            }
        }
    }

    /**
     *  Метод удаляет ячейку в массиве.
     */
    public void delete(String id) {
        Item[] result = new Item[];
        for(Item item : this.items) {
            if (item.getId().equals(id)) {
                System.arraycopy(items, 0, result, 0, items.length);
            }
        }
    }


    /**
     * Метод возвращает копию массива без null элементтов.
     * @return копия массива.
     */
    public Item[] findAll() {
        Item[] result = new Item[100];
        for (Item item : items) {
            if(result != null) {
                Arrays.copyOf(this.items, items.length);
            }
        }
        return result;
    }

    /**
     * Метод проверяет все элементы массива с аргументом key
     * Если элементы совпадают, они записываются в новый массив.
     * @return Массиы с проверенными элементами.
     */
    public Item[] findByName(String key) {
         Item[] result = new Item[];
         for (Item item : items) {
             if(item.getName().equals(key)) {
                 result = Arrays.copyOf(items, result.length);
             }
         }
         return result;
    }

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
    String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }
}
