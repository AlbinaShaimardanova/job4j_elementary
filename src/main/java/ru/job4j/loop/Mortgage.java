package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double rest = amount;
        while (rest > 0) {
            rest = rest + rest * (percent/100) - salary;
            year++;
        }
        return year;
    }
}
