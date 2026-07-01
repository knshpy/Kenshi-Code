public class WhileLoop {

    // Number counting
    public static void countNumbers() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        System.out.println(); //Space
    }

    // Count down
    public static void countDown() {
        int i = 10;
        while (i >= 1) {
            System.out.println(i + "!");
            i--;
        }
        System.out.println("Happy New Year!");
        System.out.println(); //Space
    }

    // ABC
    public static void Alphabet() {
        char letter = 'A';
        while (letter <= 'Z') {
            System.out.print(letter);
            letter++;
        }
        System.out.println(); //Space
    }

    // Stars
    public static void starsRow() {
        int row = 1;

        while (row <= 5) {

            int star = 1;

            while (star <= row) {
                System.out.print("*");
                star++;
            }
            System.out.println();
            row++;
        }
        System.out.println(); //Space
    }

    // Binary in rows
    public static void binaryRow() {
        int row = 1;

        while (row <= 20) { // Outer loop control rows

            int num = 1;

            while (num <= row) { // Inner loop
                System.out.print("10");
                num++;
            }
            System.out.println();
            row++;
        }
        System.out.println(); //Space
    }

    // Increment
    public static void incrementRow() {
        int row = 1;

        while (row <= 20) { // Outer loop

            int num = 1;

            while (num <= row) { // Inner loop
                System.out.print(num);
                num++;
            }
            System.out.println();
            row++;
        }
        System.out.println(); //Space
    }

    // Tree
    public static void simpleTree() {
        int row = 1;

        while (row <= 5) { // Rows loop

            int space = 1;

            while (space <=5 - row) {
                System.out.print(" ");
                space++;
            }

            int star = 1;

            while (star <= (2 * row - 1)) {
                System.out.print("*");
                star++;
            }

            System.out.println();
            row++;
        }
        System.out.println("    |"); // Trunk
        System.out.println(); // Space
    }

    // Tree double tree
    public static void doubleTree() {
        // First tree
        // Top layer
        int row = 1;

        while (row <= 4) { // Rows loop

            int space = 1;

            while (space <=5 - row) {
                System.out.print(" ");
                space++;
            }

            int star = 1;

            while (star <= (2 * row - 1)) {
                System.out.print("*");
                star++;
            }

            System.out.println();
            row++;
        }

        // Second tree
        // Bottom layer
        int row1 = 2;

            while (row1 <= 5) { // Rows loop

            int space = 1;

            while (space <=5 - row1) {
                System.out.print(" ");
                space++;
            }

            int star = 1;

            while (star <= (2 * row1 - 1)) {
                System.out.print("*");
                star++;
            }

            System.out.println();
            row1++;
        }
            System.out.println("    |"); // Trunk
            System.out.println("    |"); // Trunk
}

// Main
    public static void main(String[] args) {
        countNumbers();
        countDown();
        Alphabet();
        starsRow();
        binaryRow();
        incrementRow();
        simpleTree();
        doubleTree();
    }
}
