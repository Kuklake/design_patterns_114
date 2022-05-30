package pl.sda.java.designPatterns.behavioral.templateMethod;

public class StandardComputerBuilder extends ComputerBuilder {
    @Override
    protected void addMemory() {
        computerParts.put(ComputerPart.MEMORY, PartLevel.STANDARD);
    }

    @Override
    protected void addProcessor() {
        computerParts.put(ComputerPart.PROCESSOR, PartLevel.STANDARD);
    }

    @Override
    protected void addMotherBoard() {
        computerParts.put(ComputerPart.MOTHERBOARD, PartLevel.STANDARD);
    }
}
