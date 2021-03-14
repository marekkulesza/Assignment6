package Inheri;

public class RedMoon extends Werewolves{

    final String pack = "Red Moon";

    public RedMoon(String name) {
        super(name);
    }

    public void redFairyNameHelp() {
        System.out.println("scarlet, crimson, cerise, magenta, maroon, carmine, claret, burgundy, carnelian, cherry, cardinal red, ruby, garnet, vermilion, wine-red, rust-red, rufous-red, terracotta-red");
    }

    @Override
    public String toString() {
        return "RedMoon{" +
                "name='" + name + '\'' +
                ", pack='" + pack + '\'' +
                ", fairyOne=" + fairyOne +
                ", fairyTwo=" + fairyTwo +
                '}';
    }
}
