public class Program {
    public static void main(String[] args) {
        Product product = new Product(129.99d, "Mouse Gamer");

        System.out.printf(
            "%s - %.2f - %.2f\n", product.getName(),
            product.getPrice(),
            product.priceWithMarkup.get()
        );

        product.updateMarkup.accept(15.0d);

        System.out.printf(
            "%s - %.2f - %.2f\n", product.getName(),
            product.getPrice(),
            product.priceWithMarkup.get()
        );
    }
}