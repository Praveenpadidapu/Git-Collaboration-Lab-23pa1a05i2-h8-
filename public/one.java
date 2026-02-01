public class one {
    
    public static double add(double a, double b) {
        return a + b;
    }
    
    public static double subtract(double a, double b) {
        return a - b;
    }
    
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero");
            return 0;
        }
        return a / b;
    }
    
    public static void main(String[] args) {
        System.out.println("Calculator");
        System.out.println("Addition: 10 + 5 = " + add(10, 5));
        System.out.println("Subtraction: 10 - 5 = " + subtract(10, 5));
        System.out.println("Multiplication: 10 * 5 = " + multiply(10, 5));
        System.out.println("Division: 10 / 5 = " + divide(10, 5));
    }
}
