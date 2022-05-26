package pl.sda.java.designPatterns.structural.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FacadeTest {

    @Test
    void shouldDrawTriangleAndCircle() {
        ShapesDrawer shapesDrawer = new ShapesDrawer();
        String expected = "triangle, circle";

        String triangle = shapesDrawer.drawTriangle();
        String circle = shapesDrawer.drawCircle();

        assertEquals(expected, triangle + ", " + circle);
    }

    @Test
    void shouldDrawAllShapes() {
        ShapesDrawer shapesDrawer = new ShapesDrawer();
        String expected = "triangle, circle, rectangle, square";

        String shapes = shapesDrawer.drawShapes();

        assertEquals(expected, shapes);
    }
}