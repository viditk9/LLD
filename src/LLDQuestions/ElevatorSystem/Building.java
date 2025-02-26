package src.LLDQuestions.ElevatorSystem;

import java.util.List;

public class Building {
    List<Floor> floorList;
    Building(List<Floor> floors) {
        this.floorList = floors;
    }

    public void addFloors(Floor floor) {
        floorList.add(floor);
    }

    public void removeFloors(Floor floor) {
        floorList.remove(floor);
    }

    List<Floor> getAllFloors() {
        return floorList;
    }

}
