public class Director {
    public void buildWarrior(Builder builder) {
        builder.setName("Warrior");
        builder.setIntelligence(1);
        builder.setStrength(8);
        builder.setEndurance(5);
        builder.setResilience(10);
        builder.setDexterity(6);
    }

    public void buildThief(Builder builder) {
        builder.setName("Thief");
        builder.setIntelligence(2);
        builder.setStrength(6);
        builder.setEndurance(8);
        builder.setResilience(5);
        builder.setDexterity(10);
    }

    public void buildMage(Builder builder) {
        builder.setName("Mage");
        builder.setIntelligence(10);
        builder.setStrength(2);
        builder.setEndurance(5);
        builder.setResilience(3);
        builder.setDexterity(4);
    }
}