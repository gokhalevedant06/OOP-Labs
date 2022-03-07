package com.vedant;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double F = input.nextDouble();
        double C = ((F-32)/9)*5;
        System.out.println("Temperature in celsius = "+C);
    }
}
