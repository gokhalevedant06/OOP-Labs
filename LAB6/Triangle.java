package LAB6;

import java.util.Scanner;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(){
        getInputs();
        System.out.println("Area of Triangle : "+setArea(getBase(),getHeight()));
    }
    public void getInputs(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Base of Triangle : ");
        this.base = input.nextDouble();
        System.out.print("Enter Height of Triangle : ");
        this.height = input.nextDouble();
    }
    public double setArea(double base,double height){
        return 0.5*base*height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
