import java.util.*;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        // Adding Rooms
        hotel.addRoom(101, "Single", 10000);
        hotel.addRoom(102, "Double", 15000);
        hotel.addRoom(103, "Suite", 25000);

        // Booking a Room
        Booking booking = hotel.bookRoom("John Doe", "08123456789", "john.doe@example.com", "Single", 3, true);
        if (booking != null) {
            System.out.println("Booking Successful!");
            System.out.println(booking.getDetails());
        } else {
            System.out.println("No available rooms for the selected type.");
        }

        // Viewing Available Rooms
        System.out.println("\nAvailable Rooms:");
        for (Room room : hotel.getAvailableRooms()) {
            System.out.println("Room " + room.getRoomNumber() + " - " + room.getRoomType() + " - ₦" + room.getPrice());
        }

        // Marking Room for Maintenance
        hotel.markRoomForMaintenance(102);
        System.out.println("\nRoom 102 marked for maintenance.");

        // Removing Room from Maintenance
        hotel.removeRoomFromMaintenance(102);
        System.out.println("\nRoom 102 is now available.");

        // Generating Reports
        System.out.println("\nHotel Reports:");
        Map<String, Object> reports = hotel.generateReports();
        for (Map.Entry<String, Object> entry : reports.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}