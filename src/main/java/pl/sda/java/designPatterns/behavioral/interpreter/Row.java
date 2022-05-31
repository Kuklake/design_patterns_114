package pl.sda.java.designPatterns.behavioral.interpreter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Row {
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
