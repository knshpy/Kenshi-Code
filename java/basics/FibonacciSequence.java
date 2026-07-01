public class FibonacciSequence {

    public static void fiboSequence() {
        int row = 1;
        long firstTerm = 0;
        long secondTerm = 1;
        int count;

        while (row <= 10) {
            count = 1;

            while (count <= row) {
                System.out.println(firstTerm + "\t");

                long lastTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = lastTerm;

                count++;
            }
            System.out.println();
            row++;
        }
    }
    public static void main(String[] args) {
        fiboSequence();
    }
}
