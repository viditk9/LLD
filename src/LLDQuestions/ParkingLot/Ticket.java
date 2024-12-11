package src.LLDQuestions.ParkingLot;

import java.sql.Time;

public class Ticket {
    long entryTime;
    Vehicle vehicle;
    ParkingSpot spot;

    Ticket(Vehicle v, ParkingSpot spot) {
        this.vehicle = v;
        this.spot = spot;
        this.entryTime = System.currentTimeMillis() / 1000L;
        System.out.println("TKT generated for vehicle number - " + v.number + " and spot assigned is spot id - " + spot.id);
    }
}
