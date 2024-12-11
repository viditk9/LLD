package src.designPatterns.DecoratorPattern.Decorator;


import src.designPatterns.DecoratorPattern.BasePizza;

public abstract class ToppingsDecorator extends BasePizza {
    BasePizza basePizza;
    public ToppingsDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
}
