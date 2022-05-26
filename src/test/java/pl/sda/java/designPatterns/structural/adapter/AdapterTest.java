package pl.sda.java.designPatterns.structural.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdapterTest {
    @Test
    void birdShouldBehaveLikeAToyDuck() {
        Bird bird = new Sparrow();
        BirdAdapter birdAdapter = new BirdAdapter(bird);

        String squeakSound = birdAdapter.getSqueakSound();

        assertEquals(bird.getSound(), squeakSound);
    }
}