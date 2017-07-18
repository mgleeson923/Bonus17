import java.util.Arrays;

/**
 * created by michaelgleeson on 7/17/17.
 */
public class Bonus17Main {
    public static void main(String[] args) {

        GameCharacter[] gameCharacters = new GameCharacter[] {new Warrior(), new Warrior(), new Wizard(), new Wizard(), new Wizard()};

        for (int i = 0; i < gameCharacters.length; i++) {
            System.out.println(gameCharacters[i].Play());
            System.out.println();
        }

        for (GameCharacter gc : gameCharacters) {
            System.out.println(gc);
        }

    }

}