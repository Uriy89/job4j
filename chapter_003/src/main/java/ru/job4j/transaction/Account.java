package ru.job4j.transaction;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.List;
import java.util.Random;

/**
 * @author Averianov Yuriy;
 * @since 04.01.2019;
 */
public class Account {
    private double value;
    private String requisites;

    public Account(double value, String requisites) {
        this.value = value;
        this.requisites = requisites;
    }
    public Account() {}

    public double getValue() {
        return value;
    }

    public void setRequisites(String requisites) {
        this.requisites = requisites;
    }

    public void setValue(double value) {
        this.value = value;
    }

}
