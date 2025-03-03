package src.designPatterns.DecoratorPattern;


import src.designPatterns.DecoratorPattern.Decorator.ExtraCheese;
import src.designPatterns.DecoratorPattern.Decorator.Mushroom;

public class Main {
    public static void main(String args[]) {
        BasePizza myPizza = new Mushroom(new ExtraCheese(new Margherita()));
        System.out.println(myPizza.cost());
    }
}
