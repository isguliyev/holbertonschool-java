public class Program {
    public static void main(String[] args) {
        CharacterGame characterGame = new CharacterGame(50, "Sonic");

        characterGame.setName("");

        System.out.println(characterGame);

        characterGame.receiveHealing(91);
        characterGame.setName(null);

        System.out.println(characterGame);

        characterGame.takeDamage(25);

        System.out.println(characterGame);

        characterGame.takeDamage(80);

        System.out.println(characterGame);
    }
}