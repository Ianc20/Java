package corejava4;

import java.util.Scanner;

public class V3UserInfo extends V2DisplayBalance {
    
    String doorNo;
    String street;
    String city;
    String zipCode;
    String phone;
    String email;

    
    public V3UserInfo() {
    }

    /**
     * @param doorNo
     * @param street
     * @param city
     */
    public V3UserInfo(String doorNo, String street, String city) {
        this.doorNo = doorNo;
        this.street = street;
        this.city = city;
    }


    /**
     * @param doorNo
     * @param street
     * @param city
     * @param zipCode
     */
    public V3UserInfo(String doorNo, String street, String city, String zipCode) {
        this.doorNo = doorNo;
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }


    /**
     * @param doorNo
     * @param street
     * @param city
     * @param zipCode
     * @param phone
     * @param email
     */
    public V3UserInfo(String doorNo, String street, String city, String zipCode, String phone, String email) {
        this.doorNo = doorNo;
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.phone = phone;
        this.email = email;
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
