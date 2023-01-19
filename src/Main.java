import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login login = new Login();
        TicketBooking booking = new TicketBooking();

        while (true) {
            System.out.println("1. Sign up");
            System.out.println("2. Log in");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter username: ");
                String username = scanner.nextLine();
                System.out.print("Enter password: ");
                String password = scanner.nextLine();
                login.signup(username, password);
            } else if (choice == 2) {
                System.out.print("Enter username: ");
                String username = scanner.nextLine();
                System.out.print("Enter password: ");
                String password = scanner.nextLine();
                if (login.login(username, password)) {
                    while(true){
                        System.out.println("1. Book a ticket");
                        System.out.println("2. Search for a passenger");
                        System.out.println("3. Logout");
                        System.out.print("Enter choice: ");
                        int choice2 = scanner.nextInt();
                        scanner.nextLine();
                        if (choice2 == 1) {
                            booking.bookTicket();
                            booking.makePayment();
                        } else if (choice2 == 2) {
                            System.out.println("enter passenger name");
                            Passenger passenger = booking.searchPassenger(scanner.next());
                            if (passenger != null) {
                                System.out.println("Passenger found: " + passenger.getName() + " " + passenger.getAge() + " " + passenger.getPhoneNumber() + " " + passenger.getTicketNumber());
                            } else {
                                System.out.println("Passenger not found");
                            }
                        } else if (choice2 == 3) {
                            break;
                        } else {
                            System.out.println("Invalid choice!");
                        }
                    }
                }
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }
}

