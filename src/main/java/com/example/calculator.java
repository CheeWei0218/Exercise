package main.java.com.example;
import main.java.com.example.Operation;
import main.java.com.example.Addition;
import main.java.com.example.Subtraction;
import main.java.com.example.Multiplication;
import main.java.com.example.Division;

// Calculator class that uses operations
public class Calculator {
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public double calculate(double a, double b) {
        if (operation == null) {
            throw new IllegalStateException("Operation not set");
        }
        return operation.execute(a, b);
    }
}
