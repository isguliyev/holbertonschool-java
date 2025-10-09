public class Rectangle extends GeometricShape {
    protected double width;
    protected double height;

    @Override
    public double area() {
        return getWidth() * getHeight();
    }

    @Override
    public String toString() {
        return String.format("[Rectangle] %.2f / %.2f", getWidth(), getHeight());
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) throws IllegalArgumentException {
        if (width < 0) {
            throw new IllegalArgumentException(
                "Width must be greater than or equal to 0");
        }

        this.width = width;
    }

    public void setHeight(double height) throws IllegalArgumentException {
        if (height < 0) {
            throw new IllegalArgumentException(
                "Height must be greater than or equal to 0");
        }

        this.height = height;
    }
}