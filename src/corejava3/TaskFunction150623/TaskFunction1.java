package corejava3.TaskFunction150623;

public class TaskFunction1 {

    int a;
    int b;
    int c;
    
    //constructor
    public TaskFunction1() {
        this.a = 1;
        this.b = 2;
        this.c = 3;
    }
    public TaskFunction1(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //return int sum of 3 number
    public int sum() {
        return this.a + this.b + this.c;
    }
    //void function to calculate product of 3 number
    public void product() {
        System.out.println("product is " + this.a * this.b * this.c);
    }
    
}
