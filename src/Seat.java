public class Seat {

    private int seatNumber;
    private boolean booked;

    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
        this.booked = false;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public boolean isBooked() {
        return booked;
    }

    public void bookSeat() {
        booked = true;
    }

    public void displaySeat() {
        if (booked) {
            System.out.println("Seat " + seatNumber + " - BOOKED");
        } else {
            System.out.println("Seat " + seatNumber + " - AVAILABLE");
        }
    }
}