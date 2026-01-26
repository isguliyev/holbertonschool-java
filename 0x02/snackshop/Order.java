import java.util.Set;
import java.util.HashSet;

public class Order {
    private Set<OrderItem> itemsInBox;
    private Set<OrderItem> itemsOutOfBox;

    public Order() {
        this.itemsInBox = new HashSet<OrderItem>();
        this.itemsOutOfBox = new HashSet<OrderItem>();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Out of the box:\n");

        for (OrderItem orderItem : this.itemsOutOfBox) {
            stringBuilder.append("        - %s\n".formatted(orderItem.getName()));
        }

        stringBuilder.append("In the box:\n");

        for (OrderItem orderItem : this.itemsInBox) {
            stringBuilder.append("        - %s\n".formatted(orderItem.getName()));
        }

        return stringBuilder.toString();
    }

    public void addItemInBox(OrderItem item) {
        this.itemsInBox.add(item);
    }

    public void addItemOutOfBox(OrderItem item) {
        this.itemsOutOfBox.add(item);
    }

    public Set<OrderItem> getItemsInBox() {
        return this.itemsInBox;
    }

    public Set<OrderItem> getItemsOutOfBox() {
        return this.itemsOutOfBox;
    }
}