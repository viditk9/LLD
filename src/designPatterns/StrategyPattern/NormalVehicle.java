package src.designPatterns.StrategyPattern;


import src.designPatterns.StrategyPattern.Strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle{
    public NormalVehicle() {
        super(new NormalDriveStrategy());
    }
}
