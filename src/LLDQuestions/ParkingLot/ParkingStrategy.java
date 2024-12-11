package src.LLDQuestions.ParkingLot;

import java.util.List;

public interface ParkingStrategy {
    ParkingSpot find(List<ParkingSpot> spots);
}
