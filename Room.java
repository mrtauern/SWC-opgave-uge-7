public class Room {
    private int roomNumber;
    private int roomLevel;

    public Room(int roomNumber, int roomLevel) {
        this.roomNumber = roomNumber;
        this.roomLevel = roomLevel;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomLevel() {
        return roomLevel;
    }

    public void setRoomLevel(int roomLevel) {
        this.roomLevel = roomLevel;
    }
}
