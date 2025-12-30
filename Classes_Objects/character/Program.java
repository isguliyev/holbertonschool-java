public class Program {
	public static void main(String[] args) {
		CharacterGame characterGame1 = new CharacterGame();
		CharacterGame characterGame2 = new CharacterGame();

		characterGame1.name = "Sonic";
		characterGame1.currentHealth = 10;

		characterGame2.name = "Mario";
		characterGame2.currentHealth = 100;

		System.out.println(characterGame1);

		System.out.println(characterGame2);
	}
}