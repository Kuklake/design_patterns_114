package pl.sda.java.designPatterns.creational.abstractFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(boolean rounded) {

        AbstractFactory abstractFactory = rounded ? new RoundedShapeFactory() : new ShapeFactory();
        return abstractFactory;
    }
}