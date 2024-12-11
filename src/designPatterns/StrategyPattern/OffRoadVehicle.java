package src.designPatterns.StrategyPattern;


import src.designPatterns.StrategyPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
