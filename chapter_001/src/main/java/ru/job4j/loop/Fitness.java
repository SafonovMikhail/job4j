package ru.job4j.loop;

public class Fitness {
    public int calc(int ivan, int nik) {
        int month = 0;
        while (nik > ivan) {
            month += 1;
            ivan *= 3;
            nik *= 2;
        }
        return month;
    }
}
