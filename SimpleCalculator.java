public class SimpleCalculator {

    // Addition
    public double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Division with exception handling
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Error: Cannot divide by zero");
        }
        return a / b;
    }

    // Main method to test the calculator
    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();

        // Test Addition
        System.out.println("Addition Test 1: " + calc.add(5, 3)); // 8.0
        System.out.println("Addition Test 2: " + calc.add(-2, 7)); // 5.0

        // Test Subtraction
        System.out.println("Subtraction Test 1: " + calc.subtract(10, 4)); // 6.0
        System.out.println("Subtraction Test 2: " + calc.subtract(3, 7)); // -4.0

        // Test Multiplication
        System.out.println("Multiplication Test 1: " + calc.multiply(6, 2)); // 12.0
        System.out.println("Multiplication Test 2: " + calc.multiply(-3, 5)); // -15.0

        // Test Division
        System.out.println("Division Test 1: " + calc.divide(20, 4)); // 5.0
        try {
            System.out.println("Division Test 2: " + calc.divide(10, 0)); // Error
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
