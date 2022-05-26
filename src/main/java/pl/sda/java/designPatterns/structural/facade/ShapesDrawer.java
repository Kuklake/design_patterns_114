package pl.sda.java.designPatterns.structural.facade;

import java.util.Arrays;
import java.util.List;

public class ShapesDrawer {

    private Shape triangle;
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapesDrawer() {
        this.triangle = new Triangle();
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public String drawTriangle() {
        return triangle.draw();
    }

    public String drawCircle() {
        return circle.draw();
    }

    public String drawRectangle(){
        return rectangle.draw();
    }

    public String drawSquare() {
        return square.draw();
    }

    public String drawShapes() {
        List<String> drawers = Arrays.asList(
                drawTriangle(),
                drawCircle(),
                drawRectangle(),
                drawSquare()
        );

        String join = String.join(", ", drawers);
        return join;
    }
}