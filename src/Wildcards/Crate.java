package Wildcards;

public class Crate <T> {
    private T contents;

    public Crate (T contents) {
        this.contents = contents;
    }
    public T getContents() {
        return contents;
    }

    public void ship() {
       System.out.println("Shipping crate wiith: " + contents);
    }

    @Override
    public String toString() {
        return "Crate containing: " + contents.toString();
    }

}
