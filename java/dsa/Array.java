public class Array {
    /*
    Data structure visualization and structure of Arrays from previous lecture 1D, 2D, and 3D.
    1D = {}
    2D = {{}}
    3D = {{{}}}

    [0] [0]

    [Row] [Column]

    [Table] [Row] [Column]

    Temporary bubble sort example
        class Main {
    public static void main(String[] args) {
        
        int [] arr ={12, 7, 21, 43, 5, 3};
        
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length -1 - i; j++) {
                
                if (arr[j] > arr[j + 1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                System.out.println(arr[i] + " ");
                
            }
        }
    }
}
    
*/
    public static void setArray1D () {

        // 1d Array
        int[] arr = new int[5];

        int[] array1dElements = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array1dElements));
        System.out.println(); // Space
    }

    public static void setArray2D () {
        //2d Array
        int[][] array2D = new int[5][4];

        int[][] array2dElements = {{2, 4, 6}, {1, 3, 5}};
        System.out.println(Arrays.deepToString(array2dElements));
        System.out.println(); // Space
    }

    public static void setArray3D () {
        //3d Array
        int[][][] array3D = new int[5][4][4];

        int[][][] array3dElements = {
                {
                        {1, 1, 1, 1},
                        {2, 2, 2, 2},
                        {3, 3, 3, 3},
                        {4, 4, 4, 4},
                        {5, 5, 5, 5}}
        };
        System.out.println(Arrays.deepToString(array3dElements));
    }
}

    public static void main(String[] args) {
        Array.setArray1D();
        Array.setArray2D();
        Array.setArray3D();
    }
