package ru.job4j.tracker;
import org.junit.Test;

import java.time.ZoneOffset;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("name", "desc", 435L);
        tracker.add(item);
        assertThat(tracker.findAll()[0], is(item));
    }
    @Test
    public void whenDeleteItemThenReturnNewArray() {
        Tracker tracker = new Tracker();
        Item item = new Item("name1", "name2", 435L);
        tracker.delete("name2");
        assertThat(item, is("name1", 435L));
    }
    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1","testDescription",123L);
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id
        tracker.add(previous);
        // Создаем новую заявку.
        Item next = new Item("test2","testDescription2",1234L);
        // Проставляем старый id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
        // Обновляем заявку в трекере.
        tracker.replace(previoues.getId(), next);
        // Проверяем, что заявка с таким id имеет новые имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }
}
