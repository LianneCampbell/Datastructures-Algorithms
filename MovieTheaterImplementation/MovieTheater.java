package MovieTheaterImplementation;

import java.util.ArrayList;
import java.util.List;

public class MovieTheater {
    private final String theaterName;
    private List<Seat> seats = new ArrayList<>();

    // Initialize seating chart
    public MovieTheater(String theaterName, int numRows, int seatsPerRow) {
        this.theaterName = theaterName;
        char rowLetter = 'A'; // Start seat rows from 'A'
        for (int row = 0; row < numRows; row++) {
            for (int seat = 1; seat <= seatsPerRow; seat++) {
                String seatNumber = rowLetter + String.format("%02d", seat); // e.g., A01, A02
                seats.add(new Seat(seatNumber));
            }
            rowLetter++; // Move to next row letter
        }
    }

    // Get theater name
    public String getTheaterName() {
        return theaterName;
    }

    // Reserve a seat by seat number
    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = findSeat(seatNumber);
        if (requestedSeat == null) {
            System.out.println("\nSeat " + seatNumber + " does not exist.");
            return false;
        }
        if (requestedSeat.reserve()) {
            System.out.println("\nSeat " + seatNumber + " has been reserved.");
            return true;
        } else {
            System.out.println("\nSeat " + seatNumber + " is already reserved.");
            return false;
        }
    }

    // Cancel a seat reservation by seat number
    public boolean cancelSeat(String seatNumber) {
        Seat requestedSeat = findSeat(seatNumber);
        if (requestedSeat == null) {
            System.out.println("\nSeat " + seatNumber + " does not exist.");
            return false;
        }
        if (requestedSeat.cancel()) {
            System.out.println("\nReservation for seat " + seatNumber + " has been canceled.");
            return true;
        } else {
            System.out.println("\nSeat " + seatNumber + " is not reserved.");
            return false;
        }
    }

    // Retrieve the seating chart
    public void printSeatingChart() {
        char currentRow = 'A';
        System.out.println("\n---------------- Seating Chart: ------------------");
        for (Seat seat : seats) {
            if (seat.getSeatNumber().charAt(0) != currentRow) {
                currentRow = seat.getSeatNumber().charAt(0);
                System.out.println(); // Move to next line for the next row
            }
            System.out.print(seat.isReserved() ? "[X] " : "[O] "); // X for reserved, O for available
        }
        System.out.println();
    }

    // Find a seat by seat number
    private Seat findSeat(String seatNumber) {
        for (Seat seat : seats) {
            if (seat.getSeatNumber().equals(seatNumber)) {
                return seat;
            }
        }
        return null;
    }

    // Seat representations
    private class Seat {
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public boolean reserve() {
            if (!reserved) {
                reserved = true;
                return true;
            }
            return false;
        }

        public boolean cancel() {
            if (reserved) {
                reserved = false;
                return true;
            }
            return false;
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public boolean isReserved() {
            return reserved;
        }
    }
}