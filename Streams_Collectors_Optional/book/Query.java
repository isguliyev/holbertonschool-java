import java.util.List;

public class Query {
    public static List<Product> getBooksFromOrder(Order order) {
        return order.getProducts().stream()
        .filter(product -> product.getCategory().equals(ProductCategory.BOOK))
        .toList();
    }
}