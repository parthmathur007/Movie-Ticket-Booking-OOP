public class Movie {

    private String title;
    private String genre;
    private double ticketPrice;

    // Constructor 1
    public Movie(String title, String genre, double ticketPrice) {
        this.title = title;
        this.genre = genre;
        this.ticketPrice = ticketPrice;
    }

    // Constructor 2 - overloaded constructor
    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
        this.ticketPrice = 200.0;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void displayMovie() {
        System.out.println("Movie: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Ticket Price: ₹" + ticketPrice);
    }
}