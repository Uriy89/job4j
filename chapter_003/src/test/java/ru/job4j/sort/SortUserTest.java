package ru.job4j.sort;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class SortUserTest {
    @Test
    public void whenSortUsersByAge() {
        List<User> list = new ArrayList<>();
        list.add(new User("Tom", 23));
        list.add(new User("Nic", 20));
        list.add(new User("Ron", 32));
        List<User> exept = new ArrayList<>();
        exept.add(new User("Nic", 20));
        exept.add(new User("Tom", 23));
        exept.add(new User("Ron", 32));
        SortUser sortUser = new SortUser();
        Set<User> users = sortUser.sort(list);
        assertThat(users, is(exept));
    }
}
