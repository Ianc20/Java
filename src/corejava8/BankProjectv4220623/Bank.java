package corejava8.BankProjectv4220623;

import java.util.Scanner;

public class Bank {
    
    static void chatBot(Scanner sc){
        do{
            System.out.println("Welcome to the AB Bank!");
            System.out.println("Please enter your Login ID: ");
            String account = sc.nextLine();
            System.out.println("Please enter your password: ");
            String password = sc.nextLine();
            Account loginUser1 = Login.login(account,password);
            if(loginUser1!= null){
                loginUser1.display();
                if(loginUser1.profile){
                    Manager loginUser = (Manager)loginUser1;
                    do{
                        System.out.println("Hi, "+loginUser.name+", Do you want to add new user? (y/n)");
                        String answer = sc.nextLine();
                        if(answer.equalsIgnoreCase("y")){
                            System.out.println("What kind account you want to create(0 for manager,any other number for user): ");
                            int accountType = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Please enter new account number: ");
                            String newAccount = sc.nextLine();
                            System.out.println("Please enter new password: ");
                            String newPassword = sc.nextLine();
                            if(accountType == 0){
                                loginUser.signup(newAccount,newPassword,true, sc);
                            }else{
                                loginUser.signup(newAccount,newPassword,false, sc);
                            }
                        } 
                        System.out.println("Do you want to continue? (y/n)");
                        sc.nextLine();
                    }while(sc.nextLine().equalsIgnoreCase("y"));
                    System.out.println("Goodbye!");
                }else{
                    User loginUser = (User)loginUser1;
                    System.out.println("Hi, "+loginUser.name+", Do you want to view your balance? (y/n)");
                    String answer = sc.nextLine();
                    boolean viewbalance = false;
                    if(answer.equalsIgnoreCase("y")){
                        viewbalance = true;
                    }
                    loginUser.displayBalance(viewbalance);
                }
            }
            System.out.println("Do you want to exit? (y/n)");
        }while(sc.nextLine().equalsIgnoreCase("n"));
    }
}
