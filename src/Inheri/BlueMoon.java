package Inheri;

public class BlueMoon extends Werewolf {

    final String pack = "Blue Moon";

    public BlueMoon(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "BlueMoon{" +
                super.toString();
    }
}
