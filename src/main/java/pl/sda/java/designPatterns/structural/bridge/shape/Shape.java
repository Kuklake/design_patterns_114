package pl.sda.java.designPatterns.structural.bridge.shape;

import pl.sda.java.designPatterns.structural.bridge.color.Color;

public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public String draw();
}
