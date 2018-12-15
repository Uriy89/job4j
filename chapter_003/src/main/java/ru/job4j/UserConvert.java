package ru.job4j;
import java.util.List;
import java.util.HashMap;
public class UserConvert {
    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> map = new HashMap<>();
        for (User i : list) {
            map.put(i.getId(), i);
        }
        return map;
    }
}
