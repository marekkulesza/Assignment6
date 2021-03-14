package Inheri;

public class Human extends Inhabitant {


    public Human(String name) {
        super(name);
    }

    public Human(String name, int strength, int agility, int armour, int healthRating) {
        super(name, strength, agility, armour, healthRating);
    }

    @Override
    public String toString() {
        return "Human{" +
                super.toString();
    }
}
