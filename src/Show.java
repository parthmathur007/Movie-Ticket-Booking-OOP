public class Show {

    private int showId;
    private Movie movie;
    private String showTime;
    private Seat[] seats;

    public Show(int showId, Movie movie, String showTime, int numberOfSeats) {
        this.showId = showId;
        this.movie = movie;
        this.showTime = showTime;

        seats = new Seat[numberOfSeats];

        for (int i = 0; i < numberOfSeats; i++) {
            seats[i] = new Seat(i + 1);
        }
    }

    public int getShowId() {
        return showId;
    }

    public Movie getMovie() {
        return movie;
    }

    public String getShowTime() {
        return showTime;
    }

    public void displayShow() {
        System.out.println("Show ID: " + showId);
        System.out.println("Movie: " + movie.getTitle());
        System.out.println("Time: " + showTime);

        System.out.println("Seats:");
        for (Seat seat : seats) {
            seat.displaySeat();
        }
    }

    public Seat bookSeat(int seatNumber) throws SeatAlreadyBookedException {

    for (Seat seat : seats) {

        if (seat.getSeatNumber() == seatNumber) {

            if (seat.isBooked()) {
                throw new SeatAlreadyBookedException(
                        "Seat " + seatNumber + " is already booked!"
                );
            }

            seat.bookSeat();
            return seat;
        }
    }

    return null;
}
}