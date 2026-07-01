public class Practice5 {

    // Merge sort
    // Split array in 2 and re combine them

    // Backend logic merge sorting
    // Dividing arrays
    public static void mergeSort(int[] array) {
        int length = array.length;
        if (length <= 1) return;

        // Dividing array in 2 which is right and left array
        int middle = length / 2; // Split array into 2
        int leftArray[] = new int[middle]; // Get the left side element in array
        int rightArray[] = new int[length - middle]; // Get the right side element in array

        int i = 0; // Left array
        int j = 0; // Right array

        // The 2 divided array
        for(; i < length; i++) {
            if(i < middle) {
                leftArray[i] = array[i]; // Get split elements for left side array
            } else {
                rightArray[j] = array[i]; // Get split elements for right side array
                j++; // increment right side array
            }
        }

        // Call method
        // Divide array until 1 element left
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

        public static void merge(int[] leftArray, int[] rightArray, int[] array) {
            int leftSize = array.length /2;
            int rightSize = array.length - leftSize;

            // i = main index, l = left index, r = right index
            int i = 0, l = 0, r = 0;

            // Merging loop logic
            while (l < leftSize && r < rightSize) {
                if (leftArray[l] < rightArray[r]) {
                    array[i] = leftArray[l];
                    i++;
                    l++;
                } else {
                    array[i] = rightArray[r];
                    i++;
                    r++;
                }
            }

            // Copy remaining element for L
            while (l < leftSize) {
                array[i] = leftArray[l];
                i++;
                l++;
            }

            // Copy remaining element for R
            while (r < rightSize) {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

    // Frontend logic display output before and after merge sort
    public static void main(String[] args) {

        // Array unsorted set A,B, and C
        int[] A = {59, 23, 76, 12, 9, 44, 37, 62}; // Set A
        int[] B = {48, 15, 73, 26, 91, 34, 62, 7}; // Set B
        int[] C = {84, 12, 97, 33, 58, 21, 76, 45}; // Set C

        // Not sorted Array length
        int n1 = A.length;
        int n2 = B.length;
        int n3 = C.length;

        // Unsorted Order / Original order
        System.out.println("\nUnsorted order ===============");

        // Merge loop set A (Unsorted)
        System.out.print("SET A: ");
        for (int i = 0; i < n1; i++) {
            System.out.print(A[i] + " "); // Display set A
        }
        System.out.println(); // New line

        // Merge loop set B (Unsorted)
        System.out.print("SET B: ");
        for (int i = 0; i < n2; i++) {
            System.out.print(B[i] + " "); // Display set B
        }
        System.out.println(); // New line

        // Merge loop set C (Unsorted)
        System.out.print("SET C: ");
        for (int i = 0; i < n3; i++) {
            System.out.print(C[i] + " "); // Display set C
        }
        System.out.println("\n==============================");

            // Sorted array
            mergeSort(A);
            mergeSort(B);
            mergeSort(C);

        // Sorted order output
        System.out.println("\nSorted order =================");

        // Merge loop set A (Sorted)
        System.out.print("SET A: ");
        for (int i = 0; i < n1; i++) {
            System.out.print(A[i] + " "); // Display set A
        }
        System.out.println(); // New line

        // Merge loop set B (Sorted)
        System.out.print("SET B: ");
        for (int i = 0; i < n2; i++) {
            System.out.print(B[i] + " "); // Display set B
        }
        System.out.println(); // New line

        // Merge loop set C (Sorted)
        System.out.print("SET C: ");
        for (int i = 0; i < n3; i++) {
            System.out.print(C[i] + " "); // Display set C
        }
        System.out.println("\n==============================");
    }
}
