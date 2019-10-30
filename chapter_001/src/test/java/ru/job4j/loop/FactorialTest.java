package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void factorial5Equals120() {
        int n = 5;
        int out = Factorial.calc(n);
        int expected = 120;
        Assert.assertEquals(expected, out);

    }
}
