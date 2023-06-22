package corejava8.BankProjectv4220623;

import java.util.Scanner;

public class Manager extends Account implements Signup{

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
                System.out.println("account number: " );
                manager.number = scanner.nextLine();
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
                System.out.println("account number: " );
                user.number = scanner.nextLine();
                System.out.println("balance: " );
                user.balance = scanner.nextInt();
                System.out.println("User Account created");

            }else {
                System.out.println("Username already exists");
            }
        }
    }
    
}
