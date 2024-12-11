package src.designPatterns.StrategyPattern;


import src.designPatterns.StrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
