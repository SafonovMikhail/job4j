package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {
    @Test
    public void Point() {
        int inX1 = 1;
        int inY1 = 0;
        int inX2 = 2;
        int inY2 = 0;
        double out = Point.distance(inX1, inY1, inX2, inY2);
        double expected = 1;
        Assert.assertEquals(expected, out, 0.01);

    }


}
