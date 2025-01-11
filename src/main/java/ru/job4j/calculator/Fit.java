package ru.job4j.calculator;

public class Fit {

    /**
     * Calculates ideal weight for a man based on his height.
     *
     * @param height - height of the man in cm
     * @param adjustment - adjustment to height
     * @return ideal weight in kg
     */
    public static double calculateWeight(int height, int adjustment) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be greater than 0");
        }
        return (height - adjustment) * 1.15;
    }

    public static void main(String[] args) {
        int heightMan = 187;
        double man = Fit.calculateWeight(heightMan, 100);
        System.out.printf("Man %d is %.2f%n", heightMan, man);
        int heightWoman = 166;
        double woman = Fit.calculateWeight(heightWoman, 110);
        System.out.printf("Woman %d is %.2f%n", heightWoman, woman);
    }
}
