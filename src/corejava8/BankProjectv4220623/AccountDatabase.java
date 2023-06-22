package corejava8.BankProjectv4220623;

import java.util.HashMap;

public class AccountDatabase {
    static HashMap<String, String> accountPasswds = new HashMap<>();
    static HashMap<String, Account> accountObjects = new HashMap<>();

    static {
        Manager admin1 = new Manager("admin1", "123456");
        admin1.name = "admin1";
        admin1.address = "a street";
        admin1.number = "1234568910";
        Manager admin2 = new Manager("admin2", "123456");
        admin2.name = "admin2";
        admin2.address = "b street";
        admin2.number = "1234568911";
        Manager admin3 = new Manager("admin3", "123456");
        admin3.name = "admin3";
        admin3.address = "c street";
        admin3.number = "1234568912";
        User user1 = new User("user1", "123456");
        user1.name = "user1";
        user1.address = "d street";
        user1.number = "1234568913";
        user1.balance = 1000;
        User user2 = new User("user2", "123456");
        user2.name = "user2";
        user2.address = "e street";
        user2.number = "1234568914";
        user2.balance = 2000;
        User user3 = new User("user3", "123456");
        user3.name = "user3";
        user3.address = "f street";
        user3.number = "1234568915";
        user3.balance = 3000;
        accountPasswds.put("admin1", "123456");
        accountPasswds.put("admin2", "123456");
        accountPasswds.put("admin3", "123456");
        accountPasswds.put("user1", "123456");
        accountPasswds.put("user2", "123456");
        accountPasswds.put("user3", "123456");
        accountObjects.put("admin1",admin1);
        accountObjects.put("admin2",admin2);
        accountObjects.put("admin3",admin3);
        accountObjects.put("user1",user1);
        accountObjects.put("user2",user2);
        accountObjects.put("user3",user3);
    }


    
}
