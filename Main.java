import java.util.Arrays;
import java.lang.Math;

// Authors: Tristan Kalvoda - Andrew Lam 
// CSCI 3 5 0 1 LAB 2 Part 1
public class Main {

    public static void main (String[] args) {
    TestInteger[] testInteger1 = new TestInteger[10000];
        for (int i = 0; i <= 9999; i++) {
            testInteger1[i] = new TestInteger (i);
    }

    TestInteger[] generateTestInt1 = generateTestIntegers();
    TestInteger[] generateTestInt2 = generateTestInt1;
    
    // TEST CASES 1
    System.out.println("\nTest Case 1");

   

    long starttimemerge = System.currentTimeMillis();
    Arrays.sort(generateTestInt2);
    long endtimemerge = System.currentTimeMillis();

    // prints last 5 elements
    // for (int i = generateTestInt2.length-5; i < generateTestInt2.length; i++) {
    //     System.out.println(generateTestInt2[i]);
    // }

    System.out.println("TimeMergeSort " + (endtimemerge - starttimemerge) + " ms");
    System.out.println("Counting : " + TestInteger.getCounter());

    TestInteger.resetCounter();

    long starttimequick = System.currentTimeMillis();
    quickSort(generateTestInt1, 0, generateTestInt1.length-1);
    long endtimequick = System.currentTimeMillis();

    // prints last 5 elements
    // for (int i = generateTestInt1.length-5; i < generateTestInt1.length; i++) {
    //     System.out.println(generateTestInt1[i]);
    // }

    System.out.println("\nTimeQuickSort " + (endtimequick - starttimequick) + " ms");
    System.out.println("Counting : " + TestInteger.getCounter() + "\n");
    

    // TEST CASES 2
    System.out.println("\nTest Case 2");

    TestInteger.resetCounter();

    long starttimemerge1 = System.currentTimeMillis();
    Arrays.sort(testInteger1);
    long endtimemerge1 = System.currentTimeMillis();
    System.out.println("TimeMergeSort1 " + (endtimemerge1 - starttimemerge1) + " ms");
    System.out.println("Counting : " + TestInteger.getCounter() + "\n");
    
    TestInteger.resetCounter();

    long starttimequick1 = System.currentTimeMillis();
    quickSort(testInteger1, 0, testInteger1.length-1);
    long endtimequick1 = System.currentTimeMillis();
    System.out.println("TimeQuickSort1 " + (endtimequick1 - starttimequick1) + " ms");
    System.out.println("Counting : " + TestInteger.getCounter());
    
    // TEST CASES 3
    System.out.println("\nTest Case 3");

    TestInteger[] testInteger1000sequences = new TestInteger[10000];
    for (int i=0; i < 10; i++) {
        int startingNumber = (int) (Math.random()*10000);
        for (int j = 0; j < 1000; j++) {
            testInteger1000sequences[i* 1000 + j] = new TestInteger((int) startingNumber +j);
        }
    }

    TestInteger.resetCounter();

    long starttimemerge2 = System.currentTimeMillis();
    Arrays.sort(testInteger1000sequences);
    long endtimemerge2 = System.currentTimeMillis();

    System.out.println("TimeMergeSort2 " + (endtimemerge2 - starttimemerge2) + " ms");
    System.out.println("Counting : " + TestInteger.getCounter() + "\n");

    TestInteger.resetCounter();

    long starttimequick2 = System.currentTimeMillis();
    quickSort(testInteger1000sequences, 0, testInteger1000sequences.length-1);
    long endtimequick2 = System.currentTimeMillis();

    System.out.println("TimeQuickSort2 " + (endtimequick2 - starttimequick2) + " ms");
    System.out.println("Counting : " + TestInteger.getCounter());

    // TEST CASES 4
    System.out.println("\nTest Case 4");

    TestInteger[] testInteger1000SequencesDecreasing = new TestInteger[10000];
    for (int i=0; i < 10; i++) {
        int startingNumber = (int) (Math.random()*10000);
        for (int j = 0; j < 1000; j++) {
            testInteger1000SequencesDecreasing[i* 1000 + j] = new TestInteger((int) startingNumber - j);
        }
    }

    TestInteger.resetCounter();

    long starttimemerge3 = System.currentTimeMillis();
    Arrays.sort(testInteger1000SequencesDecreasing);
    long endtimemerge3 = System.currentTimeMillis();

    System.out.println("TimeMergeSort3 " + (endtimemerge3 - starttimemerge3) + " ms");
    System.out.println("Counting : " + TestInteger.getCounter() + "\n");

    TestInteger.resetCounter();

    long starttimequick3 = System.currentTimeMillis();
    quickSort(testInteger1000SequencesDecreasing, 0, testInteger1000SequencesDecreasing.length-1);
    long endtimequick3 = System.currentTimeMillis();

    System.out.println("TimeQuickSort3 " + (endtimequick3 - starttimequick3) + " ms");
    System.out.println("Counting : " + TestInteger.getCounter());

    // System.out.println(Arrays.toString(testInteger1000SequencesDecreasing));
    
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
        TestInteger pivot = testInteger[endInd];
        int i = startInd;

        for (int j = startInd; j < endInd; j++) {
            if (testInteger[j].compareTo(pivot) <= 0) {
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
