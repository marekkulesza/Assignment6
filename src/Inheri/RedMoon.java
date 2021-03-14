package Inheri;

public class RedMoon extends Werewolf {

    final String pack = "Red Moon";

    public RedMoon(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "RedMoon{" +
                super.toString();
    }
}
