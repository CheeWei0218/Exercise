package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testCalculatorAddition() {
        Calculator calc = new Calculator();
        calc.setOperation(new Addition());

        assertEquals(5.0, calc.calculate(2, 3), 0.0001); // add delta for double comparison
    }

    @Test
    public void testCalculatorSubtraction() {
        Calculator calc = new Calculator();
        calc.setOperation(new Subtraction());

        assertEquals(4.0, calc.calculate(8, 4), 0.0001); // add delta for double comparison
    }

    @Test
    public void testCalculatorMultiplication() {
        Calculator calc = new Calculator();
        calc.setOperation(new Multiplication());

        assertEquals(6.0, calc.calculate(2, 3), 0.0001); // add delta for double comparison
    }

    @Test
    public void testCalculatorDivision() {
        Calculator calc = new Calculator();
        calc.setOperation(new Division());

        assertEquals(4.0, calc.calculate(12, 3), 0.0001); // add delta for double comparison
    }
}
