package com.vedant;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        do {
            System.out.println("1. Add");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            i = input.nextInt();
            switch (i) {
                case 1:
                    System.out.println("Enter a number");
                    int a = input.nextInt();
                    System.out.println("Enter a number");
                    int b = input.nextInt();
                    System.out.println("Ans = "+" "+(a + b));
                    break;
                case 2:
                    System.out.println("Enter a number");
                    a = input.nextInt();
                    System.out.println("Enter a number");
                    b = input.nextInt();
                    System.out.println("Ans = "+" "+(a - b));
                    break;
                case 3:
                    System.out.println("Enter a number");
                    a = input.nextInt();
                    System.out.println("Enter a number");
                    b = input.nextInt();
                    System.out.println("Ans = "+" "+(a * b));
                    break;
                case 4:
                    System.out.println("Enter a number");
                    a = input.nextInt();
                    System.out.println("Enter a number");
                    b = input.nextInt();
                    System.out.println("Ans = "+" "+(a / b));
                    break;
                default:
                    System.out.println("Wrong Choice");
                    break;
            }
        }while(i!=5);

    }
    }

