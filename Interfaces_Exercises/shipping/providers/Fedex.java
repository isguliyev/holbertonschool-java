package providers;

public class Fedex implements ShippingProvider {
    public static final double WEIGHT_THRESHOLD_GRAMS = 1000.0d;
    public static final double SHIPPING_RATE_ABOVE_THRESHOLD = 0.1d;
    public static final double SHIPPING_RATE_BELOW_THRESHOLD = 0.05d;

    public Shipping calculateShipping(double weight, double value) {
        return new Shipping(
            value * (
                weight > WEIGHT_THRESHOLD_GRAMS
                ? SHIPPING_RATE_ABOVE_THRESHOLD
                : SHIPPING_RATE_BELOW_THRESHOLD
            ),
            getShippingProviderType()
        );
    }

    public ShippingProviderType getShippingProviderType() {
        return ShippingProviderType.FEDEX;
    }
}