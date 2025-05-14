package genericInterface;

public class SmartArrayList<E> implements SmartList<E> {

    private E[] arr;
    public SmartArrayList(){
        arr = (E[] ) new Object[0];
    }
    public E[] getArr() {
        return arr;
    }
    public void setArr (E[] arr) {
        this.arr = arr;
    }
    public void add(E elementToAdd) {
        E[] originalArr = getArr();
        E[] newArr = (E[]) new Object[originalArr.length + 1];
        for (int i = 0; i < originalArr.length; i++) {
            newArr[i] = originalArr[i];
        }
        newArr[newArr.length - 1] = elementToAdd;
        setArr(newArr);
    }
    @Override
    public E get (int index) {
        return getArr() [index];
    }

    @Override
    public int size() {
        return getArr().length;
    }
}
