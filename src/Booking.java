import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Booking {

    private int bookingId;
    private Customer customer;
    private Show show;
    private Seat seat;

    public Booking(int bookingId, Customer customer, Show show, Seat seat) {
        this.bookingId = bookingId;
        this.customer = customer;
        this.show = show;
        this.seat = seat;
    }

    public void displayBooking() {

        System.out.println("===== BOOKING DETAILS =====");
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Movie: " + show.getMovie().getTitle());
        System.out.println("Show Time: " + show.getShowTime());
        System.out.println("Seat Number: " + seat.getSeatNumber());
        System.out.println("Ticket Price: ₹" + show.getMovie().getTicketPrice());
    }

    public void saveToFile() {

        try {

            FileWriter writer = new FileWriter("bookings.txt", true);

            writer.write("===== BOOKING =====\n");
            writer.write("Booking ID: " + bookingId + "\n");
            writer.write("Customer: " + customer.getName() + "\n");
            writer.write("Email: " + customer.getEmail() + "\n");
            writer.write("Movie: " + show.getMovie().getTitle() + "\n");
            writer.write("Show Time: " + show.getShowTime() + "\n");
            writer.write("Seat Number: " + seat.getSeatNumber() + "\n");
            writer.write("Ticket Price: ₹" + show.getMovie().getTicketPrice() + "\n");
            writer.write("-------------------------\n");

            writer.close();

            System.out.println("Booking saved successfully!");

        } catch (IOException e) {

            System.out.println("Error saving booking: " + e.getMessage());
        }
    }

    public static void viewBookings() {

        File file = new File("bookings.txt");

        if (!file.exists()) {
            System.out.println("No previous bookings found.");
            return;
        }

        System.out.println("\n===== PREVIOUS BOOKINGS =====");

        try {

            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();

        } catch (IOException e) {

            System.out.println(
                    "Error reading bookings: " + e.getMessage()
            );
        }
    }
}