package DoubleDimensionArray;

public class DoubleDArray {
    int[][] arr = null;

    // Constructor for array
    public DoubleDArray(int numberOfRows, int numberOfColumns) {
        this.arr = new int[numberOfRows][numberOfColumns];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                arr[row][col] = 0;
            }
        }
    }

    // Inserting value in the Array
    public void insertValueInArray(int row, int col, int value) {
        try {
            if (arr[row][col] == 0) {
                arr[row][col] = value;
                System.out.println("Selected value has been successfully inserted");
            } else {
                System.out.println("This cell is already occupied, Please try another");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array, Please try again");
        }
    }

    // Accessing cell value from given array
    public void accessCell(int row, int col) {
        System.out.println("\nAccessing Row#" + row + ", Col#" + col);
        try {

            System.out.println("The cell value is: " + arr[row][col]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array, Please try again");
        }
    }

    // Traverse your 2D array
    public void traverseDoubleDArray() {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.print(arr[row][col] + "  ");
            }
            System.out.println();
        }
    }

    // Searching a single value from the Array
    public void searchValue(int value) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] == value) {
                    System.out.println("Value is found at row: " + row + " Col: " + col);
                    return;
                }
            }
        }
        System.out.println("Value is not found");
    }

    // Deleting a value from Array
    public void deleteValueFromArray(int row, int col) {
        try {
            System.out.println("Value successfully deleted: " + arr[row][col]);
            arr[row][col] = 0;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This index is not valid for array, Please try again");
        }
    }
}