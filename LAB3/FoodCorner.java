package LAB3;
//Food Corner home delivers vegetarian and non-vegetarian meals to its customers based on the order.
//
//A vegetarian combo costs $12 per plate and a non-vegetarian combo costs $15 per plate. Apart from the cost per plate of food, customers are also charged for home delivery based on the distance in kms from the restaurant to the delivery point. The delivery charges are as mentioned below: Given the type of food, quantity (no. of plates) and the distance in kms from the restaurant to the delivery point, implement a program to calculate the final bill amount to be paid by a customer.
//
//The below information must be used to check the validity of the data provided by the customer:  The below information must be used to check the validity of the data provided by the customer:
//Type of food must be 'V' for vegetarian and 'N' for non-vegetarian.
//
//Distance in kms must be greater than 0.
//
//Quantity ordered should be minimum 1.
//
//If any of the input is invalid, the bill amount should be displayed as -1
// first 3km =$0
//  next 3km =$1 per km
//  next = $2 per km

import java.util.Scanner;

public class FoodCorner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter V for veg meal and N for non-veg meal");
        String typeFood = input.nextLine();
        System.out.println("Enter number of plates");
        int quantity = input.nextInt();
        System.out.println("Enter distance in kms");
        int distance = input.nextInt();
        System.out.println("$ "+finalBillAmount(typeFood,quantity,distance));
    }

    private static int finalBillAmount(String typeFood, int quantity, int distance) {
        int amount = 0;
        if(quantity>0 && distance>0){
            if (typeFood.equals("V")){
                amount = quantity*12+deliveryCharge(distance);
            }
            else {
                amount = quantity*15+deliveryCharge(distance);
            }
        }
        else {
            System.out.println("Distance and quantity should be more than 0");
            return -1;
        }
        return amount;
    }

    private static int deliveryCharge(int distance) {
        int deliveryCharge = 0;
        for (int i = 0; i <= distance; i++) {
            if (i>3 && i<=6) deliveryCharge+=1;
            else if(i>=7) deliveryCharge+=2;
        }
        return deliveryCharge;
    }
}
