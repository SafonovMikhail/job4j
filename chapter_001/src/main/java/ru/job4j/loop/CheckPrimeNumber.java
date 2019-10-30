package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int num) {
        boolean prime = false;
        if (num == 1)
            prime = false;
        for (int d = 2; d * d <= num; d++) {
            if (num % d == 0) {
                prime = false;
                break;
            } else {
                prime = true;
            }
        }
        return prime;
    }
}
