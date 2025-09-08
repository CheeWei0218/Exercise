// Interface for basic arithmetic operations
interface Operation {
    double execute(double a, double b);
}

// Concrete implementation of addition
class Addition implements Operation {
    @Override
    public double execute(double a, double b) {
        return a + b;
    }
}

// Concrete implementation of subtraction
class Subtraction implements Operation {
    @Override
    public double execute(double a, double b) {
        return a - b;
    }
}

// Concrete implementation of multiplication
class Multiplication implements Operation {
    @Override
    public double execute(double a, double b) {
        return a * b;
    }
}

// Concrete implementation of division
class Division implements Operation {
    @Override
    public double execute(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }
}

// Calculator class that uses operations
class Calculator {
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

// Main class to demonstrate usage
public class calculator2 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // Example usage
        calc.setOperation(new Addition());
        System.out.println("2 + 3 = " + calc.calculate(2, 3));

        calc.setOperation(new Subtraction());
        System.out.println("5 - 3 = " + calc.calculate(5, 3));

        calc.setOperation(new Multiplication());
        System.out.println("4 * 2 = " + calc.calculate(4, 2));

        calc.setOperation(new Division());
        System.out.println("6 / 2 = " + calc.calculate(6, 2));
    }
}