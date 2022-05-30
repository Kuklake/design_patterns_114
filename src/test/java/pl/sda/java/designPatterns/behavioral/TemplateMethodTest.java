package pl.sda.java.designPatterns.behavioral;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.sda.java.designPatterns.behavioral.templateMethod.*;

import java.util.Map;

class TemplateMethodTest {

    @Test
    void shouldBuildStandardComputer() {
        ComputerBuilder standardComputerBuilder = new StandardComputerBuilder();

        Computer computer = standardComputerBuilder.buildComputer();
        Map<ComputerPart, PartLevel> computerParts = computer.getComputerParts();

        Assertions.assertEquals(PartLevel.STANDARD, computerParts.get(ComputerPart.PROCESSOR));
        Assertions.assertEquals(PartLevel.STANDARD, computerParts.get(ComputerPart.MEMORY));
        Assertions.assertEquals(PartLevel.STANDARD, computerParts.get(ComputerPart.MOTHERBOARD));
    }

    @Test
    void shouldBuildSuperComputer() {
        ComputerBuilder superComputerBuilder = new SuperComputerBuilder();

        Computer computer = superComputerBuilder.buildComputer();
        Map<ComputerPart, PartLevel> computerParts = computer.getComputerParts();

        Assertions.assertEquals(PartLevel.SUPER, computerParts.get(ComputerPart.PROCESSOR));
        Assertions.assertEquals(PartLevel.SUPER, computerParts.get(ComputerPart.MEMORY));
        Assertions.assertEquals(PartLevel.SUPER, computerParts.get(ComputerPart.MOTHERBOARD));
    }
}