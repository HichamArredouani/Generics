package GenericMethods;

public class GenericMethodsApp {
    public static void main (String[] args) {
        Integer[] cijfers = {1,2,3,4,5};
        int count = ArrayUtil.countOccurencesInArray(cijfers, 3);
        System.out.println("Aantal keer 3: " + count);
    }
}
