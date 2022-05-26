package pl.sda.java.designPatterns.creational.abstractFactory;

public abstract class AbstractFactory {
    abstract Shape getShape(ShapeType shapeType);
}
