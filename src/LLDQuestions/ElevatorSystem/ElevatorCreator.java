package src.LLDQuestions.ElevatorSystem;

import java.util.ArrayList;
import java.util.List;

public class ElevatorCreator {

    static List<ElevatorController> elevatorControllerList = new ArrayList<>();
    static {

        ElevatorCar elevatorCar1 = new ElevatorCar();
        elevatorCar1.id =1;
        ElevatorController controller1 = new ElevatorController(elevatorCar1);
        new Thread(controller1::run).start();

        ElevatorCar elevatorCar2 = new ElevatorCar();
        elevatorCar1.id =2;
        ElevatorController controller2 = new ElevatorController(elevatorCar2);
        new Thread(controller2::run).start();

        elevatorControllerList.add(controller1);
        elevatorControllerList.add(controller2);
    }
}


