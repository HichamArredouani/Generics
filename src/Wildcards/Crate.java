package Wildcards;

public class Crate <T> {
    private T contents;

    public Crate (T contents) {
        this.contents = contents;
    }

    public void setContents(T contents) {
        this.contents = contents;
    }
    public T getContents() {
        return contents;
    }
    @Override
    public String toString() {
        return "Crate containing: " + contents.toString();
    }

}
