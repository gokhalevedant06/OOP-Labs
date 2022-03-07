package LAB6;

import java.util.Scanner;

public class Circle extends Shape{
    private double radius;
    public Circle(){
        getInputs();
        System.out.println("Area of Circle : "+setArea(getRadius()));
    }
    public void getInputs(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of circle : ");
    this.radius = input.nextDouble();
    }
    public double setArea(double radius){
        return 3.14*radius*radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
