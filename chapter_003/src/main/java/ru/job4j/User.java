package ru.job4j;

public class User {
    int id;
    String name;
    String city;
    public User(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }
    @Override
    public String toString() {
        return "User[name = " + name + ", city = " + city + "]";
    }

}
