package Inheri;

public class Hunter extends Humans{


    public Hunter(String name) {
        super(name);
    }

    @Override
    public int attack(Inhabitant inhabitant){
        if (alive) {
            int damage;
            damage = ((getStrength() + getAgility() + getHealthRating()) / 3);
            inhabitant.setHealthRating((inhabitant.getHealthRating() - (damage*2)));
        }
        return 0;
    }
}
