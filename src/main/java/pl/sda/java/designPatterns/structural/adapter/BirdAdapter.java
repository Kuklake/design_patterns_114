package pl.sda.java.designPatterns.structural.adapter;

public class BirdAdapter implements ToyDuck{

    private Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public String getSqueakSound() {
        return bird.getSound();
    }
}
