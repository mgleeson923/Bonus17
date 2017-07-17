import java.lang.reflect.Array;

/**
 * Created by michaelgleeson on 7/17/17.
 */
public class Bonus17Main {
    public static void main(String[] args) {

        GameCharacter warrior1 = new Warrior();
        GameCharacter wizard = new Wizard();

        GameCharacter[] gameCharacters = new GameCharacter[5];

        gameCharacters[0] = warrior1;
        gameCharacters[1] = warrior1;
        gameCharacters[2] = wizard;
        gameCharacters[3] = wizard;
        gameCharacters[4] = wizard;

        for (int i = 0; i <= 1; i++) {
            System.out.println(warrior1.Play());
            System.out.println();
        }
        for (int i = 2; i < gameCharacters.length ; i++) {
            System.out.println(wizard.Play());
            System.out.println();

        }
    }

}