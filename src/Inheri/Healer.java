package Inheri;

public class Healer extends Human {

    int magicRating = (int) ((Math.random() * 10) + 0);

    public Healer(String name) {
        super(name);
    }

    public Healer(String name, int strength, int agility, int armour, int healthRating) {
        super(name, strength, agility, armour, healthRating);
    }

    @Override
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
                " magicRating=" + magicRating + "}";

    }
}
