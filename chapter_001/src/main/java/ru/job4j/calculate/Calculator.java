package ru.job4j.calculate;

public class Calculator {

    private double result;

    public void add(double first, double second){
        this.result = first + second;
    }

    public void min(double first, double second){
        this.result = first - second;
    }

    public void del(double first, double second){
        this.result = first / second;
    }

    public void umn(double first, double second){
        this.result = first * second;
    }

    public double GetResult() {
        return this.result;
    }

}
