import java.util.*;

public class Hotel {
    private List<Room> rooms;
    private List<Booking> bookings;

    public Hotel() {
        this.rooms = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }

    public void addRoom(int roomNumber, String roomType, double price) {
        rooms.add(new Room(roomNumber, roomType, price));
    }

    public List<Room> getAvailableRooms() {
        List<Room> availableRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (room.isAvailable()) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    public Booking bookRoom(String name, String phone, String email, String roomType, int nights, boolean festivePeriod) {
        for (Room room : rooms) {
            if (room.isAvailable() && room.getRoomType().equalsIgnoreCase(roomType)) {
                Guest guest = new Guest(name, phone, email);
                Booking booking = new Booking(guest, room, nights, festivePeriod);
                bookings.add(booking);
                sendNotification(guest.getEmail(), "Booking Successful! Reference: " + booking.getBookingReference());
                return booking;
            }
        }
        return null;
    }

    public boolean cancelBooking(String bookingReference) {
        for (Booking booking : bookings) {
            if (booking.getBookingReference().equals(bookingReference)) {
                booking.cancelBooking();
                bookings.remove(booking);
                return true;
            }
        }
        return false;
    }

    public boolean markRoomForMaintenance(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                room.markUnderMaintenance();
                return true;
            }
        }
        return false;
    }

    public boolean removeRoomFromMaintenance(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                room.markOutOfMaintenance();
                return true;
            }
        }
        return false;
    }

    public void sendNotification(String email, String message) {
        System.out.println("Notification sent to " + email + ": " + message);
    }

    public Map<String, Object> generateReports() {
        int totalBookings = bookings.size();
        double totalRevenue = bookings.stream().mapToDouble(b -> b.getRoom().getPrice() * b.getNights()).sum();  // Use getNights()
        double occupancyRate = (double) totalBookings / rooms.size() * 100;

        Map<String, Object> report = new HashMap<>();
        report.put("Total Bookings", totalBookings);
        report.put("Total Revenue", totalRevenue);
        report.put("Occupancy Rate", String.format("%.2f%%", occupancyRate));
        return report;
    }
}