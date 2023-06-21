package corejava5.Figure190623;

public abstract class Figure {
    double width;
    double height;

    Figure(){
    }

    Figure(double width, double height){
        this.width = width;
        this.height = height;
    }
    abstract double area();
    
}
