public class Warrior extends GameCharacter {
    public Warrior(
        String name,
        int intelligence,
        int strength,
        int endurance,
        int resilience,
        int dexterity
    ) {
        if (strength < intelligence || strength < dexterity) {
            throw new IllegalArgumentException("Invalid attributes for WARRIOR");
        }

        super(
            name,
            CharacterType.WARRIOR,
            intelligence,
            strength,
            endurance,
            resilience,
            dexterity
        );
    }

    @Override
    public double getAttackDamage() {
        return this.strength * 0.8d + this.endurance * 0.05d + this.dexterity * 0.1d + this.intelligence * 0.05d;
    }
}