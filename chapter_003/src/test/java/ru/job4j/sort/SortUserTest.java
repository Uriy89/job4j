package ru.job4j.sort;
import org.junit.Test;

import java.util.*;

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
        assertThat(users.toString(), is(exept.toString()));
    }
    @Test
    public void whenSortUserByString() {
        List<User> list = new ArrayList<>();
        list.add(new User("Tomas", 51));
        list.add(new User("Tom", 32));
        List<User> exept = new ArrayList<>();
        exept.add(new User("Tom", 32));
        exept.add(new User("Tomas", 51));
        SortUser sortUser = new SortUser();
        List<User> list2 = sortUser.sortNameLength(list);
        assertThat(list2.toString(), is(exept.toString()));
    }
    @Test
    public void whenSortByAllFields() {
        List<User> list = new ArrayList<>();
        list.add(new User("Tomas", 25));
        list.add(new User("Tom", 30));
        list.add(new User("Tomas", 30));
        list.add(new User("Tom", 25));
        List<User> exept = new ArrayList<>();
        exept.add(new User("Tom", 25));
        exept.add(new User("Tom", 30));
        exept.add(new User("Tomas", 25));
        exept.add(new User("Tomas", 30));
        SortUser sortUser = new SortUser();
        List<User> list2 = sortUser.sortByAllFields(list);
        assertThat(list2.toString(), is(exept.toString()));
    }
}
