package com.vedant;

import java.util.Scanner;

public class AddressDetails {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Door Number : ");
        String door = input.nextLine();
        System.out.print("Enter name of street :  ");
        String street = input.nextLine();
        System.out.print("Enter City : ");
        String city = input.nextLine();
        System.out.print("Enter zip code : ");
        int code = input.nextInt();
        System.out.println("Door No : "+door+"\n"+"Street : "+street+"\n"+"City : "+city+"\n"+"ZIP Code : "+code);
    }
}
