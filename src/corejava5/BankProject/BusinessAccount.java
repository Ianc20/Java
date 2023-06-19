package corejava5.BankProject;

import java.util.Scanner;

public class BusinessAccount extends BankAccount{
    String orgName;

    public BusinessAccount() {
        this.accountType = "Business";
        this.orgName = "ABC";
    }

    public BusinessAccount(String doorNo, String street, String city, String zipCode, String phone, String email) {
        this.doorNo = doorNo;
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.phone = phone;
        this.email = email;
        this.accountType = "Business";
        this.orgName = "ABC";
    }

    public void hello(Scanner scan) {
        System.out.println("Welcome to AB bank BUSINESS!");
        System.out.println("What is your name?");
        this.name = scan.nextLine();
        this.name = scan.nextLine();
        System.out.println("Hello " + this.name + "!" );
        System.out.println("What is your organization?");
        this.orgName = scan.nextLine();
    }



    @Override
    public void infoprint() {
        System.out.println("name: " + this.name );
        System.out.println("door number: " + this.doorNo);
        System.out.println("street: " + this.street);
        System.out.println("city: " + this.city);
        System.out.println("zip code: " + this.zipCode);
        System.out.println("phone number: " + this.phone);
        System.out.println("email address: " + this.email);
        System.out.println("account type: " + this.accountType);
        System.out.println("organization name: " + this.orgName);
    }

}
