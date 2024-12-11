package src.designPatterns.DecoratorPattern.Decorator;


import src.designPatterns.DecoratorPattern.BasePizza;

public class ExtraCheese extends ToppingsDecorator{
    public ExtraCheese(BasePizza basePizza) {
        super(basePizza);
    }
    public int cost() {
        return basePizza.cost() + 10;
    }
}
