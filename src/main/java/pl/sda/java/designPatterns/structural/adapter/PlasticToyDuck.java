package pl.sda.java.designPatterns.structural.adapter;

public class PlasticToyDuck implements ToyDuck {
    @Override
    public String getSqueakSound() {
        return "squeak";
    }
}
