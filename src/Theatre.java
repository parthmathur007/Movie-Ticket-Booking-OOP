public class Theatre {

    private String theatreName;
    private String location;
    private Show[] shows;

    public Theatre(String theatreName, String location, int numberOfShows) {
        this.theatreName = theatreName;
        this.location = location;
        this.shows = new Show[numberOfShows];
    }

    public void addShow(Show show, int index) {
        if (index >= 0 && index < shows.length) {
            shows[index] = show;
        }
    }

    public void displayShows() {
        System.out.println("Theatre: " + theatreName);
        System.out.println("Location: " + location);

        System.out.println("\nAvailable Shows:");

        for (Show show : shows) {
            if (show != null) {
                System.out.println(
                    "Show " + show.getShowId() +
                    " - " + show.getMovie().getTitle() +
                    " - " + show.getShowTime()
                );
            }
        }
    }
}