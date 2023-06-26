package corejava10.BankTaskV5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Manager extends Account implements Signup, AccountNumCheck{

    public Manager(String loginID, String password) {
        super(loginID, password);
        this.profile = true;
    }

    @Override
    public void signup(String username, String password, boolean profile, Scanner scanner) {
        if (profile) {
            if (!AccountDatabase.accountPasswds.containsKey(username)) {
                AccountDatabase.accountPasswds.put(username, password);
                Manager manager = new Manager(username, password);
                AccountDatabase.accountObjects.put(username, manager);
                System.out.println("Information:");
                System.out.println("name: " );
                manager.name = scanner.nextLine();
                System.out.println("address: " );
                manager.address = scanner.nextLine();
                do{
                    System.out.println("account number: " );
                    String accountNum = scanner.nextLine();
                    if (checkAccountNum(accountNum)) {
                        manager.number = accountNum;
                        break; 
                    } else {
                        System.out.println("Please enter a valid account number");
                    }
                }while (true);
                System.out.println("Manager Account created");

            }else {
                System.out.println("Username already exists");
            } 
        }else {
            if (!AccountDatabase.accountPasswds.containsKey(username)) {
                AccountDatabase.accountPasswds.put(username, password);
                User user = new User(username, password);
                AccountDatabase.accountObjects.put(username, user);
                System.out.println("Information:");
                System.out.println("name: " );
                user.name = scanner.nextLine();
                System.out.println("address: " );
                user.address = scanner.nextLine();
                do{
                    System.out.println("account number: " );
                    String accountNum = scanner.nextLine();
                    if (checkAccountNum(accountNum)) {
                        user.number = accountNum;
                        break; 
                    } else {
                        System.out.println("Please enter a valid account number");
                    }
                }while (true);
                
                do {
                    try {
                        System.out.println("balance: " );
                        user.balance = scanner.nextInt();
                        System.out.println("User Account created");
                        scanner.nextLine();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Please enter a valid number");
                        scanner.nextLine();
                    }
                } while (true);


            }else {
                System.out.println("Username already exists");
            }
        }
    }

    @Override
    public boolean checkAccountNum(String accountNum) {
        if(accountNum.matches("\\d+")){
            if(AccountDatabase.accountsNumber.add(accountNum)){
                return true;
            }else{
                System.out.println("Account number already exists");
                System.out.println(AccountDatabase.accountsNumber.toString());
                return false;
            }
        }else{
            System.out.println("Account number must be numbers only");
            return false;
        }
    }
    
}
