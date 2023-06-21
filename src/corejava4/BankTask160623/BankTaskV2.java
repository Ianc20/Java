package corejava4.BankTask160623;

public class BankTaskV2 {
    String[] AccountIDs;
    String[] Passwords;
    int[] balances;

    //constructor
    public BankTaskV2(){
    }
    public BankTaskV2(String[] AccountIDs, String[] Passwords, int[] balances){
        this.AccountIDs = AccountIDs;
        this.Passwords = Passwords;
        this.balances = balances;
    }
   
}
