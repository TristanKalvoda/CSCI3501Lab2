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
    TestInteger[] generateTestInt3 = generateTestInt1;
    TestInteger[] generateTestInt4 = generateTestInt1;
    TestInteger[] generateTestInt5 = generateTestInt1;
    
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

    TestInteger[] testInteger1000sequences2 = testInteger1000sequences;
    TestInteger[] testInteger1000sequences3 = testInteger1000sequences;
    TestInteger[] testInteger1000sequences4 = testInteger1000sequences;

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

    TestInteger[] testInteger1000SequencesDecreasing2 = testInteger1000SequencesDecreasing;
    TestInteger[] testInteger1000SequencesDecreasing3 = testInteger1000SequencesDecreasing;
    TestInteger[] testInteger1000SequencesDecreasing4 = testInteger1000SequencesDecreasing;

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

    // Randomized Quick Sort
    System.out.println("\nRandomized Quick Sort");

    TestInteger.resetCounter();

    System.out.println("\nTest Case 1");

    long starttimequick4 = System.currentTimeMillis();
    randomizedQuickSort(generateTestInt3, 0, generateTestInt3.length-1);
    long endtimequick4 = System.currentTimeMillis();
    System.out.println("\nTimeRandomizedQuickSort " + (endtimequick4 - starttimequick4) + " ms");
    System.out.println("Counting : " + TestInteger.getCounter());

    TestInteger.resetCounter();

    System.out.println("\nTest Case 2");

    long starttimequick5 = System.currentTimeMillis();
    randomizedQuickSort(testInteger1, 0, testInteger1.length-1);
    long endtimequick5 = System.currentTimeMillis();
    System.out.println("\nTimeRandomizedQuickSort1 " + (endtimequick5 - starttimequick5) + " ms");
    System.out.println("Counting : " + TestInteger.getCounter());

    TestInteger.resetCounter();

    System.out.println("\nTest Case 3");

    long starttimequick6 = System.currentTimeMillis();
    randomizedQuickSort(testInteger1000sequences2, 0, testInteger1000sequences2.length-1);
    long endtimequick6 = System.currentTimeMillis();
    System.out.println("\nTimeRandomizedQuickSort2 " + (endtimequick6 - starttimequick6) + " ms");
    System.out.println("Counting : " + TestInteger.getCounter());

    TestInteger.resetCounter();

    System.out.println("\nTest Case 4");

    long starttimequick7 = System.currentTimeMillis();
    randomizedQuickSort(testInteger1000SequencesDecreasing2, 0, testInteger1000SequencesDecreasing2.length-1);
    long endtimequick7 = System.currentTimeMillis();
    System.out.println("\nTimeRandomizedQuickSort3 " + (endtimequick7 - starttimequick7) + " ms");
    System.out.println("Counting : " + TestInteger.getCounter());

    //Median of three quicksort
    System.out.println("\nMedian of Three Pivot Selection");
    TestInteger.resetCounter();

    System.out.println("\nTest Case 1");
    long startimequick8 = System.currentTimeMillis();
    medianOfThreeQuickSort(generateTestInt4, 0, generateTestInt4.length-1, 2);
    long endtimequick8 = System.currentTimeMillis();

    System.out.println("\nTimeMedianOfThreeQuickSort " + (endtimequick8 - startimequick8) + " ms");
    System.out.println("Counting : " + TestInteger.getCounter());

    TestInteger.resetCounter();

    System.out.println("\nTest Case 2");
    long startimequick9 = System.currentTimeMillis();
    medianOfThreeQuickSort(testInteger1, 0, testInteger1.length-1, 2);
    long endtimequick9 = System.currentTimeMillis();

    System.out.println("\nTimeMedianOfThreeQuickSort1 " + (endtimequick9 - startimequick9) + " ms");
    System.out.println("Counting : " + TestInteger.getCounter());

    TestInteger.resetCounter();

    System.out.println("\nTest Case 3");
    long startimequick10 = System.currentTimeMillis();
    medianOfThreeQuickSort(testInteger1000sequences3, 0, testInteger1000sequences3.length-1, 2);
    long endtimequick10 = System.currentTimeMillis();

    System.out.println("\nTimeMedianOfThreeQuickSort2 " + (endtimequick10 - startimequick10) + " ms");
    System.out.println("Counting : " + TestInteger.getCounter());

    TestInteger.resetCounter();

    System.out.println("\nTest Case 4");
    long startimequick11 = System.currentTimeMillis();
    medianOfThreeQuickSort(testInteger1000SequencesDecreasing3, 0, testInteger1000SequencesDecreasing3.length-1, 2);
    long endtimequick11 = System.currentTimeMillis();

    System.out.println("\nTimeMedianOfThreeQuickSort3 " + (endtimequick11 - startimequick11) + " ms");
    System.out.println("Counting : " + TestInteger.getCounter());

    TestInteger.resetCounter();

    // Quick Sort with Insertion Sort

    System.out.println("\nQuick Sort with Insertion Sort");

    System.out.println("\nTest Case 1");
    long startimequick12 = System.currentTimeMillis();
    quickSortInsertionSort(generateTestInt5, 0, generateTestInt5.length-1, 50);
    long endtimequick12 = System.currentTimeMillis();

    System.out.println("\nTimeQuickSortInsertionSort " + (endtimequick12 - startimequick12) + " ms");
    System.out.println("Counting : " + TestInteger.getCounter());

    TestInteger.resetCounter();

    System.out.println("\nTest Case 2");
    long startimequick13 = System.currentTimeMillis();
    quickSortInsertionSort(testInteger1, 0, testInteger1.length-1, 50);
    long endtimequick13 = System.currentTimeMillis();

    System.out.println("\nTimeQuickSortInsertionSort1 " + (endtimequick13 - startimequick13) + " ms");
    System.out.println("Counting : " + TestInteger.getCounter());

    TestInteger.resetCounter();

    System.out.println("\nTest Case 3");
    long startimequick14 = System.currentTimeMillis();
    quickSortInsertionSort(testInteger1000sequences4, 0, testInteger1000sequences4.length-1, 50);
    long endtimequick14 = System.currentTimeMillis();

    System.out.println("\nTimeQuickSortInsertionSort2 " + (endtimequick14 - startimequick14) + " ms");
    System.out.println("Counting : " + TestInteger.getCounter());

    TestInteger.resetCounter();

    System.out.println("\nTest Case 4");
    long startimequick15 = System.currentTimeMillis();
    quickSortInsertionSort(testInteger1000SequencesDecreasing4, 0, testInteger1000SequencesDecreasing4.length-1, 50);
    long endtimequick15 = System.currentTimeMillis();

    System.out.println("\nTimeQuickSortInsertionSort3 " + (endtimequick15 - startimequick15) + " ms");
    System.out.println("Counting : " + TestInteger.getCounter());

    TestInteger.resetCounter();
    
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

    public static void randomizedQuickSort(TestInteger[] testInteger, int startInd, int endInd){
        if (startInd >= endInd || startInd < 0) return;

        int p = randomizedPartition(testInteger, startInd, endInd);

        randomizedQuickSort(testInteger, startInd, p-1);
        randomizedQuickSort(testInteger, p+1, endInd);
    }

    private static int randomizedPartition(TestInteger[] testInteger, int startInd, int endInd) {
        int randomIndex = (int) (Math.random() * (endInd - startInd) + startInd);
        swap(testInteger, randomIndex, endInd);
        return partition(testInteger, startInd, endInd);
    }

    private static void medianOfThree(TestInteger[] testInteger, int startInd, int endInd) {
        TestInteger randomIndexA = new TestInteger((int) (Math.random() * (endInd - startInd) + startInd));
        TestInteger randomIndexB = new TestInteger((int) (Math.random() * (endInd - startInd) + startInd));
        TestInteger randomIndexC = new TestInteger((int) (Math.random() * (endInd - startInd) + startInd));
        
        if (randomIndexA.compareTo(randomIndexB) > 0) {
            if (randomIndexA.compareTo(randomIndexC) < 0) {
                swap(testInteger, randomIndexA.value , endInd);

            } else if (randomIndexB.compareTo(randomIndexC) > 0) {
                swap(testInteger, randomIndexB.value , endInd);
            } else {
                swap(testInteger, randomIndexC.value , endInd);
            }
        } else {
            if (randomIndexA.compareTo(randomIndexC) > 0) {
                swap(testInteger, randomIndexA.value , endInd);
            } else if (randomIndexB.compareTo(randomIndexC) < 0) {
                swap(testInteger, randomIndexB.value , endInd);
            } else {
                swap(testInteger, randomIndexC.value , endInd);
            }
        }
    }

    public static void medianOfThreeQuickSort(TestInteger[] testInteger, int startInd, int endInd, int k) {
        if (startInd >= endInd || startInd < 0) return;
        if (endInd - startInd + 1 <= k) {
            int p = partition(testInteger, startInd, endInd);
            medianOfThreeQuickSort(testInteger, startInd, p-1, k);
            medianOfThreeQuickSort(testInteger, p+1, endInd, k);
        }
        medianOfThree(testInteger, startInd, endInd);
        int p = partition(testInteger, startInd, endInd);
        medianOfThreeQuickSort(testInteger, startInd, p-1, k);
        medianOfThreeQuickSort(testInteger, p+1, endInd, k);
    }

    public static void quickSortInsertionSort(TestInteger[] testInteger, int startInd, int endInd, int h) {
        if (startInd >= endInd || startInd < 0) return;
        if (endInd - startInd + 1 <= h) {
            insertionSort(testInteger, startInd, endInd);
        } else {
            int p = partition(testInteger, startInd, endInd);
            quickSortInsertionSort(testInteger, startInd, p-1, h);
            quickSortInsertionSort(testInteger, p+1, endInd, h);
        }

    }

    public static void insertionSort(TestInteger[] testInteger, int startInd, int endInd) {
        for (int i = startInd + 1; i <= endInd; i++) {
            TestInteger key = testInteger[i];
            int j = i - 1;
            while (j >= startInd && testInteger[j].compareTo(key) > 0) {
                testInteger[j+1] = testInteger[j];
                j = j - 1;
            }
            testInteger[j+1] = key;
        }
    }

}
