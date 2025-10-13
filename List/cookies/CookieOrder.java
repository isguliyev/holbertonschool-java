public class CookieOrder {
    private String flavor;
    private int boxQuantity;

    public CookieOrder(String flavor, int boxQuantity) {
        setFlavor(flavor);
        setBoxQuantity(boxQuantity);
    }

    public String getFlavor() {
        return this.flavor;
    }

    public int getBoxQuantity() {
        return this.boxQuantity;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setBoxQuantity(int boxQuantity) {
        this.boxQuantity = boxQuantity;
    }
}