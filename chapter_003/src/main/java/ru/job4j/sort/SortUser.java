package ru.job4j.sort;
import java.util.*;

public class SortUser {
    public Set<User> sort(List<User> list) {
        return new TreeSet<>(list);
    }

    public List<User> sortNameLength(List<User> list) {
        Collections.sort(list, new Comparator<User>() {
            @Override
            public int compare(User user, User t1) {
                return user.getName().length() - t1.getName().length();
            }
        });
        return list;
    }

    public List<User> sortByAllFields (List<User> list) {
        Collections.sort(list, new Comparator<User>() {
            @Override
            public int compare(User user, User t1) {
                    int nameComp = user.getName().compareTo(t1.getName());
                    if (nameComp != 0) {
                        return nameComp;
                    } else {
                        return user.getAge() - t1.getAge();
                    }
            }
        });
        return list;
    }
}
