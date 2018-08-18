package ru.job4j.tracker;
import org.junit.Test;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1","testDescription",123L);
        tracker.add(item);
        assertThat(tracker.getAll()[0], is(item));
    }
}
