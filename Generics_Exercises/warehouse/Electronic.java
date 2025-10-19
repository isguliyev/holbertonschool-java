public class Electronic {
    private String description;
    private double value;

    public Electronic(String description, double value) {
        setDescription(description);
        setValue(value);
    }

    @Override
    public String toString() {
        return String.format("[%s] $ %f", this.description, this.value);
    }

    public String getDescription() {
        return this.description;
    }

    public double getValue() {
        return this.value;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setValue(double value) {
        this.value = value;
    }
}