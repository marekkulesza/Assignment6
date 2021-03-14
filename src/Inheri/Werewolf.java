package Inheri;

public class Werewolf extends Inhabitant {

    Fairy fairyOne;
    Fairy fairyTwo;

    public Werewolf(String name) {
        super(name);
    }

    public void setFairyOne(Fairy fairyOne) {
        this.fairyOne = fairyOne;
    }

    public void setFairyTwo(Fairy fairyTwo) {
        this.fairyTwo = fairyTwo;
    }

    @Override
    public String toString() {
        return "Werewolf{" +
                super.toString() +
                ", " + fairyOne +
                ", " + fairyTwo +
                '}';
    }
}
