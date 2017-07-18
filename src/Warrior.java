import java.util.Random;

/**
 * Created by michaelgleeson on 7/17/17.
 */
public class Warrior extends GameCharacter {
    String weaponType;
    Random random = new Random();

    public Warrior() {

    }

    public Warrior(String name, int strength, int intellect, String weaponType) {
        super(name, strength, intellect);
        this.weaponType = weaponType;
    }

    public String getWeaponType() {
        int weapon = random.nextInt(3) + 1;
        switch (weapon) {
            case 1:
                weaponType = "Sword";
                break;
            case 2:
                weaponType = "Battle Axe";
                break;
            case 3:
                weaponType = "Bow";
                break;
            default:
                weaponType = "Blades of Chaos";

        }
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getStrength() {
        strength = rand.nextInt((10-5) + 1) + 5;
        return strength;
    }

    @Override
    public int getIntellect() {
        intellect = rand.nextInt((5-1) + 1) + 1;
        return intellect;
    }

    @Override
    public String Play() {
        String player;
        player = "Name: " + getName() + "\nClass: Warrior" + "\nStrength: " + getStrength() + "\nIntelligence: " + getIntellect() + "\nWeapon Type: " + getWeaponType();
        return player;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nClass: Warrior" + "\nStrength: " + strength + "\nIntelligence: " + intellect + "\nWeapon Type: " + weaponType + "\n";
    }
}

