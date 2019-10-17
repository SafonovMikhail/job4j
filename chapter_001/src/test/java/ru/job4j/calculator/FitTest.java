package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {
    @Test
    public void manWeight() {
        double in = 167;
        double expected = 77;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.1);
    }
    @Test
    public void womanWeight() {
        double in = 167;
        double expected = 65.5;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.1);
    }
    }
