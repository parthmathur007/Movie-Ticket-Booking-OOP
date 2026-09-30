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
}