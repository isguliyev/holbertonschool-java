public class Mage extends GameCharacter {
    public Mage(
        String name,
        int intelligence,
        int strength,
        int endurance,
        int resilience,
        int dexterity
    ) {
        if (intelligence < strength || intelligence < dexterity) {
            throw new IllegalArgumentException("Invalid attributes for MAGE");
        }

        super(
            name,
            CharacterType.MAGE,
            intelligence,
            strength,
            endurance,
            resilience,
            dexterity
        );
    }

    @Override
    public double getAttackDamage() {
        return this.intelligence * 0.8d + this.strength * 0.05d + this.dexterity * 0.05d + this.endurance * 0.1d;
    }
}