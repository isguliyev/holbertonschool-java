import java.util.List;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        Product product1 = new Product(
            "Truffled Chocolate Coffee",
            21.99d,
            250.0d,
            120,
            ProductTypes.KITCHEN
        );

        Product product2 = new Product(
            "Condensed Milk",
            6.29d,
            395.0d,
            200,
            ProductTypes.KITCHEN
        );

        Product product3 = new Product(
            "Vortex Car",
            799.9d,
            1560.0d,
            5,
            ProductTypes.TOY
        );

        Product product4 = new Product(
            "Smart TV LED 32 HD LG",
            1452.55d,
            6300.0d,
            7,
            ProductTypes.ELECTRONIC
        );

        Product product5 = new Product(
            "Nintendo Switch",
            2990.0d,
            1700.0d,
            12,
            ProductTypes.ELECTRONIC
        );

        List<Product> products = Arrays.asList(
            product1,
            product2,
            product3,
            product4,
            product5
        );

        List<Product> productsPriceGreaterThan100 = ProductSearch.filter(
            products,
            p -> p.getPrice() > 100.0d
        );

        List<Product> productsWeightLessOrEqual1600 = ProductSearch.filter(
            products,
            p -> p.getWeight() <= 1600.0d
        );

        List<Product> kitchenProducts = ProductSearch.filter(
            products,
            p -> p.getType() == ProductTypes.KITCHEN
        );

        List<Product> lowStockProducts = ProductSearch.filter(
            products,
            p -> p.getStockQuantity() <= 10.0d
        );

        System.out.println(productsPriceGreaterThan100);
        System.out.println(productsWeightLessOrEqual1600);
        System.out.println(kitchenProducts);
        System.out.println(lowStockProducts);
    }
}