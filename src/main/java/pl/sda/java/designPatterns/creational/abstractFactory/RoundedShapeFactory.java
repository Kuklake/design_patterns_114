package pl.sda.java.designPatterns.creational.abstractFactory;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(ShapeType shapeType) {

        Shape shape = switch (shapeType) {
            case SQUARE -> new RoundedSquare();
            case RECTANGLE -> new RoundedRectangle();
        };
        return shape;
    }
}
