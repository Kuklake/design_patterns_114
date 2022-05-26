package pl.sda.java.designPatterns.creational.abstractFactory;

public class ShapeFactory extends AbstractFactory{

    @Override
    public Shape getShape(ShapeType shapeType) {

        Shape shape = switch (shapeType) {
            case SQUARE -> new Square();
            case RECTANGLE -> new Rectangle();
        };
        return shape;
    }
}
