package ru.job4j.sort;

public class User implements Comparable<User> {
    String name;
    int age;
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    @Override
    public int compareTo(User user) {
        int res = this.age - user.getAge();
        return res;
    }
    @Override
    public String toString() {
        return "User{ name = " + name +
                "age = " + age + '}';
    }
}
