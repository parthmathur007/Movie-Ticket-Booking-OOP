import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // =========================
        // CREATE MOVIES
        // =========================

        Movie movie1 = new Movie(
                "Avengers: Endgame",
                "Action",
                250.0
        );

        Movie movie2 = new Movie(
                "Interstellar",
                "Sci-Fi"
        );

        // =========================
        // CREATE SHOWS
        // =========================

        Show show1 = new Show(
                101,
                movie1,
                "7:00 PM",
                5
        );

        Show show2 = new Show(
                102,
                movie2,
                "9:30 PM",
                5
        );

        // =========================
        // CREATE THEATRE
        // =========================

        Theatre theatre = new Theatre(
                "MUJ Cinemas",
                "Jaipur",
                2
        );

        theatre.addShow(show1, 0);
        theatre.addShow(show2, 1);

        // =========================
        // CUSTOMER DETAILS
        // =========================

        System.out.println("===== WELCOME TO MOVIE TICKET BOOKING =====");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        Customer customer = new Customer(
                name,
                email,
                101
        );

        int bookingId = 1001;
        int choice;

        // =========================
        // MAIN MENU
        // =========================

        do {

            System.out.println("\n================================");
            System.out.println("   MOVIE TICKET BOOKING SYSTEM");
            System.out.println("================================");
            System.out.println("1. View Movies");
            System.out.println("2. View Shows");
            System.out.println("3. View Seats");
            System.out.println("4. Book Ticket");
            System.out.println("5. View Previous Bookings");
            System.out.println("6. Exit");
            System.out.println("================================");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                // =========================
                // VIEW MOVIES
                // =========================

                case 1:

                    System.out.println("\n===== MOVIE 1 =====");
                    movie1.displayMovie();

                    System.out.println("\n===== MOVIE 2 =====");
                    movie2.displayMovie();

                    break;

                // =========================
                // VIEW SHOWS
                // =========================

                case 2:

                    System.out.println("\n===== AVAILABLE SHOWS =====");
                    theatre.displayShows();

                    break;

                // =========================
                // VIEW SEATS
                // =========================

                case 3:

                    System.out.println("\n===== SELECT SHOW =====");
                    System.out.println("1. Avengers: Endgame - 7:00 PM");
                    System.out.println("2. Interstellar - 9:30 PM");

                    System.out.print("Enter show choice: ");
                    int seatShowChoice = scanner.nextInt();

                    if (seatShowChoice == 1) {

                        System.out.println("\n===== SEAT STATUS =====");
                        show1.displayShow();

                    } else if (seatShowChoice == 2) {

                        System.out.println("\n===== SEAT STATUS =====");
                        show2.displayShow();

                    } else {

                        System.out.println("Invalid show choice!");
                    }

                    break;

                // =========================
                // BOOK TICKET
                // =========================

                case 4:

                    System.out.println("\n===== SELECT SHOW =====");
                    System.out.println("1. Avengers: Endgame - 7:00 PM");
                    System.out.println("2. Interstellar - 9:30 PM");

                    System.out.print("Enter show choice: ");
                    int showChoice = scanner.nextInt();

                    Show selectedShow = null;

                    if (showChoice == 1) {

                        selectedShow = show1;

                    } else if (showChoice == 2) {

                        selectedShow = show2;

                    } else {

                        System.out.println("Invalid show choice!");
                        break;
                    }

                    System.out.print("Enter seat number: ");
                    int seatNumber = scanner.nextInt();

                    try {

                        Seat bookedSeat = selectedShow.bookSeat(seatNumber);

                        if (bookedSeat != null) {

                            Booking booking = new Booking(
                                    bookingId,
                                    customer,
                                    selectedShow,
                                    bookedSeat
                            );

                            System.out.println();

                            booking.displayBooking();

                            booking.saveToFile();

                            bookingId++;

                        } else {

                            System.out.println(
                                    "Invalid seat number!"
                            );
                        }

                    } catch (SeatAlreadyBookedException e) {

                        System.out.println(
                                "Booking Error: " + e.getMessage()
                        );
                    }

                    break;

                // =========================
                // VIEW PREVIOUS BOOKINGS
                // =========================

                case 5:

                    Booking.viewBookings();

                    break;

                // =========================
                // EXIT
                // =========================

                case 6:

                    System.out.println(
                            "\nThank you for using Movie Ticket Booking System!"
                    );

                    break;

                default:

                    System.out.println(
                            "Invalid choice! Please try again."
                    );
            }

        } while (choice != 6);

        scanner.close();
    }
}