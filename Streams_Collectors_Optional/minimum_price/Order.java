import java.util.List;

public class Order {
    private int code;
    private List<Product> products;
    private Client client;

    public Order(int code, List<Product> products, Client client) {
        setCode(code);
        setProducts(products);
        setClient(client);
    }

    public int getCode() {
        return this.code;
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public Client getClient() {
        return this.client;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}