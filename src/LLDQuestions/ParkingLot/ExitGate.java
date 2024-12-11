package src.LLDQuestions.ParkingLot;

public class ExitGate {
    ParkingSpotFactory factory;
    ExitGate(ParkingSpotFactory factory) {
        this.factory = factory;
    }

    void removeVehicle(Ticket tkt) {
        ParkingSpotManager manager = factory.getParkingSpotManager(tkt.vehicle.type);
        manager.removeVehicle(tkt.vehicle);
        System.out.println("Removed vehicle with number - " + tkt.vehicle.number);
    }

}
