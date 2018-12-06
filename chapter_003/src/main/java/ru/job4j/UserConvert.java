package ru.job4j;
<<<<<<< Updated upstream
import java.util.ArrayList;
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
=======
import java.util.*;
public class UserConvert {
   private int id;
   private String name;
   private String city;
   User user = new User(this.id, this.name, this.city);
   public HashMap<Integer, User> process(List<User> list) {
       list.add(this.user);
       HashMap<Integer, User> res = new HashMap<>();
       for (User i : list) {
           res.put(id, user);
       }
       return res;
   }
>>>>>>> Stashed changes
}
