package pl.sda.java.designPatterns.behavioral.iterator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IteratorTest {

    @Test
    void shouldIterateOverNames() {
        StringContainer container = new StringContainer();
        List<String> names = new ArrayList<>();

//        for (int i = 0; i < 3; i++)
        for(Iterator<String> i = container.getIterator(); i.hasNext();){
            names.add(i.next());
        }

        assertTrue(names.contains("Zofia"));
        assertTrue(names.contains("Stanisław"));
        assertTrue(names.contains("Antoni"));
        assertTrue(names.contains("Kazio"));
    }

    @Test
    void shouldIterateOnlyOverOddIndexes() {

        StringContainer container = new StringContainer();
        List<String> names = new ArrayList<>();

//        for (int i = 0; i < 3; i++)
        for(Iterator<String> i = container.getIterator(); i.hasNext(); i.next()){
            names.add(i.next());
        }

        assertTrue(names.contains("Zofia"));
        assertTrue(names.contains("Antoni"));
    }
}