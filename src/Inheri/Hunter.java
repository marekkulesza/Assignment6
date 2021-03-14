package Inheri;

public class Hunter extends Human {

    /**
     * default constructor for the Hunter give them a name
     * hunters are special and deal double damage
     * @param name string name for the Hunter
     */
    public Hunter(String name) {
        super(name);
    }

    /**
     * constructor for the hunter with stats
     *
     * @param name string name
     * @param strength int value of strength
     * @param agility int value of agility
     * @param armour int value of armour
     * @param healthRating int value of healthRating
     */
    public Hunter(String name, int strength, int agility, int armour, int healthRating) {
        super(name, strength, agility, armour, healthRating);
    }

    /**
     * an override for the amount of damage calculated
     *
     * @param inhabitant the inhabitant that is attacking
     * @return basically double the damage as an int
     */
    @Override
    public int damageCalc(Inhabitant inhabitant){
        int damage;
        damage = ((getStrength() + getAgility() + getHealthRating()) / 3);
        System.out.println("A special hunter attack is being used");
         if (damage < 1) {
             damage = 2;
         }
        return damage*2;
    }

    @Override
    public String toString() {
        return "Hunter{" +
                super.toString();
    }
}
