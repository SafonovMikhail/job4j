package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {
    @Test
    public void when2() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(2);
        assertThat(rsl, is(true));
    }

    @Test
    public void when3() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(3);
        assertThat(rsl, is(true));
    }

    @Test
    public void when5() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(5);
        assertThat(rsl, is(true));
    }

    @Test
    public void when7() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(7);
        assertThat(rsl, is(true));
    }

    @Test
    public void when89() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(89);
        assertThat(rsl, is(true));
    }
    @Test
    public void when88() {
        CheckPrimeNumber prime = new CheckPrimeNumber();
        boolean rsl = prime.check(88);
        assertThat(rsl, is(false));
    }

}