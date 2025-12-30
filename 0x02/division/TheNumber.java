public class TheNumber {
    public static void todivide(int a, int b) {
        try {
            System.out.printf("%d / %d = %d\n", a, b, a / b);
        } catch (ArithmeticException arithmeticException) {
            System.err.println("It is not possible to divide by zero.");
        }
    }
}