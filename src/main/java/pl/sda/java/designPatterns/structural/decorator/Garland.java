package pl.sda.java.designPatterns.structural.decorator;

public class Garland extends TreeDecorator {
    public Garland(ChristmasTree tree) {
        super(tree);
    }

    @Override
    public String decorate() {
        return super.decorate() + addGarland();
    }

    private String addGarland() {
        return " with garland";
    }
}
