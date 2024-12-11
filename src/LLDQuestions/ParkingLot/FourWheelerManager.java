package src.LLDQuestions.ParkingLot;

import java.util.List;

public class FourWheelerManager extends ParkingSpotManager{

    public static FourWheelerManager instance;
    FourWheelerManager() {
        super();
    }
    public static synchronized FourWheelerManager getInstance() {
        if(instance==null) instance =  new FourWheelerManager();
        return instance;
    }

    @Override
    ParkingSpot findParkingSpace() {
        return strategy.find(spots);
    }
}
