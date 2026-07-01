
import java.util.Arrays;

public class Practice4 {

    // Insertion sort
    // starts at index 1 by swapping index 0 and 1

    public static void insertionSort() {
        int[] arr = {5, 7, 1, 0, -2, 3}; // Array
        int n = arr.length; // Array length

        System.out.print("Unsorted order: " + Arrays.toString(arr)); // Display original order

        for (int i = 1; i < n; i++) {
            int temp = arr[i]; // temp store 1 int per loop
            int j = i - 1; // Starting point and current value for temp with elements on the left

            // Compare elemnts
            while (j >= 0 && arr[j] > temp) { // > ascending order / < descending order
                arr[j + 1] = arr[j]; // shift greater number
                j--; // move pointer to left element to compare
            }
            arr[j + 1] = temp; // insert temp
        }
        System.out.print("\nSorted order: " + Arrays.toString(arr)); // Display sorted order
    }

    public static void main(String[] args) {
            Practice4.insertionSort();
        }
    }

