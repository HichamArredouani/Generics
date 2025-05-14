package Generics;

public class Mainn {
    public static void main (String[] args) {
        SmartIntList primeNums = new SmartIntList(new int[] {2,3, 5});
        primeNums.add(8);
        primeNums.add(11);

        System.out.println(primeNums);
    }
}
