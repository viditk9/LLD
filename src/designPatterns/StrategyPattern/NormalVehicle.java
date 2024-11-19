package designPatterns.StrategyPattern;

import designPatterns.StrategyPattern.Strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle{
    public NormalVehicle() {
        super(new NormalDriveStrategy());
    }
}
