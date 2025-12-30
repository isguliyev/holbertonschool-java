public class Program {
    public static void main(String[] args) {
        CharacterGame characterGame = new CharacterGame();

        characterGame.setName("Sonic");
        characterGame.setCurrentHealth(0);

        System.out.println(characterGame);

        characterGame.receiveHealing(90);

        System.out.println(characterGame);

        characterGame.takeDamage(25);

        System.out.println(characterGame);

        characterGame.takeDamage(80);

        System.out.println(characterGame);

        characterGame.receiveHealing(10);

        System.out.println(characterGame);
    }
}