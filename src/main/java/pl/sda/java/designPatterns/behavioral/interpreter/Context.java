package pl.sda.java.designPatterns.behavioral.interpreter;

import lombok.Setter;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Setter
public class Context {

    private static Map<String, List<Row>> tables = new HashMap<>();

    static {

        List<Row> children = new ArrayList<>();
        children.add(new Row("Zofia", "Mądra"));
        children.add(new Row("Stanisław", "Bogaty"));
        children.add(new Row("Antoś", "Wybitny"));
        children.add(new Row("Kazio", "Kochliwy"));

        tables.put("dzieci", children);
    }

    private String table;
    private String column;
    private int colIndex;

    private Predicate<String> matchAnyString = s -> s.length() > 0;
    private Predicate<String> filter = matchAnyString;

    private Function<String, Stream<String>> columnMapper;

    public void setColumn(String column) {
        this.column = column;
        setColumnMapper();
    }

    private void setColumnMapper() {
        switch (column) {
            case "*":
                colIndex = -1;
                break;
            case "firstName":
                colIndex = 0;
                break;
            case "lastName":
                colIndex = 1;
                break;
        }

        if (colIndex != -1) {
            columnMapper = s -> Stream.of(s.split(" ")[colIndex]);
        } else {
            columnMapper = Stream::of;
        }
    }

    public List<String> search() {

        List<String> result = tables.get(table)
                .stream()
                .map(Row::toString)
                .flatMap(columnMapper)
                .filter(filter)
                .collect(Collectors.toList());

        clear();
        return result;
    }

    private void clear() {
        this.filter = matchAnyString;
    }
}