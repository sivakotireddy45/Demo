package com.example.trail_1;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
    Calculator calculator;
    //oncreate


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        calculator = new Calculator();
    }

    public void testAdd() {
        int expected = 50;
        int actual = calculator.add(10, 40);
        assertEquals(expected, actual);
    }

    public void testMul() {
        int exp = 20;
        int act = calculator.multiply(5, 4);
        assertEquals(exp, act);
    }

    //ondestroy

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
