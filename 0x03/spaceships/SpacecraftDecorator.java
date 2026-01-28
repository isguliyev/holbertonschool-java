public class SpacecraftDecorator extends Spacecraft {
    private Spacecraft spacecraft;

    public SpacecraftDecorator(Spacecraft spacecraft) {
        super(0, 0);
        this.spacecraft = spacecraft;
    }

    @Override
    public int getHealth() {
        return this.spacecraft.getHealth();
    }

    @Override
    public int getAttack() {
        return this.spacecraft.getAttack();
    }
}