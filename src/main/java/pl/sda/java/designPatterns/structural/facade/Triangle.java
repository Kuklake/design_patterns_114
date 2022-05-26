package pl.sda.java.designPatterns.structural.facade;

public class Triangle implements Shape {
    @Override
    public String draw() {
        return "triangle";
    }
}