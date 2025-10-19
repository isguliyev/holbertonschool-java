import java.util.Map;
import java.util.HashMap;

public abstract class Warehouse <T> implements Storable<T> {
    private Map<String, T> inventory;

    public Warehouse() {
        setInventory(new HashMap<String, T>());
    }

    @Override
    public T getFromInventory(String name) {
        return this.inventory.get(name);
    }

    @Override
    public void addToInventory(String name, T value) {
        this.inventory.put(name, value);
    }

    public Map<String, T> getInventory() {
        return this.inventory;
    }

    public void setInventory(Map<String, T> inventory) {
        this.inventory = inventory;
    }
}