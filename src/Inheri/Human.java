package Inheri;

public class Human extends Inhabitant {

    /**
     * base constructor with just a name
     * @param name a string for the name of the human
     */
    public Human(String name) {
        super(name);
    }

    /**
     * a constructor with name and stats
     * @param name string name
     * @param strength int value of strength
     * @param agility int value of agility
     * @param armour int value of armour
     * @param healthRating int value of healthRating
     */
    public Human(String name, int strength, int agility, int armour, int healthRating) {
        super(name, strength, agility, armour, healthRating);
    }

    @Override
    public String toString() {
        return "Human{" +
                super.toString()
                + "}";
    }
}
