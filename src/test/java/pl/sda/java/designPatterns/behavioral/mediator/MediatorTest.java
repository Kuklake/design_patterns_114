package pl.sda.java.designPatterns.behavioral.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MediatorTest {

    private Spouse wife = new Spouse("Kasia", Role.WIFE);
    private Spouse husband = new Spouse("Tomek", Role.HUSBAND);

    @Test
    void wifeShouldLoveHerHusband() {
        String msg = "Why you are so distant!?";

        String sentMsg = wife.sendMsg(msg);

        assertEquals(Mediator.PREFIX + msg, sentMsg);
    }

    @Test
    void husbandShouldLoveHisWife() {
        String msg = "Why you talk so much!?";

        String sentMsg = husband.sendMsg(msg);

        assertEquals(Mediator.PREFIX + msg, sentMsg);
    }
}