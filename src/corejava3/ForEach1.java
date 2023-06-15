package corejava3;

public class ForEach1 {
    public static void main(String[] args) {
        float marks[] = {99,100,90,87,88,95};
        float sum = 0;
        for (float f : marks) {
            System.out.println(f);
            sum += f;
        }
        System.out.println(sum);
    }
}
