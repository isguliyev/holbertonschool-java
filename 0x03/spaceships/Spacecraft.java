public class Spacecraft {
    protected int health;
    protected int attack;

    public Spacecraft(int health, int attack) {
        this.health = health;
        this.attack = attack;
    }

    @Override
    public String toString() {
        return String.format("Health: %d - Attack: %d", getHealth(), getAttack());
    }

    public int getHealth() {
        return this.health;
    }

    public int getAttack() {
        return this.attack;
    }
}