package com.projeto_tdd.projeto.testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;


class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
     void testAdd() {
        double result = calculator.add(1, 2);
        Assertions.assertEquals(3, result, "1 + 2 should be 3");
    }

    @Test
    void testSubtract() {
        double result = calculator.subtract(5, 3);
        Assertions.assertEquals(2, result, "5 - 3 should be 2");
    }

    @Test
    void testMultiply() {
        double result = calculator.multiply(2, 3);
        Assertions.assertEquals(6, result, "2 * 3 should be 6");
    }

    @Test
    void testDivide() {
        double result = calculator.divide(6, 3);
        Assertions.assertEquals(2, result, "6 / 3 should be 2");
    }

    @Test
    void testPower() {
        double result = calculator.power(2, 3);
        Assertions.assertEquals(8, result, "2 ^ 3 should be 8");
    }

    @Test
    void testSqrt() {
        double result = calculator.sqrt(9);
        Assertions.assertEquals(3, result, "Square root of 9 should be 3");
    }

    @Test
    void testSqrtNegative() {
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.sqrt(-1), "Should throw ArithmeticException for negative numbers");
    }

    @Test
    void testHistory() {
        calculator.add(1, 2);
        calculator.subtract(3, 1);
        List<String> history = calculator.getHistory();
        Assertions.assertEquals(2, history.size(), "History should contain 2 operations");
    }

    @Test
    void testClearHistory() {
        calculator.add(1, 2);
        calculator.clearHistory();
        Assertions.assertTrue(calculator.getHistory().isEmpty(), "History should be empty after clearing");
    }
}
