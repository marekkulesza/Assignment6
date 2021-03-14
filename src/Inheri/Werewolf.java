package Inheri;

public class Werewolf extends Inhabitant {

    /**
     * a Fairy that can be set in the future to be an ally of the werewolf
     */
    Fairy fairyOne;

    /**
     * a second Fairy that can be set in the future to be an ally of the werewolf
     */
    Fairy fairyTwo;

    /**
     * A default constructor for the Werewolf
     * @param name string name for the Werewolf
     */
    public Werewolf(String name) {
        super(name);
    }

    /**
     * A constructor for the Werewolf and all its stats
     *
     * @param name string name
     * @param strength int value of strength
     * @param agility int value of agility
     * @param armour int value of armour
     * @param healthRating int value of healthRating
     */
    public Werewolf(String name, int strength, int agility, int armour, int healthRating) {
        super(name, strength, agility, armour, healthRating);
    }

    /**
     * a getter for the first fairy
     * @return Fairy type for the first fairy
     */
    public Fairy getFairyOne() {
        return fairyOne;
    }

    /**
     * a getter for the second fairy
     * @return Fairy type for the second fairy
     */
    public Fairy getFairyTwo() {
        return fairyTwo;
    }

    /**
     * a setter for the first fairy
     * @param fairyOne Fairy type for the Werewolf
     */
    public void setFairyOne(Fairy fairyOne) {
        this.fairyOne = fairyOne;
    }

    /**
     * a setter for the second fairy
     * @param fairyTwo Fairy type for the Werewolf
     */
    public void setFairyTwo(Fairy fairyTwo) {
        this.fairyTwo = fairyTwo;
    }

    @Override
    public String toString() {
        return "Werewolf{" +
                super.toString() +
                ", " + fairyOne +
                ", " + fairyTwo +
                '}';
    }
}
