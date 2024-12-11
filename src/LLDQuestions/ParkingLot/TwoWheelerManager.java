package src.LLDQuestions.ParkingLot;

import java.util.List;

public class TwoWheelerManager extends ParkingSpotManager{

    public static TwoWheelerManager instance;
    private TwoWheelerManager() {
        super();
    }

    public static synchronized TwoWheelerManager getInstance() {
        if(instance == null) instance =  new TwoWheelerManager();
        return instance;
    }
    @Override
    ParkingSpot findParkingSpace() {
        return strategy.find(spots);
    }
}
