import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Hotel hotel = new Hotel();
        Reservation reservation = null;

        while (true) {

            System.out.println("\n===== HOTEL RESERVATION SYSTEM =====");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. View Reservation");
            System.out.println("4. Cancel Reservation");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    hotel.displayAvailableRooms();
                    break;

                case 2:
                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Phone Number: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter Room Number: ");
                    int roomNumber = sc.nextInt();

                    System.out.print("Enter Number of Days: ");
                    int days = sc.nextInt();

                    Room room = hotel.findRoom(roomNumber);

                    if (room == null) {
                        System.out.println("Room not found!");
                    } else if (!room.isAvailable()) {
                        System.out.println("Room is already booked!");
                    } else {
                        Customer customer =
                            new Customer(name, phone);

                        reservation =
                            new Reservation(customer, room, days);

                        System.out.println(
                            "Room booked successfully!"
                        );
                    }
                    break;

                case 3:
                    if (reservation != null) {
                        reservation.displayReservation();
                    } else {
                        System.out.println("No reservation found.");
                    }
                    break;

                case 4:
                    if (reservation != null) {
                        reservation.cancelReservation();
                        reservation = null;
                    } else {
                        System.out.println("No reservation to cancel.");
                    }
                    break;

                case 5:
                    System.out.println(
                        "Thank you for using Hotel Reservation System!"
                    );
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}