package corejava5.Figure190623;

public class Rectangle extends Figure{

    Rectangle(){
        super();
    }

    Rectangle(double width, double height) {
        super(width, height);
    }

    //@Override
    public double area() {
        System.out.println("Area of rectangle is :" );
        return width * height;
    }
    
}
