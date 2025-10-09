public class CharacterGame {
    private int currentHealth;
    private String name;

    public void takeDamage(int damageAmount) {
        setCurrentHealth(getCurrentHealth() - damageAmount);
    }

    public void receiveHealing(int healingAmount) {
        setCurrentHealth(getCurrentHealth() + healingAmount);
    }

    public int getCurrentHealth() {
        return this.currentHealth;
    }

    public String getName() {
        return this.name;
    }

    public void setCurrentHealth(int currentHealth) {
        if (currentHealth <= 0) {
            this.currentHealth = 0;
        } else if (currentHealth >= 100) {
            this.currentHealth = 100;
        } else {
            this.currentHealth = currentHealth;
        }
    }

    public void setName(String name) {
        this.name = name;
    }
}