import java.util.Random;

/**
 * Created by michaelgleeson on 7/17/17.
 */
public class MagicUsingCharacter extends GameCharacter {
    int magicalEnergy;
    Random random = new Random();

    public MagicUsingCharacter(String name, int strength, int intellect, int magicalEngergy) {
        super(name, strength, intellect);
        this.magicalEnergy = magicalEngergy;
    }

    public MagicUsingCharacter() {

    }
    public int getMagicalEnergy() {
        magicalEnergy = random.nextInt(11);
        return magicalEnergy;
    }

    public void setMagicalEnergy() {
        this.magicalEnergy = magicalEnergy;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getStrength() {
        return super.getStrength();
    }

    @Override
    public int getIntellect() {
        return super.getIntellect();
    }

    @Override
    public String Play() {
        String player;
        player = "Name: " + getName() +"\nStrength: " + getStrength() + "\nIntelligence: " + getIntellect() + "\nMagical Energy: " + getMagicalEnergy();
        return player;
    }
}
