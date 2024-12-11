package src.LLDQuestions.ParkingLot;

import src.designPatterns.FactoryPattern.Circle;
import src.designPatterns.FactoryPattern.Shape;
import src.designPatterns.FactoryPattern.Square;

import java.util.List;

public class ParkingSpotFactory {
    public ParkingSpotManager getParkingSpotManager(VehicleType type) {
        switch (type) {
            case TwoWheeler :
                return TwoWheelerManager.getInstance();
            case FourWheeler :
                return FourWheelerManager.getInstance();
            default:
                return null;
        }
    }
}
