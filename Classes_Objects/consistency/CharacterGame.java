public class CharacterGame {
    public static final int MAX_HEALTH = 100;
    public static final int MIN_HEALTH = 0;

    private int currentHealth;
    private String name;
    private String status;

    public CharacterGame(int currentHealth, String name) {
        setCurrentHealth(currentHealth);
        setName(name);
    }

    @Override
    public String toString() {
        return String.format(
            "Name: %s - Health: %d - %s",
            this.name,
            this.currentHealth,
            this.status
        );
    }

    public void takeDamage(int damageAmount) {
        setCurrentHealth(this.currentHealth - damageAmount);
    }

    public void receiveHealing(int healingAmount) {
        setCurrentHealth(this.currentHealth + healingAmount);
    }

    public int getCurrentHealth() {
        return this.currentHealth;
    }

    public String getName() {
        return this.name;
    }

    public String getStatus() {
        return this.status;
    }

    public void setCurrentHealth(int currentHealth) {
        if (currentHealth <= MIN_HEALTH) {
            this.currentHealth = MIN_HEALTH;
            this.status = "dead";
        } else if (currentHealth >= MAX_HEALTH) {
            this.currentHealth = MAX_HEALTH;
            this.status = "alive";
        } else {
            this.currentHealth = currentHealth;
            this.status = "alive";
        }
    }

    public void setName(String name) {
        if (name == null ||  name.isEmpty()) {
            return;
        }

        this.name = name;
    }
}