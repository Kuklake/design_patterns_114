package pl.sda.java.designPatterns.creational.abstractFactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractFactoryTest {

    @Test
    void shouldCreateRoundedRectangle() {
//        given
        AbstractFactory factory = FactoryProducer.getFactory(true);
        Shape shape = factory.getShape(ShapeType.RECTANGLE);
        String expected = "drawing rounded rectangle";

//        when
        String draw = shape.draw();

//        then
        assertEquals(expected, draw);
    }

    @Test
    void shouldCreateSquare() {
        AbstractFactory factory = FactoryProducer.getFactory(false);
        Shape shape = factory.getShape(ShapeType.SQUARE);
        String expected = "drawing square";

//        when
        String draw = shape.draw();

//        then
        assertEquals(expected, draw);
    }
}