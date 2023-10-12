import java.util.ArrayList;

public class ShapeBuilder {
    ArrayList<Shape> shapes = new ArrayList<>(10);

    public void addShape(Shape s){
        shapes.add(s);
    }
    public double getTotalArea(){
        double sum = 0;
        for(Shape i : shapes){
            sum =+ i.getArea();
        }
        return sum;
    }
}
