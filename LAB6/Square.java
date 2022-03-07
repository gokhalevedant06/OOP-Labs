package LAB6;

import java.util.Scanner;

public class Square extends Shape{
    private double side;
    public Square(){
        getInputs();
        System.out.println("Area of Square : "+setArea(getSide()));
    }
    public void getInputs(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of side of square : ");
        this.side = input.nextDouble();
    }
    public double setArea(double side){
        return side*side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
