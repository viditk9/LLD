package src.LLDQuestions.ParkingLot;

import java.util.List;

public class EntranceGate {
    ParkingSpotFactory factory;
    EntranceGate(ParkingSpotFactory factory) {
        this.factory = factory;
    }

    private ParkingSpot findParkingSpot(VehicleType type)
    {
        ParkingSpotManager manager = factory.getParkingSpotManager(type);
        ParkingSpot spot = manager.findParkingSpace();
        return spot;
    }

    Ticket generateTicket(Vehicle vehicle) {
        ParkingSpot spot = findParkingSpot(vehicle.type);
        if(spot != null) return new Ticket(vehicle, spot);
        else return null;
    }
}
