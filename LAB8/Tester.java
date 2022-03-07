package LAB8;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bill obj1 = new Bill();
        System.out.print("Enter Item ID: ");
        int itemId = input.nextInt();
        System.out.println("Price of selected item is $"+obj1.findPrice(itemId));
        System.out.print("Enter Brand Name: ");
        String brandName = input.next();
        System.out.print("Enter Item Type: ");
        String itemType = input.next();
        System.out.print("Enter Size: ");
        int size = input.nextInt();
        System.out.println("Price of selected item is $"+obj1.findPrice(brandName,itemType,size));
    }
}
