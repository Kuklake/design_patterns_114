package pl.sda.java.designPatterns.behavioral.interpreter;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.function.Predicate;

@AllArgsConstructor
public class Where implements Expression {

    private Predicate<String> filter;

    @Override
    public List<String> interpret(Context context) {
        context.setFilter(filter);
        return context.search();
    }
}
