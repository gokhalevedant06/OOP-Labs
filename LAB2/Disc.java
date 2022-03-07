package com.vedant;

import java.util.Scanner;

public class Disc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of a : ");
        int a = input.nextInt();
        System.out.print("Enter value of b : ");
        int b = input.nextInt();
        System.out.print("Enter value of c : ");
        int c = input.nextInt();
        System.out.println("Your Quadratic Equation = "+a+"x^2+"+b+"x+"+c);
        double discriminant = ((b*b)-(4*a*c));
        double x1 = (-b+Math.sqrt(discriminant))/(2*a);
        double x2 = (-b-Math.sqrt(discriminant))/(2*a);
        if(discriminant==0) System.out.println("Roots Equal = "+x1);
        else if(discriminant>0) System.out.println("Unequal real roots = "+x1+" "+x2);
        else System.out.println("The equation has no real roots");
    }
}
