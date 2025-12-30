public class Program {
    public static void main(String[] args) {
        try {
            System.out.println(Square.area(-5));
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }

        try {
            System.out.println(Square.area(3));
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }
}