package AbstractFactory;

public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String colorType) {
        if(colorType.equalsIgnoreCase("red")) return new Red();
        else if (colorType.equalsIgnoreCase("blue")) return new Blue();
        return null;
    }
}
