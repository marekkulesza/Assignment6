package Inheri;

public class RedMoon extends Werewolf {

    /**
     * a constructor for the Red Moon Werewolf
     * @param name give the Red Moon Werewolf a name
     */
    public RedMoon(String name) {
        super(name);
    }

    /**
     * A stat constructor for the Red Moon Werewolf
     * @param name string name
     * @param strength int value of strength
     * @param agility int value of agility
     * @param armour int value of armour
     * @param healthRating int value of healthRating
     */
    public RedMoon(String name, int strength, int agility, int armour, int healthRating) {
        super(name, strength, agility, armour, healthRating);
    }

    @Override
    public String toString() {
        return "RedMoon{" +
                super.toString();
    }
}
