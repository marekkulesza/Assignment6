package Inheri;

public class Werewolves extends Inhabitant {

    Fairies fairyOne;
    Fairies fairyTwo;

    final String pack;

    public Werewolves(String pack,String name) {
        super(name);
        this.pack = pack;
    }

    public String getPack() {
        return pack;
    }

    public void setFairyOne(Fairies fairyOne) {
        this.fairyOne = fairyOne;
    }

    public void setFairyTwo(Fairies fairyTwo) {
        this.fairyTwo = fairyTwo;
    }



}
