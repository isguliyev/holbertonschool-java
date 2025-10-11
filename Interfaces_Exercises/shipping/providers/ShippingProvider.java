package providers;

public interface ShippingProvider {
    public abstract Shipping calculateShipping(double weight, double value);
    public abstract ShippingProviderType getShippingProviderType();
}