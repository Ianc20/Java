package corejava4;

import java.util.Scanner;

public class BankTaskV3Main {
    
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
        BankTaskV3 bankTaskV3 = new BankTaskV3(AccountIDs, Passwords, balances);

        V3UserInfo userInfo = new V3UserInfo();
        userInfo.infoSetup(doorNo, street, city, zipCode, phone, email);
        
        userInfo.hello(scanner);
        do{
            int index = userInfo.authenticate(scanner, bankTaskV3.AccountIDs, bankTaskV3.Passwords);
            if(index >=0){
                System.out.println("Do you want to change your infomation? (y to print)");
                if(scanner.nextLine().equalsIgnoreCase("y")){
                    userInfo.infoSetup(scanner);
                }
                userInfo.infoprint();
                userInfo.balanceCheck(index,bankTaskV3.balances);
            }
            System.out.println("Do you want to continue? (y to continue)");
        }while(scanner.nextLine().equalsIgnoreCase("y"));

        System.out.println("Thank you for using!");
        scanner.close();

    }
}
