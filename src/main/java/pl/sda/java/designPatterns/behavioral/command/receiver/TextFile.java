package pl.sda.java.designPatterns.behavioral.command.receiver;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TextFile {

    private String name;

    public String open() {
        return "opening file";
    }

    public String save() {
        return "saving file";
    }
}
