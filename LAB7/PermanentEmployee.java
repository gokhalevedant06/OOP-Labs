package LAB7;

public class PermanentEmployee extends Employee {
    private double basicPay;
    private double hra;
    private float experience;

    public PermanentEmployee(int empId, String name, double basicPay, double hra, float experience) {
        super(empId, name);
        setBasicPay(basicPay);
        setHra(hra);
        setExperience(experience);

    }

    public void calculateMonthlySalary() {
        double variableComponent;
        float experience = getExperience();
        if (experience < 3) {
            variableComponent = 0;
        } else if (experience >= 3 && experience < 5) {
            variableComponent = 0.05 * getBasicPay();
        } else if (experience >= 5 && experience < 10) {
            variableComponent = 0.07 * getBasicPay();
        } else {
            variableComponent = 0.12 * getBasicPay();
        }
        double salary = getBasicPay() + getHra() + variableComponent;
        System.out.println("Hi " + getEmployeeName() + ", your salary is $" + salary);
    }

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }
}
