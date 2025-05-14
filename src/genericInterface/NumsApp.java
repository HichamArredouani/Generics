package genericInterface;

public class NumsApp<T> {
    public static void main(String[] args) {
        SmartList<Integer> primeNums = new SmartArrayList<>();

        primeNums.add(2);
        primeNums.add(3);
        primeNums.add(7);
        primeNums.add(8);
        primeNums.add(1);
        primeNums.add(9);
        primeNums.add(4);
        primeNums.add(5);

        System.out.printf("The first number is: %d\n", primeNums.get(0));
    }
}
