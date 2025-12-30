public class Program {
    public static void main(String[] args) {
        CharacterGame characterGame = new CharacterGame();

        characterGame.setName("Sonic");
        characterGame.setCurrentHealth(10);

        System.out.println(characterGame);
    }
}