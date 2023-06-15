package corejava3;

public class Break1 {
    public static void main(String[] args) {
        int num1 = 0;
        for(;;){
            num1++;
            if(num1 == 10)break;
            System.out.println(num1);
        }
    }
}
