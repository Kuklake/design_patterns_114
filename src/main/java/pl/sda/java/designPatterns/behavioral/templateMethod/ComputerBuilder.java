package pl.sda.java.designPatterns.behavioral.templateMethod;

import java.util.HashMap;
import java.util.Map;

public abstract class ComputerBuilder {

    protected Map<ComputerPart, PartLevel> computerParts = new HashMap<>();

//    template method
    public final Computer buildComputer(){
        addMotherBoard();
        addProcessor();
        addMemory();

        return new Computer(computerParts);
    }

    protected abstract void addMemory();

    protected abstract void addProcessor();

    protected abstract void addMotherBoard();

}
