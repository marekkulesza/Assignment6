package Inheri;

public class World {
    public static void main(String[] args) {
        Inhabitant Areith = new Healer("Areith");
        Inhabitant Hunter = new Hunter("Mama");
        Inhabitant BetterAreith = new Healer("Better Areith",4,4,6,7);
        Inhabitant BetterHunter = new Hunter("Better Mama",4,4,6,7);

        System.out.println(Areith);
        System.out.println(Hunter);

        System.out.println(BetterAreith);
        System.out.println(BetterHunter);

        Areith.defend(Hunter);
        Hunter.defend(Areith);
        Hunter.defend(Areith);
        Hunter.defend(Areith);
        Hunter.defend(Areith);
        Hunter.defend(Areith);
        Hunter.defend(Areith);
        Areith.defend(Hunter);
        System.out.println(Areith);
        System.out.println(Hunter);

        BetterAreith.curaga(Hunter);
        BetterHunter.curaga(Hunter);

        System.out.println("Human fight is over");

        Inhabitant Edward = new RedMoon("Edward");
        Inhabitant Jacob = new BlueMoon("Jacob");

        System.out.println(Edward);
        System.out.println(Jacob);

        Edward.setFairyOne("Rose");
        Edward.setFairyTwo("Ruby");

        Jacob.setFairyOne("Azure");
        Jacob.setFairyTwo("Sapphire");




    }
}
