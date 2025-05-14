package Generics;

import java.util.Arrays;

public class SmartIntList {
    private int[] intArr = new int[0];

    public SmartIntList() {
    }
    public SmartIntList(int[] numbers) {
        this.intArr = intArr;
    }
    private int[] getIntArr() {
        return intArr;
    }
    private void setIntArr (int[] intArr) {
        this.intArr = intArr;
    }
    @Override
    public String toString() {
        return Arrays.toString(getIntArr());
}
    public void add(int numToAdd) {
        int[] originalArr = getIntArr();
        int[] newArr = new int[originalArr.length +1];
        for (int i= 0; i < originalArr.length; i++) {
            newArr[i] = originalArr[i];
        }
        newArr[newArr.length -1] = numToAdd;
        setIntArr(newArr);

    }
    public int size(){
    return getIntArr().length;
}
    public boolean isEmpty() {
    return size() == 0;
}

    public boolean contains(int numToSearch) {
    for (int num : getIntArr()) {
    if (num ==numToSearch) {
    return true;
}
}
return false;
}
}