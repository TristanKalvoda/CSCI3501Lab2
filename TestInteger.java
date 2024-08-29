public class TestInteger implements Comparable<TestInteger> {
    int value;
    static long counter;
    @Override
    public int compareTo(TestInteger other) {
        if (this.value == other.value) {
            counter++;
            return 0;
        } else if (this.value > other.value) {
            counter++;
            return 1;
        } else {
            counter++;
            return -1;
        }
    }

    public static long getCounter(){
        return counter;
    }

    public static void resetCounter(){
        counter = 0;
    }
    
}
