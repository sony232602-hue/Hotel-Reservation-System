import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {

    @Test
    public void testRoomAvailability() {
        Hotel hotel = new Hotel();

        Room room = hotel.findRoom(101);

        assertNotNull(room);
        assertTrue(room.isAvailable());
    }

    @Test
    public void testRoomBooking() {
        Hotel hotel = new Hotel();

        Room room = hotel.findRoom(101);

        Customer customer =
            new Customer("Rahul", "9876543210");

        Reservation reservation =
            new Reservation(customer, room, 2);

        assertFalse(room.isAvailable());
    }

    @Test
    public void testBillCalculation() {
        Hotel hotel = new Hotel();

        Room room = hotel.findRoom(101);

        Customer customer =
            new Customer("Rahul", "9876543210");

        Reservation reservation =
            new Reservation(customer, room, 3);

        assertEquals(4500, reservation.getTotalAmount());
    }

    @Test
    public void testCancellation() {
        Hotel hotel = new Hotel();

        Room room = hotel.findRoom(101);

        Customer customer =
            new Customer("Rahul", "9876543210");

        Reservation reservation =
            new Reservation(customer, room, 2);

        reservation.cancelReservation();

        assertTrue(room.isAvailable());
    }
}