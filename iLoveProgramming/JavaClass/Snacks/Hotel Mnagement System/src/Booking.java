import java.util.Date;
import java.util.Random;

public class Booking {
    private String bookingReference;
    private Guest guest;
    private Room room;
    private Date checkInDate;
    private Date checkOutDate;
    private int nights;
    private double totalPayment;

    public Booking(Guest guest, Room room, int nights, boolean festivePeriod) {
        this.bookingReference = "RES" + new Random().nextInt(9999);
        this.guest = guest;
        this.room = room;
        this.nights = nights;
        this.checkInDate = new Date();
        this.checkOutDate = new Date(checkInDate.getTime() + (nights * 86400000L)); // Add days in milliseconds
        this.totalPayment = calculatePayment(room.getPrice(), nights, festivePeriod);
        room.markOccupied();
    }

    private double calculatePayment(double pricePerNight, int nights, boolean festivePeriod) {
        double basePrice = pricePerNight * nights;
        if (festivePeriod) {
            basePrice += basePrice * 0.2; // 20% festive surcharge
        }
        return basePrice;
    }

    public String getBookingReference() {
        return bookingReference;
    }

    public Room getRoom() {
        return room;
    }

    public int getNights() {
        return nights;  // Getter for nights
    }

    public String getDetails() {
        return "Booking Reference: " + bookingReference + "\n" +
                guest.getDetails() + "\n" +
                "Room Number: " + room.getRoomNumber() + ", Room Type: " + room.getRoomType() + "\n" +
                "Check-in Date: " + checkInDate + ", Check-out Date: " + checkOutDate + "\n" +
                "Total Payment: ₦" + totalPayment;
    }

    public void cancelBooking() {
        room.markAvailable();
    }

    public String getGuestEmail() {
        return guest.getEmail();
    }
}