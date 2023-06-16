package corejava4;

import java.util.Scanner;

public class BankTaskV1main {
    
    public static void main(String[] args) {

        String[] AccountIDs = {"AB123", "AB456", "AB789", "AB101", "AB102","BB123", "BB456", "BB789", "BB101", "BB102"};
        String[] Passwords = {"123456", "456789", "789123", "101202", "102203", "123321", "456654", "789981", "101123", "102201"};
        int[] balances = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000};

        BankTaskV1 bankTask = new BankTaskV1(AccountIDs, Passwords, balances);
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to AB bank!");
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("Hello " + name + "!" );
        System.out.println("What is your account ID?");
        String userID = scan.nextLine();
        int index = bankTask.checkAccountNumber(userID);
        if(index >= 0){
            System.out.println("What is your password?");
            String password = scan.nextLine();
            if(bankTask.checkPassword(index,password)){
                System.out.print("Welcome " + name + "! ");
                do{
                    System.out.println("Do you want to check your balance? (y/n)");
                    if(scan.nextLine().equalsIgnoreCase("y")){
                        bankTask.balanceCheck(index);
                    }
                    System.out.println("Do you want to exit? (y/n)");
                }
                while(scan.nextLine().equalsIgnoreCase("n"));
                
            }else{
                System.out.println("Wrong password!");
            }
        }else{
            System.out.println("Wrong account number!");
        }
        scan.close();
            
    }

}
