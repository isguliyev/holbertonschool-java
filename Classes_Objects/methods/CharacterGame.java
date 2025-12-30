public class CharacterGame {
    public static final int MAX_HEALTH = 100;
    public static final int MIN_HEALTH = 0;

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

    public void takeDamage(int damageAmount) {
        this.setCurrentHealth(this.currentHealth - damageAmount);
    }

    public void receiveHealing(int healingAmount) {
        this.setCurrentHealth(this.currentHealth + healingAmount);
    }

    public int getCurrentHealth() {
        return this.currentHealth;
    }

    public String getName() {
        return this.name;
    }

    public void setCurrentHealth(int currentHealth) {
        if (currentHealth <= MIN_HEALTH) {
            this.currentHealth = MIN_HEALTH;
        } else if (currentHealth >= MAX_HEALTH) {
            this.currentHealth = MAX_HEALTH;
        } else {
            this.currentHealth = currentHealth;
        }
    }

    public void setName(String name) {
        this.name = name;
    }
}