public class Practice3 {

    // Bubble sort
    // Search algorithm that compare values to organize in order way
    // Repeatedly compare elements until its on its right position/order
    // Good for small dataset
    //Bad for large dataset

    public static void bubbleSort() {
        int[] arr = {3, 1, 2, 5, 4, 7, 10, 8, 9, 6}; // Array
        int n = arr.length; // Array length

        System.out.println("Original order:"); // Original set
        for (int i = 0; i < n; i++) { // Array loop for original set
            System.out.print(arr[i] + " "); // Output
        }

        int passes = 0; // Counter for each pass

        for (int i = 0; i < n - 1; i++) { // Outer loop; count passes
            passes++; // Count each passes
            for (int j = 0; j < n - i - 1; j++) { // Comparison of each elements

                // If element is greater swap them
                if (arr[j] > arr[j + 1]) { // > for ascending order, < for descending order
                    // Swapping elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("\nPass: " + passes); // visualization for Pass or how many pass
        }
        System.out.println("\nOrganized order:"); // Bubble sort visualization
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Practice3.bubbleSort();
    }
}
