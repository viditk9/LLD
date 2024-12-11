package src.LLDQuestions.ParkingLot;

import java.util.List;

abstract public class ParkingSpotManager {
    List<ParkingSpot> spots;
    ParkingStrategy strategy;
    ParkingSpotManager() {
        this.spots = null;
        this.strategy = null;
    }

    public void addSpots(List<ParkingSpot> spots) {
        this.spots = spots;
    }

    public void setStrategy(ParkingStrategy strategy) {
        this.strategy = strategy;
    }

    abstract ParkingSpot findParkingSpace();

    boolean parkVehicle(Vehicle v) {
        ParkingSpot spot = findParkingSpace();
        if(spot!=null)
        {
            spot.parkVehicle(v);
            return true;
        }
        else return false;
    }

    void removeVehicle(Vehicle v) {
        for(ParkingSpot spot : spots) {
            if(spot.vehicle == v)
            {
                spot.removeVehicle();
                break;
            }
        }
    }
}
