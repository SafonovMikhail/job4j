package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqMaxTest {
    @Test
    public void SqAreaMaxFirst(){
        int first = 4;
        int second = 1;
        int third = 1;
        int fourth = 1;
        int out = SqMax.max(first, second, third, fourth);
        int expected = first;
        Assert.assertEquals(expected, out);

    }
    @Test
    public void SqAreaMaxSecond(){
        int first = 1;
        int second = 4;
        int third = 1;
        int fourth = 1;
        int out = SqMax.max(first, second, third, fourth);
        int expected = second;
        Assert.assertEquals(expected, out);

    }
    @Test
    public void SqAreaMaxThird(){
        int first = 1;
        int second = 1;
        int third = 4;
        int fourth = 1;
        int out = SqMax.max(first, second, third, fourth);
        int expected = third;
        Assert.assertEquals(expected, out);

    }
    @Test
    public void SqAreaMaxFourth(){
        int first = 1;
        int second = 1;
        int third = 1;
        int fourth = 4;
        int out = SqMax.max(first, second, third, fourth);
        int expected = fourth;
        Assert.assertEquals(expected, out);

    }
}
