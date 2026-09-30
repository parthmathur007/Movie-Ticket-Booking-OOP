
    public class Movie {

    private String title;
    private String genre;
    private double ticketPrice;

    public Movie(String title, String genre, double ticketPrice) {
        this.title = title;
        this.genre = genre;
        this.ticketPrice = ticketPrice;
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

