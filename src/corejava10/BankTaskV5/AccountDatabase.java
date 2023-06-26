package corejava10.BankTaskV5;

import java.util.HashMap;
import java.util.HashSet;

public class AccountDatabase {
    static HashMap<String, String> accountPasswds = new HashMap<>();
    static HashMap<String, Account> accountObjects = new HashMap<>();
    static HashSet<String> accountsNumber = new HashSet<>();

    static {
        Manager admin1 = new Manager("admin1", "123456");
        admin1.name = "admin1";
        admin1.address = "66 a street";
        admin1.number = "1234568910";
        accountsNumber.add("1234568910");
        Manager admin2 = new Manager("admin2", "123456");
        admin2.name = "admin2";
        admin2.address = "66 b street";
        admin2.number = "1234568911";
        accountsNumber.add("1234568911");
        Manager admin3 = new Manager("admin3", "123456");
        admin3.name = "admin3";
        admin3.address = "66 c street";
        admin3.number = "1234568912";
        accountsNumber.add("1234568912");
        User user1 = new User("user1", "123456");
        user1.name = "user1";
        user1.address = "66 d street";
        user1.number = "1234568913";
        accountsNumber.add("1234568913");
        user1.balance = 1000;
        User user2 = new User("user2", "123456");
        user2.name = "user2";
        user2.address = "66 e street";
        user2.number = "1234568914";
        accountsNumber.add("1234568914");
        user2.balance = 2000;
        User user3 = new User("user3", "123456");
        user3.name = "user3";
        user3.address = "66 f street";
        user3.number = "1234568915";
        accountsNumber.add("1234568915");
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
