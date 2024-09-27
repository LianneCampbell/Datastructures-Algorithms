package MovieTheaterImplementation;

import java.util.Scanner;

public class MovieTheaterTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n---------------- Movie Theater -------------------");

        // Ask the user to input the theater details
        System.out.print("\nEnter theater name: ");
        String theaterName = scanner.nextLine();

        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        System.out.print("Enter the number of seats per row: ");
        int seatsPerRow = scanner.nextInt();

        // Create an instance of MovieTheater
        MovieTheater theater = new MovieTheater(theaterName, numRows, seatsPerRow);

        // Menu-driven interface for the user to perform operations
        while (true) {
            System.out.println("\n---------------- Seating Menu: -------------------");
            System.out.println("\n1. Reserve seat");
            System.out.println("2. Cancel seat");
            System.out.println("3. View seating chart");
            System.out.println("4. Exit");
            System.out.println("\n--------------------------------------------------");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Reserve seat
                    System.out.print("Enter seat number to reserve (e.g., A01): ");
                    String seatToReserve = scanner.nextLine();
                    theater.reserveSeat(seatToReserve);
                    break;

                case 2:
                    // Cancel seat
                    System.out.print("Enter seat number to cancel (e.g., A01): ");
                    String seatToCancel = scanner.nextLine();
                    theater.cancelSeat(seatToCancel);
                    break;

                case 3:
                    // View seating chart
                    theater.printSeatingChart();
                    break;

                case 4:
                    // Exit
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