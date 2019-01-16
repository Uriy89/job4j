package ru.job4j.transaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        Map<Integer, String> res = new HashMap<>();
        res.put(1, "W");
        res.put(2, "E");
        res.put(3, "R");
        res.put(4, "T");
        System.out.println(res.containsKey(1));
    }

}
