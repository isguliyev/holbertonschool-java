public class OrderItem {
    private OrderItemType type;
    private String name;

    public OrderItemType getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public void setType(OrderItemType type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }
}