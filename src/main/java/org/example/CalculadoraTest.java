package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
    private Calculadora objetoCalculadoraTesteado;

    @Before
    public void setUp() {
    //Arrange
        objetoCalculadoraTesteado = new Calculadora();
    }

    @Test
    public void testAdd() {
        int a = 15;
        int b = 20;
        int expectedResult = 35;
        //Act
        long result = objetoCalculadoraTesteado.add(a, b);
        //Assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testSubtract() {
        int a = 25;
        int b = 20;
        int expectedResult = 5;
        long result = objetoCalculadoraTesteado.subtract(a, b);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testMultiply() {
        int a = 10;
        int b = 25;
        long expectedResult = 250;
        long result = objetoCalculadoraTesteado.multiply(a, b);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testDivide() {
        int a = 56;
        int b = 10;
        double expectedResult = 5.6;
        double result = objetoCalculadoraTesteado.divide(a, b);
        Assert.assertEquals(expectedResult, result, 0.00005);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        int a = 15;
        int b = 0;
        objetoCalculadoraTesteado.divide(a, b);
    }

}
