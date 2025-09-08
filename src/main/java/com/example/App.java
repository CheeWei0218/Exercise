package com.example;

public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.setOperation(new Addition());
        System.out.println("2 + 3 = " + calc.calculate(2, 3));

        calc.setOperation(new Subtraction());
        System.out.println("8 - 4 = " + calc.calculate(8, 4));

        calc.setOperation(new Multiplication());
        System.out.println("2 * 3 = " + calc.calculate(2, 3));

        calc.setOperation(new Division());
        System.out.println("12 / 3 = " + calc.calculate(12, 3));
    }
}