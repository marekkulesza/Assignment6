package Inheri;

/**
 * This is assignment 6, an RPG game
 * the idea of this project was to create a world of
 * inheritance, in which people, werewolves, and fairies
 * can be played around which each other. Humans have two
 * subclasses either hunter or healer, werewolves are of two
 * packs redmoon or blue moon, and fairies innervate human healers
 *
 * @author Marek Kulesza
 */

public class World {
    public static void main(String[] args) {
        Healer Areith = new Healer("Areith");
        Human Hunter = new Hunter("Mama");
        Healer BetterAreith = new Healer("Better Areith", 4, 4, 6, 7);
        Human BetterHunter = new Hunter("Better Mama", 4, 4, 6, 7);

        System.out.println(Areith);
        System.out.println(Hunter);

        System.out.println(BetterAreith);
        System.out.println(BetterHunter);

        System.out.println(Areith.getName());

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

        // Werewolf broken = new Hunter("Jacob2.0");

        Edward.attack(Jacob);

        System.out.println(Jacob);
        System.out.println(Edward);

        System.out.println(Edward.getName());
        System.out.println(Edward.getHealthRating());

        System.out.println(Areith);
        Sapphire.innervate(Areith);
        System.out.println(Areith);

        Areith.setWerewolfFriend(Jacob);
        System.out.println(Areith);
        Areith.setWerewolfFriend(Edward); // Doesn't work as intended
        System.out.println(Areith);

    }
}
