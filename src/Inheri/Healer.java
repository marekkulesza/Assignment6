package Inheri;

public class Healer extends Human {

    /**
     * a special friend that can only be set once
     */
    Werewolf WerewolfFriend;

    /**
     * int value for the amount of magic a healer has automatically generated from 0 to 10
     */
    int magicRating = (int) ((Math.random() * 10) + 0);

    /**
     * default constructor for a Healer give it a name
     * @param name String for the name of the healer
     */
    public Healer(String name) {
        super(name);
    }

    /**
     * constructor for a Healer with all its stats
     *
     * @param name string name
     * @param strength int value of strength
     * @param agility int value of agility
     * @param armour int value of armour
     * @param healthRating int value of healthRating
     * @param magicRating int value of magicRaing
     */
    public Healer(String name, int strength, int agility, int armour, int healthRating, int magicRating) {
        super(name, strength, agility, armour, healthRating);
        this.magicRating = magicRating;
    }

    /**
     * setting a werewolf to be a friend of the healer, you can only set it once
     * they can be dead, I don't jugde
     * @param werewolfFriend a Werewolf can be your friend
     */
    public void setWerewolfFriend(Werewolf werewolfFriend) {
        if(WerewolfFriend == null){
            this.WerewolfFriend = werewolfFriend;
        }
        else {
            System.out.println("Only one werewolf can be set");
        }
    }

    /**
     * setting the amount of magicRating the healer has
     * @param magicRating an int value
     */
    public void setMagicRating(int magicRating) {
        this.magicRating = magicRating;
    }

    /**
     * a getter for the the Werewolf friend
     * @return a Werewolf type for the Werewolf friend
     */
    public Werewolf getWerewolfFriend() {
        return WerewolfFriend;
    }

    /**
     * getter for Magic rating
     * @return an int value for magic rating
     */
    public int getMagicRating() {
        return magicRating;
    }


    /**
     * the healing spell curaga used to heal inhabitants
     * heals for half the magicRating hp, and decreases your magic rating
     *
     * @param inhabitant the inhabitant you want to heal
     */
    public void curaga(Inhabitant inhabitant) {
        if (alive) {
            if (inhabitant.isAlive()) {
                if (magicRating > 0) {
                    int healAmount = magicRating/2;
                    magicRating--;
                    inhabitant.setHealthRating(inhabitant.getHealthRating() + healAmount);
                    System.out.println(getName() + " has healed" + inhabitant.getName() + " for " + healAmount);
                }
                else {
                    System.out.println("You don't have enough mana");
                }
            }
            else {
                System.out.println(inhabitant.getName() + " is dead");
            }
        }
        else {
            System.out.println(getName() + ", you can't do that because you are dead");
        }
    }

    @Override
    public String toString() {
        return "Healer{" +
                super.toString() +
                " WerewolfFriend= " + WerewolfFriend+
                ", magicRating=" + magicRating + "}";

    }
}
