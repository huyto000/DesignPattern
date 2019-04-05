package Decorator;

public class RedShapeDecorator extends  ShapeDecorator{
    /*public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }*/
    public Shape shape;
    public RedShapeDecorator(Shape shape){
        this.shape = shape;
    }
    @Override
    public void draw() {
       shape.draw();
       setRedBorder(shape);
    }
    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
