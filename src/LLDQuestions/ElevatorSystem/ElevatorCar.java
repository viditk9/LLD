package src.LLDQuestions.ElevatorSystem;


public class ElevatorCar {

    int id;
    ElevatorDisplay display;
    InternalButtons internalButtons;
    ElevatorState elevatorState;
    int currentFloor;
    Direction elevatorDirection;
    ElevatorDoor elevatorDoor;

    public ElevatorCar(){
        display = new ElevatorDisplay();
        internalButtons = new InternalButtons();
        elevatorState = ElevatorState.IDLE;
        currentFloor = 0;
        elevatorDirection = Direction.UP;
        elevatorDoor = new ElevatorDoor();

    }
    public void showDisplay() {
        display.showDisplay();
    }

    public void pressButton(int destination) {
        internalButtons.pressButton(destination, this);
    }

    public void setDisplay() {
        this.display.setDisplay(currentFloor, elevatorDirection);
    }


//    public void moveElevator(Direction dir, int destinationFloor){
//        int startFloor = currentFloor;
//        if(dir == Direction.UP) {
//            for(int i = startFloor; i<=destinationFloor; i++) {
//
//                this.currentFloor = i;
//                setDisplay();
//                showDisplay();
//                try {
//                    Thread.sleep(1000); // Simulating elevator movement
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//        if(dir == Direction.DOWN) {
//            for(int i = startFloor; i>=destinationFloor; i--) {
//
//                this.currentFloor = i;
//                setDisplay();
//                showDisplay();
//                try {
//                    Thread.sleep(1000); // Simulating elevator movement
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }

}

