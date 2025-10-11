package providers;

public class Shipping {
    private double value;
    private ShippingProviderType shippingProviderType;

    public Shipping( double value, ShippingProviderType shippingProviderType) {
        setValue(value);
        setShippingProviderType(shippingProviderType);
    }

    public double getValue() {
        return this.value;
    }

    public ShippingProviderType getShippingProviderType() {
        return this.shippingProviderType;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setShippingProviderType(ShippingProviderType shippingProviderType) {
        this.shippingProviderType = shippingProviderType;
    }
}