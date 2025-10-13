public class Task {
    private String description;
    public boolean isDone;
    private int identifier;

    public Task(String description, int identifier) throws Exception {
        setDescription(description);
        setIdentifier(identifier);
    }

    public void modifyDescription(String description) throws Exception {
        setDescription(description);
    }

    public String getDescription() {
        return this.description;
    }

    public int getIdentifier() {
        return this.identifier;
    }

    public void setDescription(String description) throws Exception {
        if (description.equals("") || description == null) {
            throw new Exception("Invalid task description");
        }

        this.description = description;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }
}