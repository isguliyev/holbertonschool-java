public class PrintStringVariable {
    public static void main() {
        String text = "Hello, World!";
        System.out.printf("%1$s\n%1$s\n%2$s\n", text, text.substring(0, 9));
    }
}