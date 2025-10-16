public class CharacterGame {
    private int currentHealth;
    private String name;
    private String status;

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
        if (currentHealth <= 0) {
            this.currentHealth = 0;
            this.status = "dead";
        } else if (currentHealth >= 100) {
            this.currentHealth = 100;
            this.status = "alive";
        } else {
            this.currentHealth = currentHealth;
            this.status = "alive";
        }
    }

    public void setName(String name) {
        this.name = name;
    }
}