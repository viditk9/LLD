package designPatterns.DecoratorPattern.Decorator;

import designPatterns.DecoratorPattern.BasePizza;

public abstract class ToppingsDecorator extends BasePizza {
    BasePizza basePizza;
    public ToppingsDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
}
