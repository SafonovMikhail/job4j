package ru.job4j.condition;

public class MultiMax {
    public static int maxOfThree(int a, int b, int c) {
        int semiMax = a > b ? a : b;
        int max = semiMax > c ? semiMax : c;
        return max;
    }

}
