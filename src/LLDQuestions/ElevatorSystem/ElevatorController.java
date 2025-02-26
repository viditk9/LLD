package src.LLDQuestions.ElevatorSystem;

import java.util.PriorityQueue;
import java.util.Queue;

public  class ElevatorController {

    PriorityQueue<Integer> upMinPQ;
    PriorityQueue<Integer> downMaxPQ;

    Queue<Integer> pending;
    ElevatorCar elevatorCar;

    ElevatorController(ElevatorCar elevatorCar){

        this.elevatorCar = elevatorCar;
        upMinPQ = new PriorityQueue<>();
        downMaxPQ = new PriorityQueue<>((a, b) -> b-a);

    }

    public void run() {
        while (true) {
            while (!upMinPQ.isEmpty() || !downMaxPQ.isEmpty() || !pending.isEmpty()) {
                processRequests();
            }
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void submitExternalRequest(int floor, Direction direction){

        if(elevatorCar.elevatorDirection == Direction.DOWN && direction == Direction.DOWN && floor <= elevatorCar.currentFloor) {
            downMaxPQ.offer(floor);
        } else if(elevatorCar.elevatorDirection == Direction.UP && direction == Direction.UP && floor >= elevatorCar.currentFloor){
            upMinPQ.offer(floor);
        } else pending.offer(floor);
        notifyAll();
    }

    public void submitInternalRequest(int floor){
        Direction direction = floor > elevatorCar.currentFloor ? Direction.UP : Direction.DOWN;
        submitExternalRequest(floor,direction);
    }

    public void processRequests(){
        elevatorCar.elevatorState = ElevatorState.MOVING;
        while(!upMinPQ.isEmpty() || !downMaxPQ.isEmpty() || !pending.isEmpty()) {
            if(elevatorCar.elevatorDirection == Direction.UP){
                while(!upMinPQ.isEmpty())
                {
                    if(upMinPQ.peek() == elevatorCar.currentFloor) upMinPQ.poll();
                    elevatorCar.currentFloor++;
                    elevatorCar.setDisplay();
                    elevatorCar.showDisplay();
                    try {
                        Thread.sleep(1000); // Simulating elevator movement
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                while(!downMaxPQ.isEmpty() && downMaxPQ.peek() > elevatorCar.currentFloor)
                {
                    if(!upMinPQ.isEmpty() && upMinPQ.peek() == elevatorCar.currentFloor) upMinPQ.poll();
                    elevatorCar.currentFloor++;
                    elevatorCar.setDisplay();
                    elevatorCar.showDisplay();
                    try {
                        Thread.sleep(1000); // Simulating elevator movement
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                while(!pending.isEmpty())
                {
                    upMinPQ.offer(pending.poll());
                }
                elevatorCar.elevatorDirection = Direction.DOWN;
            } else {
                while(!downMaxPQ.isEmpty())
                {
                    if(downMaxPQ.peek() == elevatorCar.currentFloor) downMaxPQ.poll();
                    elevatorCar.currentFloor--;
                    elevatorCar.setDisplay();
                    elevatorCar.showDisplay();
                    try {
                        Thread.sleep(1000); // Simulating elevator movement
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                while(!upMinPQ.isEmpty() && upMinPQ.peek() < elevatorCar.currentFloor)
                {
                    if(!downMaxPQ.isEmpty() && downMaxPQ.peek() == elevatorCar.currentFloor) downMaxPQ.poll();
                    elevatorCar.currentFloor--;
                    elevatorCar.setDisplay();
                    elevatorCar.showDisplay();
                    try {
                        Thread.sleep(1000); // Simulating elevator movement
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                while(!pending.isEmpty())
                {
                    downMaxPQ.offer(pending.poll());
                }
                elevatorCar.elevatorDirection = Direction.DOWN;
            }
        }
        elevatorCar.elevatorState = ElevatorState.IDLE;
    }

}

