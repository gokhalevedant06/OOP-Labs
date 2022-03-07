package com.vedant;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of circle : ");
        double pi = 3.14;
        double radius = input.nextDouble();
        double area = pi*radius*radius;
        System.out.println("Area = "+area);
    }
}
