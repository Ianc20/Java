package corejava10.EHTask;

public class ThrowDemoMain {
    public static void main(String[] args){
        try{
            ThrowsDemo.m1();
        }catch(ArithmeticException e){
            System.out.println("Handled Arithmetic Exception");
        }finally{
            System.out.println("Finally");
        }
    }
}
