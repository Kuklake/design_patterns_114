package pl.sda.java.designPatterns.structural.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProxyTest {

    @Test
    void shouldCreateOnlyOneObject() {
        ExpensiveObjectProxy expensiveObjectProxy1 = new ExpensiveObjectProxy();
        ExpensiveObjectProxy expensiveObjectProxy = new ExpensiveObjectProxy();
        int expected = 1;

        expensiveObjectProxy.process();
        expensiveObjectProxy.process();
        expensiveObjectProxy1.process();
        expensiveObjectProxy1.process();

        assertEquals(expected, ExpensiveObjectImpl.getCounter());
    }

    @Test
    void shouldCreateMultipleObjects() {
        ExpensiveObject obj1 = new ExpensiveObjectImpl();
        ExpensiveObject obj2 = new ExpensiveObjectImpl();
        int expected = 2;

        obj1.process();
        obj2.process();

        assertEquals(expected, ExpensiveObjectImpl.getCounter());
    }
}