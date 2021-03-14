package Inheri;

public class Human extends Inhabitant {

    String humanSubClass;
    int magicRating = 0;
    Werewolf WerewolfFriend;

    public void setWerewolfFriend(Werewolf werewolfFriend) {
    }

    public String getHumanSubClass() {
        return humanSubClass;
    }

    public Human(String name) {
        super(name);
    }

    public Human(String name, int strength, int agility, int armour, int healthRating) {
        super(name, strength, agility, armour, healthRating);
    }

    public void setMagicRating(int magicRating) {
        this.magicRating = magicRating;
    }

    @Override
    public String toString() {
        return "Human{" +
                super.toString()
                + "}";
    }
}
