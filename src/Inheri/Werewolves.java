package Inheri;

public class Werewolves extends Inhabitant {

    Fairies fairyOne;
    Fairies fairyTwo;

    public Werewolves(String name) {
        super(name);
    }

    public void setFairyOne(Fairies fairyOne) {
        this.fairyOne = fairyOne;
    }

    public void setFairyTwo(Fairies fairyTwo) {
        this.fairyTwo = fairyTwo;
    }



}
