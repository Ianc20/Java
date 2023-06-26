package corejava10.CloneTask;

public class CarMain {
    public static void main(String[] args) {
        
        Car car1 = new Car("BMW", 100);
        try{
            Car car2 = (Car)car1.clone();
            System.out.println(car2.carMake);
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
            System.out.println(car1.toString());
        }
        
    }
    
}
