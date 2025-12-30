public class CharacterGame {
    private int currentHealth;
    private String name;

    @Override
    public String toString() {
        return String.format(
            "Name: %s - Health: %d",
            this.name,
            this.currentHealth
        );
    }

    public int getCurrentHealth() {
        return this.currentHealth;
    }

    public String getName() {
        return this.name;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public void setName(String name) {
        this.name = name;
    }
}