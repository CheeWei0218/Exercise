package main.java.com.example;

// Concrete implementation of multiplication
public class Multiplication implements Operation {
    @Override
    public double execute(double a, double b) {
        return a * b;
    }
}