public class ForLoop {

    // Count numbers from 1 to 10
    public static void countNumbers() {
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println(); // Space
    }
    // Print even numbers from 1 to 50
    public static void evenNumbers() {
        for (int i = 2; i <= 50; i +=2 ) {
            System.out.println("Even numbers: " + i);
        }
        System.out.println(); // Space
    }
    // Print odd number from 1 to 50
    public static void oddNumbers() {
        for (int i = 1; i <= 50; i +=2 ) {
            System.out.println("Odd numbers: " + i);
        }
        System.out.println(); // Space
    }
    // Sum number 1-100
    public static void sumNumbers() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("Sum 1-10: " + sum);
        }
        System.out.println(); // Space
    }
    // Multiplication table
    public static void multiplicationTable() {
        int num = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * num);
        }
        System.out.println(); // Space
    }
    // Main
    public static void main(String[] args) {
        countNumbers();
        evenNumbers();
        oddNumbers();
        sumNumbers();
        multiplicationTable();
    }
}
