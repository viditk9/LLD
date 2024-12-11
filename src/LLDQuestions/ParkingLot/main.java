package src.LLDQuestions.ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<ParkingSpot> twoWheelerSpots = new ArrayList<>(), fourWheelerSpots = new ArrayList<>();
        for(int i=1;i<=10;i++)
        {
            twoWheelerSpots.add(new ParkingSpot(i));
        }
        for(int i=11;i<=20;i++)
        {
            fourWheelerSpots.add(new ParkingSpot(i));
        }
        ParkingStrategy strategy1 = new NearestToEntryParkingStrategy();
        TwoWheelerManager instance1 = TwoWheelerManager.getInstance();
        instance1.addSpots(twoWheelerSpots);
        instance1.setStrategy(strategy1);

        ParkingStrategy strategy2 = new NearestToExitStrategy();
        FourWheelerManager instance2 = FourWheelerManager.getInstance();
        instance2.addSpots(fourWheelerSpots);
        instance2.setStrategy(strategy2);

        ParkingSpotFactory factory = new ParkingSpotFactory();
        EntranceGate gate = new EntranceGate(factory);
        ExitGate exitGate = new ExitGate(factory);

        Vehicle car = new Vehicle(1371, VehicleType.FourWheeler);
        Vehicle bike = new Vehicle(2901, VehicleType.TwoWheeler);

        Ticket carTkt = gate.generateTicket(car);
        Ticket bikeTkt = gate.generateTicket(bike);

        exitGate.removeVehicle(carTkt);
        exitGate.removeVehicle(bikeTkt);

    }
}
