package LAB7;

public class ContractEmployee extends Employee{
    private double wage;
    private float hoursWorked;
    public ContractEmployee(int empId, String name, double wage, float hoursWorked) {
        super(empId, name);
        setWage(wage);
        setHoursWorked(hoursWorked);

    }
    public void calculateSalary(){
        double salary = getHoursWorked()*getWage();
        System.out.println("Hi "+getEmployeeName()+", your salary is $"+salary);
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
