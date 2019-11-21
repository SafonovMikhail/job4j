package ru.job4j.loop;

public class Mortgage {
    public int year(double amount, int salary, double percent) {
        int year = 0;
        amount = (amount + amount * percent / 100);
        do {
            year += 1;
            amount = amount - salary;
        }
        while (amount > 0);
        return year;
    }
}
