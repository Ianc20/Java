package corejava9.p1;

public class Protection {
    int num1 = 100;
    private int num_private = 200;
    protected int num_protected = 300;
    public int num_public = 400;

    public Protection() {
        System.out.println("Base Class Constructor");
        System.out.println("num1 = " + num1);
        System.out.println("num_private = " + num_private);
        System.out.println("num_protected = " + num_protected);
        System.out.println("num_public = " + num_public);
    }

    /**
     * @return the num1
     */
    public int getNum1() {
        return num1;
    }

    /**
     * @return the num_private
     */
    public int getNum_private() {
        return num_private;
    }

    /**
     * @return the num_protected
     */
    public int getNum_protected() {
        return num_protected;
    }

    /**
     * @return the num_public
     */
    public int getNum_public() {
        return num_public;
    }

    
}
