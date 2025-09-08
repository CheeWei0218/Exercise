package main.java.com.example;

// Concrete implementation of addition
public class Addition implements Operation {
    @Override
    public double execute(double a, double b) {
        return a + b;
    }
}