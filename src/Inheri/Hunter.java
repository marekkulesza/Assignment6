package Inheri;

public class Hunter extends Human {

    final String humanSubClass = "Hunter";
    public Hunter(String name) {
        super(name);
    }

    public Hunter(String name, int strength, int agility, int armour, int healthRating) {
        super(name, strength, agility, armour, healthRating);
    }

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
