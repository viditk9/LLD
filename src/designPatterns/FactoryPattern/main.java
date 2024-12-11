package src.designPatterns.FactoryPattern;

public class main {
    public static void main(String args[]) {
        ShapeFactory factory = new ShapeFactory();
        Shape obj = factory.getShape("Square");
        obj.draw();
    }
}
