public class CharacterGame {
    public int currentHealth;
    public String name;

    @Override
    public String toString() {
        return String.format(
            "Name: %s - Health: %d",
            this.name,
            this.currentHealth
        );
    }
}