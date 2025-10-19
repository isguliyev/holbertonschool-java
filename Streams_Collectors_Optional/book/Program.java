import java.util.List;

public class Program {
    public static void main(String[] args) {
        Product product1 = new Product(1,
            "Vortex Car", ProductCategory.TOY, 799.90);

        Product product2 = new Product(2,
            "Smart TV LED 32 HD LG", ProductCategory.ELECTRONIC, 1452.55);

        Product product3 = new Product(3,
            "Nintendo Switch", ProductCategory.ELECTRONIC, 2990.00);

        Product product4 = new Product(4,
            "Dune", ProductCategory.BOOK, 21.88);

        Product product5 = new Product(5,
            "One of Us Is Lying", ProductCategory.BOOK, 38.30);

        Product product6 = new Product(6,
            "War And Peace", ProductCategory.BOOK, 27.50);

        Client client1 = new Client(1, "Jane Doe", false);
        Client client2 = new Client(2, "John Bannins", true);
        Client client3 = new Client(3, "Jackson Percy", false);

        Order order1 = new Order(1, List.of(product4, product3, product6), client1);
        Order order2 = new Order(2, List.of(product1, product6, product2), client2);
        Order order3 = new Order(3, List.of(product4, product6, product2, product5), client3);

        List<Product> bookProducts1 = Query.getBooksFromOrder(order1);
        List<Product> bookProducts2 = Query.getBooksFromOrder(order2);
        List<Product> bookProducts3 = Query.getBooksFromOrder(order3);

        System.out.println(bookProducts1);
        System.out.println(bookProducts2);
        System.out.println(bookProducts3);
    }
}