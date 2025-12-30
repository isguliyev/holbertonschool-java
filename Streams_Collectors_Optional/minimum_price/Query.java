import java.util.List;
import java.util.Comparator;

public class Query {
    public static List<Product> getBooksFromOrder(Order order) {
        return order.getProducts().stream().filter(
            product -> product.getCategory().equals(ProductCategory.BOOK)
        ).toList();
    }

    public static Product getProductWithHighestPrice(List<Product> products) {
        return products.stream().max(Comparator.comparing(Product::getPrice)).get();
    }

    public static List<Product> getProductsByMinimumPrice(
        List<Product> products,
        double minimumPrice
    ) {
        return products.stream().filter((product) -> product.getPrice() >= minimumPrice).toList();
    }
}