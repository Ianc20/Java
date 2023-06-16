package corejava4;

public class BankTaskV3 {
    String[] AccountIDs;
    String[] Passwords;
    int[] balances;


    public BankTaskV3() {
    }

    /**
     * @param accountIDs
     * @param passwords
     * @param balances
     */
    public BankTaskV3(String[] accountIDs, String[] passwords, int[] balances) {
        AccountIDs = accountIDs;
        Passwords = passwords;
        this.balances = balances;
    }

    

}
