package pl.sda.java.designPatterns.behavioral.interpreter;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InterpeterTest {

    private Context context = new Context();

    @Test
    void shouldSelectLastNamesEndingWithY() {
        Expression selectQuery = new Select("lastName",
                new From("dzieci", new Where(lastName -> lastName.endsWith("y"))));
        String expected = "[Bogaty, Wybitny, Kochliwy]";

        List<String> result = selectQuery.interpret(context);

        assertEquals(expected, result.toString());
    }
    

    @Test
    void shouldSelectAllNames() {
        Expression selectQuery = new Select("firstName", new From("dzieci"));
        String expected = "[Zofia, Stanisław, Antoś, Kazio]";

        List<String> result = selectQuery.interpret(context);

        assertEquals(expected, result.toString());
    }

    @Test
    void shouldFindAll() {
        Expression selectQuery = new Select("*", new From("dzieci"));
        String expected = "[Zofia Mądra, Stanisław Bogaty, Antoś Wybitny, Kazio Kochliwy]";

        List<String> result = selectQuery.interpret(context);

        assertEquals(expected, result.toString());
    }
}