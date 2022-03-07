package LAB11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Order {
    private int orderId;
    private ArrayList<String> itemNames;
    private boolean orderStatus;

    public Order(int orderId, ArrayList<String> items, boolean orderStatus) {
        setOrderId(orderId);
        setItemNames(items);
        setOrderStatus(orderStatus);
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public ArrayList<String> getItemNames() {
        return itemNames;
    }

    public void setItemNames(ArrayList<String> itemNames) {
        this.itemNames = itemNames;
    }

    public void setOrderStatus(boolean orderStatus) {
        this.orderStatus = orderStatus;
    }


}

public class ArrayListAssignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        ArrayList<String> arr= new ArrayList<String>();
        int numItems = input.nextInt();
        for (int i=0;i<numItems;i++){
            System.out.print("Enter Item "+(i+1)+" ");
            String str = input.next();
            arr.add(str);
        }
        Order o1 = new Order(100,arr,true);
        System.out.print("Enter number of items: ");
        numItems = input.nextInt();
        for (int i=0;i<numItems;i++){
            System.out.print("Enter Item "+(i+1)+" ");
            String str = input.next();
            arr.add(str);
        }
        Order o2 = new Order(101,arr,true);
        System.out.print("Enter number of items: ");
        numItems = input.nextInt();
        for (int i=0;i<numItems;i++){
            System.out.print("Enter Item "+(i+1)+" ");
            String str = input.next();
            arr.add(str);
        }
        Order o3 = new Order(100,arr,true);
        System.out.println(o1.getItemNames());

    }
}


