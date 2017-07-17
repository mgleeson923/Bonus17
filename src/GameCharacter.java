import java.util.Random;
import java.util.Scanner;

/**
 * Created by michaelgleeson on 7/17/17.
 */
public class GameCharacter {
    String name;
    int strength;
    int intellect;
    Random rand = new Random();
    Scanner scnr  = new Scanner(System.in);

    public GameCharacter() {

    }

    public GameCharacter(String name, int strength, int intellect) {
        this.name = name;
        this.strength = strength;
        this.intellect = intellect;
    }

    public String getName() {
        System.out.println("Please enter a Character name: ");
        name = scnr.nextLine();
        return name;
    }

    public int setStrength() {
        return strength;
    }

    public int setIntellect() {
        intellect = rand.nextInt(11);
        return intellect;
    }

    public String Play () {
        String player;
        player = "Name: " + getName() +"\nStrength: " + setStrength() + "\nIntelligence: " + setIntellect();
        return player;
    }
}
