package designPatterns.DecoratorPattern.Decorator;

import designPatterns.DecoratorPattern.BasePizza;

public class Mushroom extends ToppingsDecorator{
    public Mushroom(BasePizza basePizza) {
        super(basePizza);
    }
    public int cost() {
        return basePizza.cost() + 10;
    }
}