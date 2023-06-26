package corejava10.BankTaskV5;

public abstract class Account{
    String loginID;
    String password;
    boolean profile;
    String name;
    String address;
    String number;



    public Account(String loginID, String password) {
        this.loginID = loginID;
        this.password = password;
    }

    void display(){
        System.out.println("--------------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Account Number: " + number);
        System.out.println("--------------------------------------");
    }
    
}
