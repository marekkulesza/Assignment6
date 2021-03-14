package Inheri;

public class BlueMoon extends Werewolf {

    /**
     * a constructor for the Blue Moon Werewolf
     * @param name give the Blue Moon Werewolf a name
     */
    public BlueMoon(String name) {
        super(name);
    }

    /**
     * A stat constructor for the Blue Moon Werewolf
     * @param name string name
     * @param strength int value of strength
     * @param agility int value of agility
     * @param armour int value of armour
     * @param healthRating int value of healthRating
     */
    public BlueMoon(String name, int strength, int agility, int armour, int healthRating) {
        super(name, strength, agility, armour, healthRating);
    }

    @Override
    public String toString() {
        return "BlueMoon{" +
                super.toString();
    }
}
