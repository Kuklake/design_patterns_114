package pl.sda.java.designPatterns.behavioral.mediator;

public class Mediator {

    protected static final String PREFIX = "I love you. ";

    public static String accommodate(Spouse spouse, String msg) {

        return PREFIX + msg;
    }
}
