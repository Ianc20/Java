package corejava5.BankProject;

public class PersonAccount extends BankAccount{

    String AccountType;

    public PersonAccount() {
        this.accountType = "Person";
    }
    public PersonAccount(String doorNo, String street, String city, String zipCode, String phone, String email) {
        this.doorNo = doorNo;
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.phone = phone;
        this.email = email;
        this.accountType = "Person";
    }
    

    public void infoprint() {
        System.out.println("name: " + this.name );
        System.out.println("door number: " + this.doorNo);
        System.out.println("street: " + this.street);
        System.out.println("city: " + this.city);
        System.out.println("zip code: " + this.zipCode);
        System.out.println("phone number: " + this.phone);
        System.out.println("email address: " + this.email);
        System.out.println("account type: " + this.accountType);
    }
    
}
