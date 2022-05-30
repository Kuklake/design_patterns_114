package pl.sda.java.designPatterns.behavioral.templateMethod;

public class SuperComputerBuilder extends ComputerBuilder {
    @Override
    protected void addMemory() {
        computerParts.put(ComputerPart.MEMORY, PartLevel.SUPER);
    }

    @Override
    protected void addProcessor() {
        computerParts.put(ComputerPart.PROCESSOR, PartLevel.SUPER);
    }

    @Override
    protected void addMotherBoard() {
        computerParts.put(ComputerPart.MOTHERBOARD, PartLevel.SUPER);
    }
}
