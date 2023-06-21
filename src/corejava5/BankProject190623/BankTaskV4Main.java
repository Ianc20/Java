package corejava5.BankProject190623;

import java.util.Scanner;

public class BankTaskV4Main {
    public static void main(String[] args) {
        String[] AccountIDs = {"AB123", "AB456", "AB789", "AB101", "AB102","BB123", "BB456", "BB789", "BB101", "BB102"};
        String[] Passwords = {"123456", "456789", "789123", "101202", "102203", "123321", "456654", "789981", "101123", "102201"};
        int[] balances = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000};
        String doorNo = "123";
        String street = "456";
        String city = "nyc";
        String zipCode = "11111";
        String phone = "1234567890";
        String email = "123@123.c";

        Scanner scanner = new Scanner(System.in);
        BankTaskV4 bankTaskV4 = new BankTaskV4(AccountIDs, Passwords, balances);
        BankAccount bankAccount;
        System.out.println("What type of account would you like login to?(PERSON/BUSINESS) 1 to BUSINESS, ANY KEY to PERSON");
        int type = scanner.nextInt();
        if(type == 1) {
            bankAccount = new BusinessAccount(doorNo, street, city, zipCode, phone, email);
        } else {
            bankAccount = new PersonAccount(doorNo, street, city, zipCode, phone, email);
        }
        bankAccount.hello(scanner);
        int index = bankAccount.authenticate(scanner, bankTaskV4.AccountIDs, bankTaskV4.Passwords);
        do{
            if(index >=0){
                System.out.println("Do you want to change your infomation? (y to change)");
                if(scanner.nextLine().equalsIgnoreCase("y")){
                    bankAccount.infoSetup(scanner);
                }
                bankAccount.infoprint();
                System.out.println("Do you want to check your balance? (y to continue)");
                if(scanner.nextLine().equalsIgnoreCase("y")){
                    bankAccount.balanceCheck(index, bankTaskV4.balances);
                }
            }
            System.out.println("Do you want to continue? (y to continue)");
        }while(scanner.nextLine().equalsIgnoreCase("y"));

        System.out.println("Thank you for using!");
        scanner.close();

    }
}
