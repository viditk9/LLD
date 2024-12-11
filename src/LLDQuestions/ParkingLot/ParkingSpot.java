package src.LLDQuestions.ParkingLot;

public class ParkingSpot {
    int id;
    Vehicle vehicle;

    ParkingSpot(int id) {
        this.id = id;
        vehicle = null;
    }
    public void parkVehicle(Vehicle v) {
        this.vehicle = v;
    }

    public void removeVehicle() {
        this.vehicle = null;
    }

    public boolean isEmpty() {
        return vehicle == null;
    }
}
