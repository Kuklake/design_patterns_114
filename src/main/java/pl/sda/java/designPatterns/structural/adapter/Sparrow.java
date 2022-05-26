package pl.sda.java.designPatterns.structural.adapter;

public class Sparrow implements Bird {
    @Override
    public String getSound() {
        return "ćwirk ćwirk";
    }
}
