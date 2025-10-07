public class EvenNumbers {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.print(i * 2 + (i < 49 ? ", ":"\n"));
        }
    }
}