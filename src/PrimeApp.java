import java.util.Arrays;

public class PrimeApp {
    public static void main (String[] args) {
        int[] primeNums = {1,2,3};
        primeNums = addNumToArray(7, primeNums);
        primeNums = addNumToArray(8, primeNums);

    System.out.println(Arrays.toString(primeNums));


    }
    private static int[] addNumToArray(int numToAdd, int[] originalArr) {
        int[] newArr = new int[originalArr.length + 1];
        for (int i = 0;i < originalArr.length; i++){
            newArr[i] = originalArr[i];
        }
        newArr[newArr.length -1] = numToAdd;
        return newArr;
    }
}