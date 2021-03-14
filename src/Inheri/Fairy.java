package Inheri;

public class Fairy extends Inhabitant {

    public Fairy(String name) {
        super(name);
    }

    /**
     * Innervate can be used on any Human that's subclass is a healer
     *
     * @param inhabitant any Human, be careful because they must be subclass healer
     */
    public void innervate(Human inhabitant) {
        if (inhabitant.getHumanSubClass().equals("Healer")) {
            int randomNum = (int) ((Math.random() * 10) + 0);
            inhabitant.setMagicRating(randomNum);
            System.out.println(getName() + " has innervated " + inhabitant.getName() + " to " + randomNum + " mana");
        } else {
            System.out.println("You can't innervate them!");
        }
    }

    @Override
    public String toString() {
        return "Fairy{" +
                super.toString();
    }
}
