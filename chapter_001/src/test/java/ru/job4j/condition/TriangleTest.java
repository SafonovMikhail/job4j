package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;


public class TriangleTest {
    @Test
    public void triangleExist() {
        boolean result = Triangle.exist(3, 4, 5);
        assertThat(result, is(true));
    }
}
