package Generics;

import java.util.Arrays;

public class SmartGenericList<T> {
    private T[] arr = (T[]) new Object[0];

    public SmartGenericList() {
    }

    public SmartGenericList (T[] arr) {
        this.arr = arr;
    }
    private T[] getArr() {
        return arr;
    }
    private void setArr (T[] arr) {
        this.arr = arr;
    }
    @Override
    public String toString() {
        return Arrays.toString(getArr());
    }
    public void add(T elToAdd) {
        T[] originalArr = getArr();
        T[] newArr = (T[]) new Object[originalArr.length + 1];
        for (int i = 0; i < originalArr.length; i++) {
            newArr[i] = originalArr[i];
        }
        newArr[newArr.length - 1] = elToAdd;
        setArr(newArr);
    }

    public int size() {
        return getArr().length;
    }

    public boolean isEmpty() {
        return size() == 0;
    }
    public boolean contains(T elToSearch) {
        for (T el : getArr()) {
            if (el.equals(elToSearch)) {
                return true;
            }
        }
        return false;
    }
    public T get (int index) {
        return getArr() [index];
    }

    public int indexOf (T elToSearch) {
        T[] arr = getArr();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elToSearch) {
                return i;
            }
        }
        return -1;
    }




}
