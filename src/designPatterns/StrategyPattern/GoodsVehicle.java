package src.designPatterns.StrategyPattern;


import src.designPatterns.StrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
