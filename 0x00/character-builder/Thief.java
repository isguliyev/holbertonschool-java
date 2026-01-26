public class Thief extends GameCharacter {
    public Thief(
        String name,
        int intelligence,
        int strength,
        int endurance,
        int resilience,
        int dexterity
    ) {
        if (dexterity < strength || dexterity < intelligence) {
            throw new IllegalArgumentException("Invalid attributes for THIEF");
        }

        super(
            name,
            CharacterType.THIEF,
            intelligence,
            strength,
            endurance,
            resilience,
            dexterity
        );
    }

    @Override
    public double getAttackDamage() {
        return this.strength * 0.5d + this.dexterity * 0.35d + this.endurance * 0.1d + this.intelligence * 0.05d;
    }
}