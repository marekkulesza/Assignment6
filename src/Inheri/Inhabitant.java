package Inheri;

public class Inhabitant {

    String name;

    boolean alive = true;

    int strength = 4;

    int agility = 4;

    int armour = 4;

    int healthRating = 4;

    public Inhabitant(String name) {
        this.name = name;
    }

    public Inhabitant(String name, int strength, int agility, int armour, int healthRating) {
        this.name = name;
        this.strength = strength;
        this.agility = agility;
        this.armour = armour;
        this.healthRating = healthRating;
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

    public Boolean isAlive() {
        alive = healthRating >= 1;
        return alive;
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
        int damage;
        damage = ((getStrength() + getAgility() + getHealthRating()) / 3);
        if (damage < 1){
            damage = 1;
        }
        return damage;
    }

    public void defend(Inhabitant inhabitant){
        if (alive) {
            if (inhabitant.isAlive()) {
                int loss;
                loss = ((attack(inhabitant) / getArmour()));
                if (loss < 1) {
                    loss = 1;
                }
                System.out.println(getName() + " dealt " + loss + " damage to " + inhabitant.getName());
                inhabitant.setHealthRating(inhabitant.getHealthRating() - loss);
                System.out.println(inhabitant.getName() + " has " + inhabitant.getHealthRating() + " hp");
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
        return "Inhabitant{" +
                "name='" + name + '\'' +
                ", alive=" + alive +
                ", strength=" + strength +
                ", agility=" + agility +
                ", armour=" + armour +
                ", healthRating=" + healthRating +
                '}';
    }

    public void curaga(Inhabitant inhabitant) {
        System.out.println("You can't cast this");
    }
}
