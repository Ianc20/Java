package corejava5.BankProject;

import java.util.Scanner;

public class BankAccount {

    String name;
    String accountNumber;
    String passwd;
    int balance;
    String doorNo;
    String street;
    String city;
    String zipCode;
    String phone;
    String email;
    String accountType;


    public void hello(Scanner scan) {
        System.out.println("Welcome to AB bank!");
        System.out.println("What is your name?");
        this.name = scan.nextLine();
        this.name = scan.nextLine();
        System.out.println("Hello " + this.name + "!" );
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

    public void balanceCheck(int index, int[] balances){
        this.balance = balances[index];
        System.out.println("Your balance is: " + balances[index]);
    }

    public void infoSetup(Scanner scanner) {
        System.out.println("Hello, " + this.name + " !");
        System.out.println("What is your door number?");
        this.doorNo = scanner.nextLine();
        System.out.println("What is your street?");
        this.street = scanner.nextLine();
        System.out.println("What is your city?");
        this.city = scanner.nextLine();
        System.out.println("What is your zip code?");
        this.zipCode = scanner.nextLine();
        System.out.println("What is your phone number?");
        this.phone = scanner.nextLine();
        System.out.println("What is your email address?");
        this.email = scanner.nextLine();
    }


    public void infoSetup(String doorNo, String street, String city, String zipCode, String phone, String email) {
        this.doorNo = doorNo;
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.phone = phone;
        this.email = email;
    }
    
    public void infoSetup(String doorNo, String street, String city) {
        this.doorNo = doorNo;
        this.street = street;
        this.city = city;
    }

    public void infoprint() {
        System.out.println("name: " + this.name );
        System.out.println("door number: " + this.doorNo);
        System.out.println("street: " + this.street);
        System.out.println("city: " + this.city);
        System.out.println("zip code: " + this.zipCode);
        System.out.println("phone number: " + this.phone);
        System.out.println("email address: " + this.email);
    }

}
