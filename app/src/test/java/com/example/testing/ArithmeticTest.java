package com.example.testing;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

import model.Arithmetic;

public class ArithmeticTest {

    @Test
    public void testAddition()
    {
        Arithmetic arithmetic = new Arithmetic();
        float expectedResult = 10;
        float actualResult = arithmetic.add(4, 6);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testSubtraction()
    {
        Arithmetic arithmetic = new Arithmetic();
        float expectedResult = -2;
        float actualResult = arithmetic.subtract(4, 6);
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testDivide()
    {
        Arithmetic arithmetic = new Arithmetic();
        float expectedResult = 1;
        float actualResult = arithmetic.divide(4, 6);
        assertEquals(expectedResult,actualResult);
    }
}
