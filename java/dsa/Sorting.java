import java.util.Scanner;
import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long start = System.nanoTime();

        // Ask user input for size
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        // Ask user for elements
        int[] array = new int[size];

        // elements logic + 1 depend on array length
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            array[i] = input.nextInt();
        }
        System.out.println("\nUnsorted order:" + Arrays.toString(array));

        int choice;

        do {
            System.out.println("\nChoose an option: ");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Insertion Sort");
            System.out.println("3. Selection Sort");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    bubbleSort(Arrays.copyOf(array, size));
                    break;
                case 2:
                    insertionSort(Arrays.copyOf(array, size));
                    break;
                case 3:
                    selectionSort(Arrays.copyOf(array, size));
                    break;
                case 4:
                    long end = System.nanoTime();
                    System.out.println("Total time:" + (end - start) + "ns");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);

        input.close();
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print("\nPass:" + (i + 1) + "  ");
            for(int j = 0; j < array.length - 1 - i; j++) {

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            System.out.print(Arrays.toString(array));
        }
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
            System.out.println("Pass: " + i + Arrays.toString(array));
        }
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;

            System.out.println("Pass: " + (i + 1) + Arrays.toString(array));
        }
    }
}