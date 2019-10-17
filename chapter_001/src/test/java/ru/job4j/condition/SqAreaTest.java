package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {
    @Test
    public void SqArea(){
        int inP = 4;
        int inK = 1;
        double out = SqArea.square(inP,inK);
        double expected = 1;
        Assert.assertEquals(expected, out, 0.01);

    }
}
