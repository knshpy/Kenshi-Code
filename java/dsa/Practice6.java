
import java.util.Arrays;

public class Practice6 {

    // Selection sort
    // Find the minimum element in the array
    // compare current element to the next element until the min is found
    // for the current pass

    public static void selectionSort() {
        int[] arr = {66, 55, 44, 88, 77, 22};
        int n = arr.length;

        System.out.print("\nUnsorted order: " + Arrays.toString(arr));

        // Passes
        for (int i = 0; i < n - 1; i++) {
            int min = i;

            // Get the minimum value
            for (int j = i + 1; j < n; j++) { // Scan array
                if (arr[j] < arr[min]) { // If smaller element found
                    min = j;
                }
            }

            // Swap the smallest and current unsorted element
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

            // Display
            System.out.print("\nSorted order: " + Arrays.toString(arr));

            }
        }
    }

    public static void main(String[] args) {
        Practice6.selectionSort();
    }


