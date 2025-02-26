package src.LLDQuestions.ElevatorSystem;

import java.util.ArrayList;
import java.util.List;

public class ExternalDispatcher {

    public static ExternalDispatcher instance;
    List<ElevatorController> elevatorControllerList = ElevatorCreator.elevatorControllerList;
    public ExternalDispatcher(List<ElevatorController> elevatorControllerList) {
        this.elevatorControllerList = elevatorControllerList;
    }

    public static ExternalDispatcher getInstance() {
        if(instance == null) {
            List<ElevatorController> elevatorControllerList = new ArrayList<>();
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
            instance = new ExternalDispatcher(elevatorControllerList);
        }
        return instance;
    }



    public void submitExternalRequest(int floor, Direction direction){


        int ind=-1, minDisInSameDirection = Integer.MAX_VALUE;
        for(int i=0;i<elevatorControllerList.size();i++) {

            ElevatorCar elevator = elevatorControllerList.get(i).elevatorCar;
            if(elevator.elevatorState == ElevatorState.IDLE && Math.abs(floor - elevator.currentFloor) < minDisInSameDirection)
            {
                minDisInSameDirection = Math.abs(floor - elevator.currentFloor);
                ind = i;
            }
            else if(elevator.elevatorDirection==Direction.UP && direction == Direction.UP && floor >= elevator.currentFloor && Math.abs(floor - elevator.currentFloor) < minDisInSameDirection)
            {
                minDisInSameDirection = Math.abs(floor - elevator.currentFloor);
                ind = i;
            }
            else if(elevator.elevatorDirection==Direction.DOWN && direction == Direction.DOWN && floor <= elevator.currentFloor && Math.abs(floor - elevator.currentFloor) < minDisInSameDirection)
            {
                minDisInSameDirection = Math.abs(floor - elevator.currentFloor);
                ind = i;
            }
        }
        if(ind != -1)  elevatorControllerList.get(ind).submitExternalRequest(floor,direction);
        else
        {
            int minDistance = Integer.MAX_VALUE;
            ElevatorController optimalElevatorController = null;
            for (ElevatorController elevatorController : elevatorControllerList) {
                int distance = Math.abs(floor - elevatorController.elevatorCar.currentFloor);
                if (distance < minDistance) {
                    minDistance = distance;
                    optimalElevatorController = elevatorController;
                }
            }
            optimalElevatorController.submitExternalRequest(floor,direction);
        }
    }

}

