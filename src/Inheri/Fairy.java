package Inheri;

public class Fairy extends Inhabitant {

    /**
     * a constructor for the Fairy
     * @param name give the Fairy a name
     */
    public Fairy(String name) {
        super(name);
    }

    /**
     * A stat constructor for the Fairy
     * @param name string name
     * @param strength int value of strength
     * @param agility int value of agility
     * @param armour int value of armour
     * @param healthRating int value of healthRating
     */
    public Fairy(String name, int strength, int agility, int armour, int healthRating) {
        super(name, strength, agility, armour, healthRating);
    }

    /**
     * innervate is a spell used to set the magic rating to a healer
     *
     * @param healer Healer type to be innervated
     */
    public void innervate(Healer healer) {
        int randomNum = (int) ((Math.random() * 10) + 0);
        healer.setMagicRating(randomNum);
        System.out.println(getName() + " has innervated " + healer.getName() + " to " + randomNum + " mana");
    }

    @Override
    public String toString() {
        return "Fairy{" +
                super.toString();
    }
}
