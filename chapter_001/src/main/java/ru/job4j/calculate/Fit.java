package ru.job4j.calculate;
/**
 * Программа расчета идеального веса.
 */
public class Fit {

    private double idialManWeight;
    private double idialWomanWeight;
    /**
     * Идеальный вес для мужщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double manWeight(double height) {
        return idialManWeight = (height - 100) * 1.15;
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double womanWeight(double height) {
        return idialManWeight = (height - 110) * 1.15;
    }

}
