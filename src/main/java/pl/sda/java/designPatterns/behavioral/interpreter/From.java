package pl.sda.java.designPatterns.behavioral.interpreter;

import lombok.AllArgsConstructor;

import java.util.List;
@AllArgsConstructor
public class From implements Expression {

    private String table;
    private Where where;

    public From(String table) {
        this.table = table;
    }

    @Override
    public List<String> interpret(Context context) {
        context.setTable(table);
        List<String> result = where == null ? context.search() : where.interpret(context);
        return result;
    }
}