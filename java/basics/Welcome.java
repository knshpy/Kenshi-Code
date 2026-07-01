public class Welcome {

    // 1.
    public static void displayMessage() {
        System.out.println("\nWelcome to Java programming");
    }

    // 2.
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // 3.
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // 4.
    public static int findLargestNumber(int a, int b, int c) {
        if (a >= b && b >= c) {
            return a;
        } else if (b >= a && a >= c) {
            return b;
        } else
            return c;
    }

    // 5.
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }


    public static void main(String[] args) {

        displayMessage(); // 1.
        System.out.println(); // Space

        int sum = addNumbers(30, 37); // 2.
        System.out.println("Sum: " + sum);
        System.out.println(); // Space

        double area = calculateArea(6); // 3.
        System.out.println(calculateArea(sum));
        System.out.println(); // Space

        int largestNumber = findLargestNumber(4, 67, 1); // 4.
        System.out.println("Largest number: " + largestNumber);
        System.out.println(); // Space

        boolean isEven = isEven(8);
        if (isEven) {
            System.out.println("True");
        }
        else  {
            System.out.println("False");
        }

    }
}
