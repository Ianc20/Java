package corejava5.Figure190623;

public class Triangle extends Figure{

    public Triangle() {
        super();
    }
    Triangle(double width, double height) {
        super(width, height);
    }

    //@Override
    public double area() {
        System.out.println("Area of triangle is :" );
        return width * height / 2;
    }
    
}
