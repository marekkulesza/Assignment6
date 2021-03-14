package Inheri;

public class Healer extends Humans{

    int magicRating = (int) ((Math.random() * 10) + 0);

    public Healer(String name) {
        super(name);
    }

    public void curaga(Inhabitant inhabitant) {
        if (alive && magicRating > 0) {
            int healAmount = magicRating/2;
            magicRating--;
            inhabitant.setHealthRating(inhabitant.getHealthRating() + healAmount);
        }
    }
}
