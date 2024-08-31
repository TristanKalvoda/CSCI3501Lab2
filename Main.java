import java.util.Arrays;
import java.lang.Math;

public class Main {

    public static void main (String[] args) {
    int[] array1 = {30, 45, 50, 100, 200};
    TestInteger[] testInteger1 = new TestInteger[10000];
        for (int i = 0; i <= 9999; i++) {
            testInteger1[i] = new TestInteger (i);
    }

    TestInteger[] testInteger1000sequences = new TestInteger[10000];
    for (int i=0; i < 10; i++) {
        int startingNumber = (int) (Math.random()*10000);
        for (int j = 0; j < 1000; j++) {
            testInteger1000sequences[i* 1000 + j] = new TestInteger((int) startingNumber +j);
        }
    }

    long starttimemerge2 = System.currentTimeMillis();
    Arrays.sort(testInteger1000sequences);
    long endtimemerge2 = System.currentTimeMillis();

    System.out.println("TimeMergeSort2 " + (endtimemerge2 - starttimemerge2) + " ms\n");

    long starttimequick2 = System.currentTimeMillis();
    quickSort(testInteger1, 0, testInteger1000sequences.length-1);
    long endtimequick2 = System.currentTimeMillis();

    System.out.println("TimeQuickSort2 " + (endtimequick2 - starttimequick2) + " ms\n");

    // System.out.println(Arrays.toString(testInteger1000sequences));
    long starttimemerge1 = System.currentTimeMillis();
    Arrays.sort(testInteger1);
    long endtimemerge1 = System.currentTimeMillis();
    // System.out.println(Arrays.toString(testInteger1));
    System.out.println("TimeMergeSort1 " + (endtimemerge1 - starttimemerge1) + " ms\n");

    long starttimequick1 = System.currentTimeMillis();
    quickSort(testInteger1, 0, testInteger1.length-1);
    long endtimequick1 = System.currentTimeMillis();

    // System.out.println(Arrays.toString(testInteger1));
    System.out.println("TimeQuickSort2 " + (endtimequick1 - starttimequick1) + " ms\n");
    TestInteger[] generateTestInt1 = generateTestIntegers();
    TestInteger[] generateTestInt2 = generateTestInt1;
    

    long starttimequick = System.currentTimeMillis();
    quickSort(generateTestInt1, 0, generateTestInt1.length-1);
    // System.err.println(Arrays.toString(generateTestInt1));
    // prints last 5 elements
    long endtimequick = System.currentTimeMillis();

    for (int i = generateTestInt1.length-5; i < generateTestInt1.length; i++) {
        System.out.println(generateTestInt1[i]);
    }
    System.out.println("Counting for Quicksort");
    System.out.println("Counting : " + TestInteger.getCounter());
    System.out.println("TimeQuickSort " + (endtimequick - starttimequick) + " ms\n");

    TestInteger.resetCounter();

    long starttimemerge = System.currentTimeMillis();
    Arrays.sort(generateTestInt2);
    // prints last 5 elements
    long endtimemerge = System.currentTimeMillis();

    for (int i = generateTestInt2.length-5; i < generateTestInt2.length; i++) {
        System.out.println(generateTestInt2[i]);
    }

    System.out.println("Counting for Mergesort");
    System.out.println("Counting : " + TestInteger.getCounter());
    System.out.println("TimeMergeSort " + (endtimemerge - starttimemerge) + " ms\n");


    
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

        for (int j = startInd; j < endInd; j++) {
            if (testInteger[j].compareTo(Pivot) <= 0) {
                swap(testInteger, i ,j);
                i = i + 1;
            }
        }
        
        swap( testInteger, i, endInd);
        return i;
    }

    public static TestInteger[] generateTestIntegers() {
        TestInteger testInteger;
        int maxValue = 1000000;
        int n = 10000;
        TestInteger[] testIntegers = new TestInteger[n];
        for (int i = 0; i < n; i++) {
            testInteger = new TestInteger((int) (Math.random() * (maxValue-1) + 1));
            testIntegers[i] = testInteger;
        }
        return testIntegers;
    }

}
