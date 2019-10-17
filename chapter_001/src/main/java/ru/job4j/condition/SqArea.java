package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        int h = (p / 2) / (k + 1);
        int L = h * k;
        return L * h;
    }
    public static void main(String[] args) {
        double result = square(4, 1);
        System.out.println(result);
        double result1 = square(6, 2);
        System.out.println(result1);
    }
}
