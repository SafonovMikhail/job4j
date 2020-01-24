package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PrimeNumberTest {
    @Test
    public void when7() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(7);
        assertThat(count, is(3));
    }

    @Test
    public void when11() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(11);
        assertThat(count, is(4));
    }

    @Test
    public void when3() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(3);
        assertThat(count, is(1));
    }
    @Test
    public void when5() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(5);
        assertThat(count, is(2));
    }
}