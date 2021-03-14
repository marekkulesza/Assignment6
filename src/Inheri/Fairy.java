package Inheri;

public class Fairy extends Inhabitant {

    public Fairy(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Fairies{" +
                "name='" + name + '\'' +
                '}';
    }
}
