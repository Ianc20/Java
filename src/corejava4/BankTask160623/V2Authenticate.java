package corejava4.BankTask160623;

import java.util.Scanner;

public class V2Authenticate extends V2ChatBot {


    String accountNumber;
    String passwd;

    public V2Authenticate() {
    }

    public int checkAccountNumber(String accountNumber, String[] IDs){
        int index = 0;
        for(String id : IDs){
            if(id.equals(accountNumber)){
                return index;
            }
            index++;
        }
        return -1;
    }

    public void idInput(Scanner scan){
        System.out.println("What is your account ID?");
        this.accountNumber = scan.nextLine();
    }

    //password input
    public void passwordInput(Scanner scan){
        System.out.println("What is your password?");
        this.passwd = scan.nextLine();
    }

    public boolean checkPassword(String password){
        if(password.equals(this.passwd)){
            return true;
        }
        return false;
    }

    public int authenticate(Scanner scan, String[] IDs, String[] passwords){
        idInput(scan);
        int index = checkAccountNumber(this.accountNumber, IDs);
        if(index >= 0){
            passwordInput(scan);
            if(checkPassword(passwords[index])){
               return index;
            }else{
                System.out.println("Wrong password!");
                return -1;
            }
        }else{
            System.out.println("Wrong account number!");
            return -1;
        }
    }
}
