public abstract class Media {
    private String name;

    public Media(String name) {
        setName(name);
    }

    @Override
    public String toString() {
        return String.format("Type: %s - Name: %s", getClass().getName(), this.name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}