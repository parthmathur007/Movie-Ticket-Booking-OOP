import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Movie movie1 = new Movie(
                "Avengers: Endgame",
                "Action",
                250.0
        );

        Show show1 = new Show(
                101,
                movie1,
                "7:00 PM",
                5
        );

        Theatre theatre = new Theatre(
                "MUJ Cinemas",
                "Jaipur",
                1
        );

        theatre.addShow(show1, 0);

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

        do {

            System.out.println("\n================================");
            System.out.println("   MOVIE TICKET BOOKING SYSTEM");
            System.out.println("================================");
            System.out.println("1. View Movie");
            System.out.println("2. View Shows");
            System.out.println("3. View Seats");
            System.out.println("4. Book Ticket");
            System.out.println("5. View Previous Bookings");
            System.out.println("6. Exit");
            System.out.println("================================");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("\n===== MOVIE DETAILS =====");
                    movie1.displayMovie();

                    break;

                case 2:

                    System.out.println("\n===== AVAILABLE SHOWS =====");
                    theatre.displayShows();

                    break;

                case 3:

                    System.out.println("\n===== SEAT STATUS =====");
                    show1.displayShow();

                    break;

                case 4:

                    System.out.print("\nEnter seat number: ");
                    int seatNumber = scanner.nextInt();

                    try {

                        Seat bookedSeat = show1.bookSeat(seatNumber);

                        if (bookedSeat != null) {

                            Booking booking = new Booking(
                                    bookingId,
                                    customer,
                                    show1,
                                    bookedSeat
                            );

                            System.out.println();
                            booking.displayBooking();

                            booking.saveToFile();

                            bookingId++;

                        } else {

                            System.out.println("Invalid seat number!");
                        }

                    } catch (SeatAlreadyBookedException e) {

                        System.out.println(
                                "Booking Error: " + e.getMessage()
                        );
                    }

                    break;

                case 5:

                    Booking.viewBookings();

                    break;

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