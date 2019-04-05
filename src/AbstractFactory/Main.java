package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory1 = FactoryProducer.getFactory("Color");
        AbstractFactory abstractFactory2 = FactoryProducer.getFactory("shape");
        abstractFactory1.getColor("red").fill();
        abstractFactory1.getColor("blue").fill();
        abstractFactory2.getShape("square").draw();
        abstractFactory2.getShape("rectangle").draw();
    }
}
