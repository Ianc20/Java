package corejava4.BankTask160623;

import java.util.Scanner;

public class BankTaskV2Main {
    public static void main(String[] args) {
        String[] AccountIDs = {"AB123", "AB456", "AB789", "AB101", "AB102","BB123", "BB456", "BB789", "BB101", "BB102"};
        String[] Passwords = {"123456", "456789", "789123", "101202", "102203", "123321", "456654", "789981", "101123", "102201"};
        int[] balances = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000};

        Scanner scanner = new Scanner(System.in);
        BankTaskV2 bankTaskV2 = new BankTaskV2(AccountIDs, Passwords, balances);
        V2DisplayBalance displayBalance = new V2DisplayBalance();
        displayBalance.hello(scanner);
        do{
            int index = displayBalance.authenticate(scanner, bankTaskV2.AccountIDs, bankTaskV2.Passwords);
            if(index >=0){
                System.out.println("Do you want to check your balance? (y to print)");
                if(scanner.nextLine().equalsIgnoreCase("y")){
                    displayBalance.balanceCheck(index,bankTaskV2.balances);
                }
            }
            System.out.println("Do you want to continue? (y to continue)");
        }while(scanner.nextLine().equalsIgnoreCase("y"));
        
    }

}
