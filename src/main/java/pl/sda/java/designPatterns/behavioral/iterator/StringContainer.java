package pl.sda.java.designPatterns.behavioral.iterator;

public class StringContainer implements Container<String> {

    private String names[] = {"Zofia", "Stanisław", "Antoni", "Kazio"};

    @Override
    public Iterator<String> getIterator() {
        return new StringIterator(names);
    }
}
