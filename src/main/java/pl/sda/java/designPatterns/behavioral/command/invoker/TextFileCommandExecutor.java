package pl.sda.java.designPatterns.behavioral.command.invoker;

import pl.sda.java.designPatterns.behavioral.command.command.TextFileCommand;

public class TextFileCommandExecutor {

    public static String executeCommand(TextFileCommand textFileCommand) {
        return textFileCommand.execute();
    }

}
