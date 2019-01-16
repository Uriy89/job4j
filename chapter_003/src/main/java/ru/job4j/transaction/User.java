package ru.job4j.transaction;

/**
 * @author Averianov Yuriy;
 * @since 04.01.2019;
 */
public class User {
    private String name;
    private String passport;

    public User(String name, String passport) {
        this.name = name;
        this.passport = passport;
    }
    public User() {}

    public String getName() {
        return name;
    }

    public String getPassport() {
        return passport;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof User)) return false;
        User user = (User) o;
        if(!passport.equals(user.name) || !passport.equals(user.passport)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return passport.hashCode();
    }

}
