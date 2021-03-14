package Inheri;

public class BlueMoon extends Werewolves{

    final String pack = "Blue Moon";

    public BlueMoon(String name) {
        super(name);
    }

    public void blueFairyNameHelp() {
        System.out.println("blue, slate, sky, navy, indigo, cobalt, teal, ocean, sapphire, artic, berry, lapis, azure, aegean");
    }

    @Override
    public String toString() {
        return "BlueMoon{" +
                "pack='" + pack + '\'' +
                ", name='" + name + '\'' +
                ", fairyOne=" + fairyOne +
                ", fairyTwo=" + fairyTwo +
                '}';
    }
}
