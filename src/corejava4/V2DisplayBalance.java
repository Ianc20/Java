package corejava4;

public class V2DisplayBalance extends V2Authenticate {

    int balance;
    public void balanceCheck(int index, int[] balances){
        this.balance = balances[index];
        System.out.println("Your balance is: " + balances[index]);
    }
}
