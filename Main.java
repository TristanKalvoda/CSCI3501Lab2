import java.util.Arrays;

public class Main {

    public static void main (String[] args) {
    int[] array1 = {30, 20, 10};
    Arrays.sort(array1);
    System.out.println(Arrays.toString(array1));
    }

    public static void quickSort(TestInteger[] testInteger, int startInd, int endInd){
       if (startInd >= endInd || startInd < 0) return;

       int p = partition(testInteger, startInd, endInd);

       quickSort(testInteger, startInd, p-1);
       quickSort(testInteger, p+1, endInd);

    }

    private static int partition(TestInteger[] testInteger, int startInd, int endInd) {
        TestInteger Pivot = testInteger[endInd];
        int i = startInd;

        
        return 1;
    }
}
