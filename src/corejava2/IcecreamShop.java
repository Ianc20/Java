package corejava2;

import java.util.HashMap;
import java.util.Scanner;

public class IcecreamShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + ", How are you doing?");
        sc.nextLine();
        int num;
        HashMap<String, Integer> orders = new HashMap<>();
        int cont = 1;
        do{
            System.out.println("Would you like 1.Scoops 2.Exquisite");
            int answer = sc.nextInt();
            //print scoops flavor
            switch (answer){
                case 1:
                System.out.println("1. vanilla $3,\n2. chocolate $4,\n3. strawberry $5,\n4. mango $6,\n5. pineapple $7,\n6. orange $5,\n7. cream $3");
                int flavor1 = sc.nextInt();
                System.out.println("How many would you like?");
                num = sc.nextInt();
                switch (flavor1){
                    case 1:
                        orders.put("vanilla scoops,3", num);
                        break;
                    case 2:
                        orders.put("chocolate scoops,4", num);
                        break;
                    case 3:
                        orders.put("strawberry scoops,5", num);
                        break;
                    case 4:
                        orders.put("mango scoops,6", num);
                        break;
                    case 5:
                        orders.put("pineapple scoops,7", num);
                        break;
                    case 6:
                        orders.put("orange scoops,5", num);
                        break; 
                    case 7:
                        orders.put("cream scoops,3", num);
                        break;
                    default:
                        break;
                    }
                break;
                case 2:
                    System.out.println("1. apple $6,\n2. banana $3,\n3. blueberry $6,\n4. pineapple $7,\n5. chocolate $9,\n6. cream $8");
                    int flavor2 = sc.nextInt();
                    System.out.println("How many would you like?");
                    num = sc.nextInt();
                    switch (flavor2){
                        case 1:
                            orders.put("apple exquisite,6", num);
                            break;
                        case 2:
                            orders.put("banana exquisite,3", num);
                            break;
                        case 3:
                            orders.put("blueberry exquisite,6", num);
                            break;
                        case 4:
                            orders.put("pineapple exquisite,7", num);
                            break;
                        case 5:
                            orders.put("chocolate exquisite,9", num);
                            break;
                        case 6:
                            orders.put("cream exquisite,8", num);
                            break;
                        default:
                            break;
                }
                    break;
                default:
                    break;
            }
            System.out.println("Icecream Shop");
            System.out.println("item\tprice\tquantity\ttotal");
            double sum = 0;
            int qty = 0;
            int i = 1;
            for(String key : orders.keySet()){
                String[] str = key.split(",");
                double total = Integer.valueOf(str[1]) * orders.get(key);
                System.out.println(i+". " +str[0]+"\t"+str[1] + "\t" + orders.get(key) + "\t" + total);
                qty += orders.get(key);
                sum += total;
                i++;
            }
            System.out.println("total\t\t\t" + qty + "\t"+sum);
            System.out.println("Would you like continue order?(0 to exit)");
            cont = sc.nextInt();

        }while (cont != 0);
        
        sc.close();
    }
}
