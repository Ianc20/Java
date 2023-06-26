package corejava10.EHTask;

public class EHThrowMain {
    public static void main(String[] args){
        try{
            EHThrow.demothrow();
        }catch(ArithmeticException e){  
            System.out.println("Handled Arithmetic Exception"); //prints ArithmeticException and you  
        }

    }
}
