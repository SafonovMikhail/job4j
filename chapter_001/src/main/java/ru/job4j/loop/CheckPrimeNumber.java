package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int num) {
        boolean prime = false;
        if (num < 2)
            prime = false;
        else
            prime = true;
        for (int d = 2; d < num; d++) {
            if (num % d == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
