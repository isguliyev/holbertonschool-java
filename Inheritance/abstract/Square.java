public class Square extends Rectangle {
    private double side;

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) throws IllegalArgumentException {
        if (side < 0) {
            throw new IllegalArgumentException("Side must be greater than or equal to 0");
        }

        this.side = side;
        super.setWidth(side);
        super.setHeight(side);
    }
}