package corejava10.EHTask;

public class NestedTry {

    void arithmeticFunc(){
            int num1 = 10;
            int num2 = 0;
            int result = num1 / num2;
            System.out.println(result);
        }

    void arrayOOBFunc(){
        int arr[] = {1,2,3};
        System.out.println(arr[4]);
    }
    public static void main(String[] args){

        try{
            int num1 = 10;
            int num2 = 0;
            int result = num1 / num2;
            System.out.println(result);
            try {
                //array out of bound exception
                int arr[] = {1,2,3};
                System.out.println(arr[4]);
            }catch (ArithmeticException e){
                System.out.println("Arithmetic exception");
                
            }
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Array out of bound exception");
        }

    }
     
}
