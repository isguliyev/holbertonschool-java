import java.util.ArrayList;

public class Order {
    private ArrayList<CookieOrder> cookies;

    public Order() {
        setCookies(new ArrayList<CookieOrder>());
    }

    public int removeFlavor(String flavor) {
        int boxesRemoved = 0;
        ArrayList<CookieOrder> flavorsToRemove = new ArrayList<CookieOrder>();

        for (CookieOrder cookieOrder : getCookies()) {
            if (cookieOrder.getFlavor().equals(flavor)) {
                flavorsToRemove.add(cookieOrder);
                boxesRemoved += cookieOrder.getBoxQuantity();
            }
        }

        getCookies().removeAll(flavorsToRemove);
        return boxesRemoved;
    }

    public int getTotalBoxes() {
        int totalBoxes = 0;

        for (CookieOrder cookieOrder : getCookies()) {
            totalBoxes += cookieOrder.getBoxQuantity();
        }

        return totalBoxes;
    }

    public void addCookieOrder(CookieOrder cookieOrder) {
        getCookies().add(cookieOrder);
    }

    public ArrayList<CookieOrder> getCookies() {
        return this.cookies;
    }

    public void setCookies(ArrayList<CookieOrder> cookies) {
        this.cookies = cookies;
    }
}