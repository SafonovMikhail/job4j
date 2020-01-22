package ru.job4j.loop;

public class Mortgage {
    public int year(double amount, int salary, double percent) {
        int year;
        for (year = 1; amount > 0; year++) {
            amount = (1 + percent / 100) * amount - salary;
            if (amount < 0) {
                break;
            }
        }
        return year;
    }
}