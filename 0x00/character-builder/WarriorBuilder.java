public class WarriorBuilder implements Builder {
    private String name;
    private int intelligence;
    private int strength;
    private int endurance;
    private int resilience;
    private int dexterity;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    @Override
    public void setResilience(int resilience) {
        this.resilience = resilience;
    }

    @Override
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public Warrior build() {
        return new Warrior(
            name,
            intelligence,
            strength,
            endurance,
            resilience,
            dexterity
        );
    }
}