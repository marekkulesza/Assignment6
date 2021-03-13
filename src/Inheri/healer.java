package Inheri;

public class healer extends Humans{

    final int magicRating = (int) ((Math.random() * 10) + 0);

    public healer(String name) {
        super(name);
    }
}
