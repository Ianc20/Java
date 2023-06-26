package corejava10.EHTask;

public class EHThrow {

    public static void demothrow() {
        try{
            throw new ArithmeticException("AE");
        }catch(Exception e){
            //e.printStackTrace();
            throw e;
        }
    }
    
}
