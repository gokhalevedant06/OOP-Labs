package LAB9;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        do {
            System.out.println("Enter your choice");
            System.out.println("1. Divide by Zero");
            System.out.println("2. Array Index Out Of Bound");
            System.out.println("3. Null Pointer Exception");
            System.out.println("4. Exit");
            a=input.nextInt();
            switch (a){
                case 1:
                    try{
                        System.out.print("Enter a number: ");
                        int num1 = input.nextInt();
                        System.out.print("Enter a number: ");
                        int num2 = input.nextInt();
                        System.out.println(num1/num2);
                    }catch (ArithmeticException e) {
                        System.out.println("You shouldn’t divide a number by zero"+"\n"+e);
                    }
                    break;
                case 2:
                    try{
                        System.out.print("Enter length of array: ");
                        int n = input.nextInt();
                        int[] arr = new int[5];
                        for (int i=0;i<n;i++){
                            arr[i]= input.nextInt();
                        }
                    }catch (ArrayIndexOutOfBoundsException e){
                        System.out.println("Array Index Out of bound"+"\n"+e);
                    }
                    break;
                case 3:
                    try{
                        String str = null;
                        System.out.println(str.length());
                    }catch (NullPointerException e){
                        System.out.println("Null Pointer Exception arises!!"+"\n"+e);
                    }
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }while (a!=4);
    }
}
