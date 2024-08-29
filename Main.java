import java.util.Arrays;

public class Main {

    public static void main (String[] args) {
    int[] array1 = {30, 20, 10};
    Arrays.sort(array1);
    System.out.println(Arrays.toString(array1));
    quickSort(array1, 0, 2);
    }

    public static void quickSort(TestInteger[] testInteger, int startInd, int endInd){
       if (startInd >= endInd || startInd < 0) return;

       int p = partition(testInteger, startInd, endInd);

       quickSort(testInteger, startInd, p-1);
       quickSort(testInteger, p+1, endInd);

    }

    public static void swap(TestInteger[] array, int i, int j) {
        TestInteger temp = array[i];
        array [i] = array [j];
        array [j] = temp;
    }

    private static int partition(TestInteger[] testInteger, int startInd, int endInd) {
        TestInteger Pivot = testInteger[endInd];
        int i = startInd;

        for (int j = startInd; j < endInd-1; j++) {
            if (testInteger[i].compareTo(Pivot) <= 0) {
                swap(testInteger, i ,j);
                i = i + 1;
            }
        }
        
        swap( testInteger, i, endInd);
        return i;
    }


}
