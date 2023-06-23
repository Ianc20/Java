package corejava9.p2;
import corejava9.p1.Protection;

public class OtherPackage {

    OtherPackage() {
        Protection protection = new Protection();
        System.out.println("OtherPackage constructor");
        //System.out.println("num1 = " + protection.num1);
        //System.out.println("num_private = " + protection.num_private);
        //System.out.println("num_protected = " + protection.num_protected);
        System.out.println("num_public = " + protection.num_public);
        //get methods
        System.out.println("num1 = " + protection.getNum1());
        System.out.println("num_private = " + protection.getNum_private());
        System.out.println("num_protected = " + protection.getNum_protected());
        System.out.println("num_public = " + protection.getNum_public());

    }
    
}
