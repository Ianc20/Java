package session1;

public class Incr {
    public static void main(String[] args) {
        
        //int incr and ctr
        int ctr = 10;
        System.out.println("Post increment : ");
        int incr = ctr++;
        System.out.println("ctr : " + ctr);
        System.out.println("incr : " + incr);

        ctr = 10;
        System.out.println("Pre increment : ");
        incr = ++ctr;
        System.out.println("ctr : " + ctr);
        System.out.println("incr : " + incr);
        
    }

}
