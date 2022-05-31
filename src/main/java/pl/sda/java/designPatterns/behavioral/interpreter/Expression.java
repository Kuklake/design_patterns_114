package pl.sda.java.designPatterns.behavioral.interpreter;

import java.util.List;

public interface Expression {
    List<String> interpret(Context context);
}
