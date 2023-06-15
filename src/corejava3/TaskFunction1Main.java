package corejava3;

public class TaskFunction1Main {
    
    public static void main(String[] args) {
        TaskFunction1 taskFunction1 = new TaskFunction1();
        int sum = taskFunction1.sum();
        System.out.println("sum is " + sum);
        taskFunction1.product();
    }
}
