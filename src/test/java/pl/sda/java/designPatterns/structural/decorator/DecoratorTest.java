package pl.sda.java.designPatterns.structural.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecoratorTest {
    @Test
    void shouldHaveNoDecoration() {
        ChristmasTreeImpl nakedTree = new ChristmasTreeImpl();
        String expected = "Christmas tree";

        String decorate = nakedTree.decorate();

        assertEquals(expected, decorate);
    }

    @Test
    void shouldBeDecoratedWithBubbleLights() {
        ChristmasTreeImpl nakedTree = new ChristmasTreeImpl();
        ChristmasTree treeWithBubbleLight = new BubbleLights(nakedTree);
        String expected = "Christmas tree with bubble lights";

        String decorate = treeWithBubbleLight.decorate();

        assertEquals(expected, decorate);
    }

    @Test
    void shouldBeDecoratedWithBubbleLightAndGarland() {
        ChristmasTreeImpl nakedTree = new ChristmasTreeImpl();
        ChristmasTree treeWithBubbleLight = new BubbleLights(nakedTree);
        ChristmasTree treeWithBubbleLightsAndGarland = new Garland(treeWithBubbleLight);
        String expected = "Christmas tree with bubble lights with garland";

        String decorate = treeWithBubbleLightsAndGarland.decorate();

        assertEquals(expected, decorate);
    }

    @Test
    void shouldBeDecoratedWithBubbleLightAndTwoGarlands() {
        ChristmasTree christmasTreeWithBubbleLightsAndTwoGarlands =
                new Garland(new Garland(new BubbleLights(new ChristmasTreeImpl())));
        String expected = "Christmas tree with bubble lights with garland with garland";

        String decorate = christmasTreeWithBubbleLightsAndTwoGarlands.decorate();

        assertEquals(expected, decorate);
    }
}