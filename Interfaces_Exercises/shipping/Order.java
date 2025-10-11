import providers.*;

public class Order {
    private int code;
    private double weight;
    private double total;
    private Shipping shipping;

    public Order(int code, double weight, double total) {
        setCode(code);
        setWeight(weight);
        setTotal(total);
    }

    public int getCode() {
        return this.code;
    }

    public double getWeight () {
        return this.weight;
    }

    public double getTotal() {
        return this.total;
    }

    public Shipping getShipping() {
        return this.shipping;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }
}