/**
 * Created by michaelgleeson on 7/17/17.
 */
public class Wizard extends MagicUsingCharacter {
    int spellNum;

    public Wizard(String name, int strength, int intellect, int magicalEngergy) {
        super(name, strength, intellect, magicalEngergy);
    }

    public Wizard() {

    }

    public int getSpellNum() {
        spellNum = rand.nextInt((10) + 1);
        return spellNum;
    }

    public void setSpellNum(int spellNum) {
        this.spellNum = spellNum;
    }

    @Override
    public int getMagicalEnergy() {
        return super.getMagicalEnergy();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getStrength() {
        strength = rand.nextInt((5 - 1) + 1) + 1;
        return strength;
    }

    @Override
    public int getIntellect() {
        intellect = rand.nextInt((10 - 5) + 1) + 5;
        return intellect;
    }

    @Override
    public String Play() {
        String player;
        player = "Name: " + getName() + "\nClass: Mage" + "\nStrength: " + getStrength() + "\nIntelligence: " + getIntellect() + "\nMagical Energy: " + getMagicalEnergy() + "\nSpells: " + getSpellNum();
        return player;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nClass: Warrior" + "\nStrength: " + strength + "\nIntelligence: " + intellect + "\nMagical Energy: " + magicalEnergy + "\nSpells: " + spellNum + "\n";

    }
}
