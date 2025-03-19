public class Room {
    private int roomNumber;
    private String roomType;
    private double price;
    private boolean isOccupied;
    private boolean isUnderMaintenance;

    public Room(int roomNumber, String roomType, double price) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
        this.isOccupied = false;
        this.isUnderMaintenance = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return !isOccupied && !isUnderMaintenance;
    }

    public void markOccupied() {
        this.isOccupied = true;
    }

    public void markAvailable() {
        this.isOccupied = false;
    }

    public void markUnderMaintenance() {
        this.isUnderMaintenance = true;
    }

    public void markOutOfMaintenance() {
        this.isUnderMaintenance = false;
    }
}