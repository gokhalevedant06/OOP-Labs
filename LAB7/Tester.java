package LAB7;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        while (counter != 3) {
            System.out.println("For Calculating Permanent Employee Salary Press 1");
            System.out.println("For Calculating Contract Employee Salary Press 2");
            System.out.println("To Exit press 3");
            counter = input.nextInt();
            if (counter == 1) {
                System.out.print("Enter Permanent Employee ID: ");
                int empID = input.nextInt();
                System.out.print("Enter Permanent Employee Name: ");
                String name = input.next();
                System.out.print("Enter Basic Pay: ");
                double basicPay = input.nextDouble();
                System.out.print("Enter  hra: ");
                double hra = input.nextDouble();
                System.out.print("Enter years of experience: ");
                float experience = input.nextFloat();
                PermanentEmployee employee1 = new PermanentEmployee(empID, name, basicPay, hra, experience);
                employee1.calculateMonthlySalary();
            } else if (counter == 2) {
                System.out.print("Enter Contract Employee ID: ");
                int empID = input.nextInt();
                System.out.print("Enter Contract Employee Name: ");
                String name = input.next();
                System.out.print("Enter Wage Pay: ");
                double wage = input.nextDouble();
                System.out.print("Enter hours worked: ");
                float hoursWorked = input.nextFloat();
                ContractEmployee employee2 = new ContractEmployee(empID, name, wage, hoursWorked);
                employee2.calculateSalary();
            }
        }
    }
}
