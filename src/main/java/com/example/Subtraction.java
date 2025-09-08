package com.example;

// Concrete implementation of subtraction
public class Subtraction implements Operation {
    @Override
    public double execute(double a, double b) {
        return a - b;
    }
}