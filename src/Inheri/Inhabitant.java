package Inheri;

/**
 * This is assignment 6, all inhabitants of the world
 * all inhabitants have a list of skills that they can use
 * some differ from others so you'll have to check and see
 * <p>
 * name, strength, agility, armour, and healthRating
 *
 * @author Marek Kulesza
 */

public class Inhabitant {

    /**
     * The name of the inhabitant
     */
    String name;

    /**
     * if the inhabitant is alive or not
     * inhabitants should not be allowed to
     * revive from the dead
     */
    boolean alive = true;

    /**
     * default strength stat set at 4
     */
    int strength = 4;

    /**
     * default agility stat set at 4
     */
    int agility = 4;

    /**
     * default armour stat set at 4
     */
    int armour = 4;

    /**
     * default healthRating stat set at 4
     */
    int healthRating = 4;

    /**
     * Constructor used to make the inhabitants of the world
     *
     * @param name the name of the inhabitant
     */
    public Inhabitant(String name) {
        this.name = name;
    }

    /**
     * Constructor used to make the inhabitant and set their inital stats
     *
     * @param name         the name of the inhabitant
     * @param strength     int value for strength
     * @param agility      int value for agility
     * @param armour       int value for armour
     * @param healthRating int value for healthRating
     */
    public Inhabitant(String name, int strength, int agility, int armour, int healthRating) {
        this.name = name;
        this.strength = strength;
        this.agility = agility;
        this.armour = armour;
        this.healthRating = healthRating;
    }

    /**
     * getter for the name
     *
     * @return string name
     */
    public String getName() {
        return name;
    }

    /**
     * getter for the strength
     *
     * @return int value of the strength stat
     */
    public int getStrength() {
        return strength;
    }

    /**
     * getter for the agility
     *
     * @return int value of the agility stat
     */
    public int getAgility() {
        return agility;
    }

    /**
     * getter for the health rating
     *
     * @return int value of the health
     */
    public int getHealthRating() {
        return healthRating;
    }

    /**
     * getter for the Armour
     *
     * @return int value of the Armour
     */
    public int getArmour() {
        return armour;
    }

    /**
     * setter for the strength given an int
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * setter for the Agility given an int
     */
    public void setAgility(int agility) {
        this.agility = agility;
    }

    /**
     * setter for the Armour given an int
     */
    public void setArmour(int armour) {
        this.armour = armour;
    }

    /**
     * setter for the HealthRating given an int
     */
    public void setHealthRating(int healthRating) {
        this.healthRating = healthRating;
    }

    /**
     * checking if the inhabitant is alive
     *
     * @return true if they above 1hp
     */
    public Boolean isAlive() {
        alive = healthRating >= 1;
        return alive;
    }

    /**
     * increases the strength of the inhabitant by 1 point
     */
    public void increaseStrength() {
        if (alive) {
            if (strength < 10 && strength >= 0) {
                strength++;
            } else {
                System.out.println("You can't go above 10 Strength");
            }
        }
    }

    /**
     * increases the agility of the inhabitant by 1 point
     */
    public void increaseAgility() {
        if (alive) {
            if (agility < 10 && agility >= 0) {
                agility++;
            } else {
                System.out.println("You can't go above 10 Agility");
            }
        }
    }

    /**
     * increases the armour of the inhabitant by 1 point
     */
    public void increaseArmour() {
        if (alive) {
            if (armour < 10 && armour >= 0) {
                armour++;
            } else {
                System.out.println("You can't go above 10 Armour");
            }
        }
    }

    /**
     * increases the healthRating of the inhabitant by 1 point
     */
    public void increaseHealthRating() {
        if (alive) {
            if (healthRating < 10 && healthRating >= 0) {
                healthRating++;
            } else {
                System.out.println("You can't go above 10 Health Rating");
            }
        }
    }

    /**
     * decreases the strength of the inhabitant by 1 point
     */
    public void decreaseStrength() {
        if (alive) {
            if (strength <= 10 && strength > 0) {
                strength--;
            } else {
                System.out.println("You can't go below 0 Strength");
            }
        }
    }

    /**
     * decreases the agility of the inhabitant by 1 point
     */
    public void decreaseAgility() {
        if (alive) {
            if (agility <= 10 && agility > 0) {
                agility--;
            } else {
                System.out.println("You can't go below 0 Agility");
            }
        }
    }

    /**
     * decreases the armour of the inhabitant by 1 point
     */
    public void decreaseArmour() {
        if (alive) {
            if (armour <= 10 && armour > 0) {
                armour--;
            } else {
                System.out.println("You can't go below 0 Armour");
            }
        }
    }

    /**
     * decreases the healthRating of the inhabitant by 1 point
     */
    public void decreaseHealthRating() {
        if (alive) {
            if (healthRating <= 10 && healthRating > 0) {
                healthRating--;
            } else {
                System.out.println("You can't go below 0 Health Rating");
            }
        }
    }

    /**
     * This is the damage Calculation used in the attack method
     * this was the older attack() but because of how one person attacked
     * another I felt as though it was easier to read if I changed the attack
     * and defense method.
     * I changed how this is done, so now attacking is written as
     * inhabitant.attack(inhabitant2). What this stops is another person
     * blocking an attack from someone else.
     *
     * @param inhabitant the inhabitant that is attacking
     * @return an int representing the damage
     */
    public int damageCalc(Inhabitant inhabitant) {
        int damage;
        damage = ((getStrength() + getAgility() + getHealthRating()) / 3);
        if (damage < 1) {
            damage = 1;
        }
        return damage;
    }

    /**
     * the attack method which is more like the defend method in the assignment
     * I changed this because it has very hard to look at when doing it in the
     * world java. It's simpler to do inhabitant.attack(inhabitant2).
     *
     * @param inhabitant an inhabitant of the world you are looking to attack
     */
    public void attack(Inhabitant inhabitant) {
        if (alive) {
            if (inhabitant.isAlive()) {
                int loss;
                loss = ((damageCalc(inhabitant) / getArmour()));
                if (loss < 1) {
                    loss = 1;
                }
                System.out.println(getName() + " dealt " + loss + " damage to " + inhabitant.getName());
                inhabitant.setHealthRating(inhabitant.getHealthRating() - loss);
                System.out.println(inhabitant.getName() + " has " + inhabitant.getHealthRating() + " hp");
            } else {
                System.out.println(inhabitant.getName() + " is dead");
            }
        } else {
            System.out.println(getName() + ", you can't do that because you are dead");
        }
    }

    @Override
    public String toString() {
        return "Inhabitant{" +
                "name='" + name + '\'' +
                ", alive=" + alive +
                ", strength=" + strength +
                ", agility=" + agility +
                ", armour=" + armour +
                ", healthRating=" + healthRating +
                '}';
    }
}

