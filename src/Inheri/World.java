package Inheri;

public class World {
    public static void main(String[] args) {
        Human Areith = new Healer("Areith");
        Human Hunter = new Hunter("Mama");
        Human BetterAreith = new Healer("Better Areith",4,4,6,7);
        Human BetterHunter = new Hunter("Better Mama",4,4,6,7);

        System.out.println(Areith);
        System.out.println(Hunter);

        System.out.println(BetterAreith);
        System.out.println(BetterHunter);

        Areith.attack(Hunter);
        Hunter.attack(Areith);
        Hunter.attack(Areith);
        Hunter.attack(Areith);
        Hunter.attack(Areith);
        Hunter.attack(Areith);
        Hunter.attack(Areith);
        Areith.attack(Hunter);
        System.out.println(Areith);
        System.out.println(Hunter);

        BetterAreith.curaga(Hunter);
        BetterHunter.curaga(Hunter);

        Hunter.increaseAgility();
        Hunter.increaseStrength();
        Hunter.increaseArmour();
        Hunter.increaseHealthRating();
        Hunter.increaseHealthRating();
        Hunter.increaseHealthRating();
        Hunter.increaseHealthRating();
        Hunter.increaseHealthRating();
        Hunter.increaseHealthRating();
        Hunter.increaseHealthRating();
        Hunter.increaseHealthRating();
        Hunter.increaseHealthRating();
        Hunter.increaseHealthRating();
        Hunter.increaseHealthRating();
        System.out.println(Hunter);


        System.out.println("Human fight is over");

        Werewolf Edward = new RedMoon("Edward");
        Werewolf Jacob = new BlueMoon("Jacob");
        Fairy Rose = new Fairy("Rose");
        Fairy Ruby = new Fairy("Ruby");
        Fairy Azure = new Fairy("Azure");
        Fairy Sapphire = new Fairy("Sapphire");

        System.out.println(Edward);
        System.out.println(Jacob);

        Edward.setFairyOne(Rose);
        Edward.setFairyTwo(Ruby);

        Edward.getFairyOne();
        Edward.getFairyTwo();

        Jacob.setFairyOne(Azure);
        Jacob.setFairyTwo(Sapphire);

        System.out.println(Edward);
        System.out.println(Jacob);




    }
}
