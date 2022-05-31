package pl.sda.java.designPatterns.behavioral.command.command;

import org.junit.jupiter.api.Test;
import pl.sda.java.designPatterns.behavioral.command.invoker.TextFileCommandExecutor;
import pl.sda.java.designPatterns.behavioral.command.receiver.TextFile;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CommandTest {

    private static final String PODANIE = "podanie";

    @Test
    void shouldOpenTextFile() {
        TextFile textFile = new TextFile(PODANIE);
        TextFileCommand openTextFileCommand = new OpenTextFileCommand(textFile);
        String expected = "opening file";

        String openCommand = TextFileCommandExecutor.executeCommand(openTextFileCommand);

        assertEquals(expected, openCommand);
    }

    @Test
    void shouldSaveTextFile() {
        TextFile textFile = new TextFile(PODANIE);
        TextFileCommand saveTextFileCommand = new SaveTextFileCommand(textFile);
        String expected = "saving file";

        String saveCommand = TextFileCommandExecutor.executeCommand(saveTextFileCommand);

        assertEquals(expected, saveCommand);
    }
}