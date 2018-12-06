package ru.job4j;
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
public class User {
    int id;
    String name;
    String city;
    public User(int id, String name, String city) {
<<<<<<< Updated upstream
        this.id = id;
        this.name = name;
        this.city = city;
=======
        this.name = name;
        this.city = city;
        this.id = id;
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
    @Override
    public String toString() {
        return "User[name = " + name + ", city = " + city + "]";
    }
=======
>>>>>>> Stashed changes
}
