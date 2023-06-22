package corejava8.BankProjectv4220623;

public class User extends Account implements DisplayBalance {

    int balance;
    

    public User(String accountNumber, String password) {
        super(accountNumber, password);
        this.profile = false;
    }

    public void displayBalance(boolean yes) {
        if (yes) {
            System.out.println("Balance: " + balance);
        }else {
            System.out.println("Thank you for Banking with us!");
        }
    }


    
}
