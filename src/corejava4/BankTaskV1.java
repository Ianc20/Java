package corejava4;

public class BankTaskV1 {

    String[] AccountIDs;
    String[] Passwords;
    int[] balances;

    //constructor
    public BankTaskV1(){
    }
    public BankTaskV1(String[] AccountIDs, String[] Passwords, int[] balances){
        this.AccountIDs = AccountIDs;
        this.Passwords = Passwords;
        this.balances = balances;
    }

    // method to check account number if it exists, and return index
    public int checkAccountNumber(String accountNumber){
        int index = 0;
        for(String id : this.AccountIDs){
            if(id.equals(accountNumber)){
                return index;
            }
            index++;
        }
        return -1;
    }

    // method to check password by the same index with account number
    public boolean checkPassword(int index,String passwordInput){
        if(Passwords[index].equals(passwordInput)){
            return true;
        }
        return false;
    }

    // method to check balance
    public void balanceCheck(int index){
        System.out.println("Your balance is: " + this.balances[index]);
    }

    
}
