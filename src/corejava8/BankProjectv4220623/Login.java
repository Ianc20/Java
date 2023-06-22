package corejava8.BankProjectv4220623;

public interface Login {

    static Account login(String account,String password){
        if(AccountDatabase.accountPasswds.containsKey(account)){
            if(AccountDatabase.accountPasswds.get(account).equals(password)){
                return AccountDatabase.accountObjects.get(account);
            }else{
                System.out.println("Wrong password!");
                return null;
            }
        }else{
            System.out.println("Wrong account number!");
            return null;
        }
    }
    
}
