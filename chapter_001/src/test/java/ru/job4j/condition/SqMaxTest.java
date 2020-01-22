package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqMaxTest {
    @Test
    public void SqAreaMaxFirst_04_03_02_01(){
        int first = 4;
        int second = 3;
        int third = 2;
        int forth = 1;
        int out = SqMax.max(first, second, third, forth);
        int expected = first;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void SqAreaMaxSecond_03_04_02_01(){
        int first = 3;
        int second = 4;
        int third = 2;
        int forth = 1;
        int out = SqMax.max(first, second, third, forth);
        int expected = second;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void SqAreaMaxThird_03_02_04_01(){
        int first = 3;
        int second = 2;
        int third = 4;
        int forth = 1;
        int out = SqMax.max(first, second, third, forth);
        int expected = third;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void SqAreaMaxforth_01_02_03_04(){
        int first = 1;
        int second = 2;
        int third = 3;
        int forth = 4;
        int out = SqMax.max(first, second, third, forth);
        int expected = forth;
        Assert.assertEquals(expected, out);
    }
    @Test
    public void SqAreaMaxforth_01_03_02_04(){
        int first = 1;
        int second = 3;
        int third = 2;
        int forth = 4;
        int out = SqMax.max(first, second, third, forth);
        int expected = forth;
        Assert.assertEquals(expected, out);
    }
    @Test
    public void SqAreaMaxforth_02_01_03_04(){
        int first = 2;
        int second = 1;
        int third = 3;
        int forth = 4;
        int out = SqMax.max(first, second, third, forth);
        int expected = forth;
        Assert.assertEquals(expected, out);
    }
    @Test
    public void SqAreaMaxforth_03_01_02_04(){
        int first = 3;
        int second = 1;
        int third = 2;
        int forth = 4;
        int out = SqMax.max(first, second, third, forth);
        int expected = forth;
        Assert.assertEquals(expected, out);
    }
    @Test
    public void SqAreaMaxforth_02_03_01_04(){
        int first = 2;
        int second = 3;
        int third = 1;
        int forth = 4;
        int out = SqMax.max(first, second, third, forth);
        int expected = forth;
        Assert.assertEquals(expected, out);
    }
    @Test
    public void SqAreaMaxforth_03_02_01_04(){
        int first = 3;
        int second = 2;
        int third = 1;
        int forth = 4;
        int out = SqMax.max(first, second, third, forth);
        int expected = forth;
        Assert.assertEquals(expected, out);
    }

}
