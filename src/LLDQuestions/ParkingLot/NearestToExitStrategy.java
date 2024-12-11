package src.LLDQuestions.ParkingLot;

import java.util.List;

public class NearestToExitStrategy implements ParkingStrategy{
    @Override
    public ParkingSpot find(List<ParkingSpot> spots) {
        ParkingSpot spot = null;
        int diff = Integer.MAX_VALUE;
        for(ParkingSpot CurrSpot : spots) {
            if(CurrSpot.isEmpty() && Math.abs(CurrSpot.id-21) < diff) {
                spot = CurrSpot;
                diff = Math.abs(CurrSpot.id-0);
            }
        }
        return spot;
    }
}
