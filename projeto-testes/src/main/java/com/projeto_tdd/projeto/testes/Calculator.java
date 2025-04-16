package com.projeto_tdd.projeto.testes;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<String> history = new ArrayList<>();

    public double add(double a, double b) {
        double result = a + b;
        history.add(a + " + " + b + " = " + result);
        return result;
    }

    public double subtract(double a, double b) {
        double result = a - b;
        history.add(a + " - " + b + " = " + result);
        return result;
    }

    public double multiply(double a, double b) {
        double result = a * b;
        history.add(a + " * " + b + " = " + result);
        return result;
    }

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        double result = a / b;
        history.add(a + " / " + b + " = " + result);
        return result;
    }

    public double power(double a, double b) {
        double result = Math.pow(a, b);
        history.add(a + " ^ " + b + " = " + result);
        return result;
    }

    public double sqrt(double a) {
        if (a < 0) {
            throw new ArithmeticException("Cannot calculate the square root of a negative number");
        }
        double result = Math.sqrt(a);
        history.add("√" + a + " = " + result);
        return result;
    }

    public List<String> getHistory() {
        return history;
    }

    public void clearHistory() {
        history.clear();
    }
}
