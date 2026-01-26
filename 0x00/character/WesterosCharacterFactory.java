public class WesterosCharacterFactory extends CharacterFactory {
    public GameCharacter createCharacter(CharacterType type, String name) {
        return switch (type) {
            case CharacterType.MAGE -> new Mage(name, 8, 3, 3, 3, 4);
            case CharacterType.THIEF -> new Thief(name, 1, 8, 7, 7, 10);
            case CharacterType.WARRIOR -> new Warrior(name, 0, 9, 7, 10, 7);
        };
    }
}