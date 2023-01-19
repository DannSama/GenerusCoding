import java.util.Scanner;
import java.util.LinkedList;

class TicketBooking {
    private LinkedList<Passenger> passengers;
    private BinarySearchTree bst;
    Scanner scanner = new Scanner(System.in);

    public TicketBooking() {
        passengers = new LinkedList<Passenger>();
        bst = new BinarySearchTree();
    }
    Passenger passenger = new Passenger();

    public void bookTicket() {

        System.out.print("Enter passenger name: ");
        String name = scanner.nextLine();
        System.out.print("Enter passenger age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter passenger phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter ticket number: ");
        String ticketNumber = scanner.nextLine();
        Passenger passenger = new Passenger(name, age, phoneNumber, ticketNumber);
        passengers.add(passenger);
        bst.insert(passenger);
        //System.out.println("Ticket booked successfully!");
    }

    public Passenger searchPassenger(String name) {
        return bst.search(name);
    }

    public LinkedList<Passenger> getPassengers() {
        return passengers;
    }
    public void makePayment() {
        System.out.print("enter credit card/debit number : ");
        int cardNum = scanner.nextInt();
        System.out.print("enter pin : ");
        int pin = scanner.nextInt();;
        System.out.println("Payment success!");
    }
}
