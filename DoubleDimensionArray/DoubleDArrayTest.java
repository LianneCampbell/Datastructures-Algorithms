package DoubleDimensionArray;

import java.util.Scanner;

public class DoubleDArrayTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("\n------- Double Dimensional Array Simulator -------");
        System.out.println("");

        // Ask the user to input the number of rows and columns for the array
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Create an instance of the DoubleDArray
        DoubleDArray array = new DoubleDArray(rows, cols);

        // Menu-driven interface for user to perform operations
        while (true) {
            System.out.println("\n----------------- Menu Selection -----------------");
            System.out.println("");
            System.out.println("1. Insert value");
            System.out.println("2. Traverse array");
            System.out.println("3. Search value");
            System.out.println("4. Access cell value");
            System.out.println("5. Delete value");
            System.out.println("6. Exit");
            System.out.println("\n--------------------------------------------------");

            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Insert value
                    System.out.println("\n------------------ Insert Value ------------------");
                    System.out.print("\nEnter row index: ");
                    int row = scanner.nextInt();
                    System.out.print("Enter column index: ");
                    int col = scanner.nextInt();
                    System.out.print("Enter value to insert: ");
                    int value = scanner.nextInt();
                    array.insertValueInArray(row, col, value);
                    break;

                case 2:
                    // Traverse array
                    System.out.println("\n----------------- Array Traversal ----------------");
                    System.out.println("");
                    array.traverseDoubleDArray();
                    break;

                case 3:
                    // Search value
                    System.out.println("\n--------------- Array Search Value ---------------");
                    System.out.print("\nEnter value to search for: ");
                    int searchValue = scanner.nextInt();
                    System.out.println("\n--------------------------------------------------");
                    array.searchValue(searchValue);
                    break;

                case 4:
                    // Access cell value
                    System.out.println("\n---------------- Access Cell Value ---------------");
                    System.out.print("\nEnter row index: ");
                    int accessRow = scanner.nextInt();
                    System.out.print("Enter column index: ");
                    int accessCol = scanner.nextInt();
                    System.out.println("\n--------------------------------------------------");
                    array.accessCell(accessRow, accessCol);
                    break;

                case 5:
                    // Delete value
                    System.out.println("\n----------------- Delete A Value -----------------");
                    System.out.print("\nEnter row index: ");
                    int deleteRow = scanner.nextInt();
                    System.out.print("Enter column index: ");
                    int deleteCol = scanner.nextInt();
                    System.out.println("\n--------------------------------------------------");
                    System.out.println("");
                    array.deleteValueFromArray(deleteRow, deleteCol);
                    break;

                case 6:
                    // Exit
                    System.out.println("\n--------------------------------------------------");
                    System.out.println("");
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
    }
}