public class Practice1 {

    // Java DSA practice - (Arrays) Indexing & Traversal
    // Indexing = accessing a specific element
    // ex: [0] or [3] - access only specific element
    // Out of index = error

    // Traversal = printing array as a whole
    // Forward traversal - original order of the array
    // Reverse traversal - flipping the array
    // Traversal uses loop

    // [Index] = 1D Array
    // [Row] [Column] = 2D Array
    // [Table] [Row] [Column] = 3D Array

    public static void OneDArray() { // Methods

        // 1D Array - index: []
        String[] fruits = {"Apple", "Orange", "Pear", "Strawberry"}; // Array containing elements

        System.out.println(fruits[0]); // This is Indexing
        System.out.println(); // New line

        for (int i = 0; i < fruits.length; i++) { // This is Forward Traversal
            System.out.print(fruits[i] + " "); // Access everything on the array
        }
        System.out.println(); // New line

        for (int i = fruits.length -1; i >= 0; i--) { // This is reverse Traversal
            System.out.print(fruits[i] + " "); // Elements output in reverse order
        }
        System.out.println(); // New line
    }

    public static void TwoDArray() {

        // 2D Array - [] []
        String[][] fruits = {
                {"Apple", "Orange", "Pear", "Strawberry"},
                {"Mango", "Kiwi", "Cherry", "Grapes", "Banana"}
        };
        System.out.println(fruits[1][3]); // 2D array indexing
        System.out.println(); // New line

        // 2D Traversal
        for (int i = 0; i < fruits.length; i++) { // Row traversal
            for (int j = 0; j < fruits[i].length; j++) { // Column traversal
                System.out.print(fruits[i][j] + " ");
            }
            System.out.println(); // New line
        }
        System.out.println(); // New line

        // 2D Reverse traversal
        for (int i = fruits.length - 1; i >= 0; i--) { // Row reverse traversal
            for (int j = fruits[i].length - 1; j >= 0; j--) { // Column 2D traversal
                System.out.print(fruits[i][j] + " ");
            }
            System.out.println(); // New line
        }
    }

    public static void ThreeDArray() {

        //3D Array - [][][]
        String[][][] Letters = {
                {
                    {"Aa", "Bb", "Cc", "Dd", "Ee"},
                    {"Ff", "Gg", "Hh", "Ii", "Jj",},
                    {"Kk", "Ll", "Mm", "Nn", "Oo"}},
                {
                    {"Pp", "Qq", "Rr", "Ss", "Tt"},
                    {"Uu", "Vv", "Ww", "Xx", "Yy"},
                    {"Zz"}
                }
            };
        System.out.println(Letters[1][0][3]);
        System.out.println(); // New line

        for (int i = 0; i < Letters.length; i++) { // Tables
            for (int j = 0; j < Letters[i].length; j++) { // Rows traversal
                for (int k = 0; k < Letters[i][j].length; k++) { // Column traversal
                    System.out.print(Letters[i][j][k] + " "); // Output: All elements & 2 table
                }
                System.out.println(); // New line
            }
            System.out.println(); // New line Split by tables for clear visualization
        }

        for (int i = Letters.length - 1; i >= 0; i--) { // Tables
            for (int j = Letters[i].length - 1; j >= 0; j--) { // Rows reverse traversal
                for (int k = Letters[i][j].length - 1; k >=0; k--) { // Column reverse traversal
                    System.out.print(Letters[i][j][k] + " "); // Output: All elements & 2 table
                }
                System.out.println(); // New line
            }
            System.out.println(); // New line Split by tables for clear visualization
        }

        }

    // Program entry point - java starts executing here
    public static void main(String[] args) {

        //Call methods print all outputs
        System.out.println("1D ARRAY OUTPUT");
        Practice1.OneDArray();

        System.out.println("\n2D ARRAY OUTPUT");
        Practice1.TwoDArray();

        System.out.println("\n3D ARRAY OUTPUT");
        Practice1.ThreeDArray();

    }
}
