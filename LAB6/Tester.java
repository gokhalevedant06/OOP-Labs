package LAB6;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=0;
        while(num!=4){
            System.out.println("Enter 1 for Triangle");
            System.out.println("Enter 2 for Square");
            System.out.println("Enter 3 for Circle");
            System.out.println("Enter 4 to exit");
            num = input.nextInt();
            switch (num) {
                case 1:
                    Triangle T = new Triangle();
                    break;
                case 2:
                    Square S = new Square();
                    break;
                case 3:
                    Circle C = new Circle();
                    break;
                default:
                    System.out.println("Loop Terminated");
            }
        }
    }
}
