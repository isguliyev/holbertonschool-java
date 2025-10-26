public class BasicOperationTest {
    public static boolean test_addition() {
        return BasicOperation.add(5.0d, 3.0d) == 8.0d;
    }

    public static boolean test_subtraction() {
        return BasicOperation.subtract(5.0d, 3.0d) == 2.0d;
    }

    public static boolean test_multiplication() {
        return BasicOperation.multiply(5.0d, 3.0d) == 15.0d;
    }

    public static boolean test_division() {
        return BasicOperation.divide(9.0d, 3.0d) == 3.0d;
    }
}