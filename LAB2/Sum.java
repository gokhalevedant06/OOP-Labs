package com.vedant;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number ");
        int a = input.nextInt();
        System.out.print("Enter a number ");
        int b = input.nextInt();
        if (a==b) System.out.println("Ans = "+(a+b));
        else System.out.println("Ans = "+((a+b)*2));
    }
}
