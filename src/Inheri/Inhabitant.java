package Inheri;

public class Inhabitant {

    final String name;
    boolean alive;

    int strength,agility,armour,healthRating;

    public Inhabitant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void isAlive() {
        alive = healthRating >= 1;
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }

    public int getHealthRating() {
        return healthRating;
    }

    public void setHealthRating(int healthRating) {
        this.healthRating = healthRating;
    }

    public void changeStrength(int strength) {
        if (alive) {
            if (strength == 1 || strength == -1){
                this.strength += strength;
            }
            else {
                System.out.println("you can only increase or decrease by 1 or -1");
            }
        }
    }

    public void changeAgility(int agility) {
        if (alive){
            if (agility == 1 || agility == -1){
                this.agility += agility;
            }
            else {
                System.out.println("you can only increase or decrease by 1 or -1");
            }
        }
    }

    public void changeArmour(int armour) {
        if (alive) {
            if (armour == 1 || armour == -1){
                this.armour += armour;
            }        else {
                System.out.println("you can only increase or decrease by 1 or -1");
            }
        }
    }

    public void changeHealthRating(int healthRating) {
        if (alive) {
            if (healthRating == 1 || healthRating == -1){
                this.healthRating += healthRating;
            }
            else {
                System.out.println("you can only increase or decrease by 1 or -1");
            }
        }
    }

    public int attack(Inhabitant inhabitant){
        if (alive) {
            int damage;
            damage = ((getStrength() + getAgility() + getHealthRating()) / 3);
            return damage;
        }
        return 0;
    }

    public void defend(Inhabitant inhabitant){
        if (alive) {
            int loss;
            loss = ((attack(inhabitant) / getArmour()));
            if (loss < 1) {
                loss = 1;
            }
            inhabitant.setHealthRating(inhabitant.getHealthRating() - loss);
        }

    }
}
