package LAB4;

import java.util.Scanner;

class Participant {
    private static int counter;
    private String registrationId;
    private String studentName;
    private long contactNumber;
    private String branch;

    static {
        counter = 1001;
    }

    public Participant(String studentName, long contactNumber, String branch) {
        setName(studentName);
        setContactNumber(contactNumber);
        setBranch(branch);
        this.registrationId = "D" + counter;
        counter += 1;
        System.out.println("Hi " + getName() + "! " + "Your registration ID is " + getRegistrationId());
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public String getName() {
        return studentName;
    }

    public static int getCounter() {
        return Participant.counter;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public String getBranch() {return branch;}

    public static void setCounter(int counter) {
        Participant.counter = counter;
    }

    public void setName(String studentName) {
        this.studentName = studentName;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}

public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name of student : ");
        String name = input.next();
        System.out.print("Enter contact number of student : ");
        long number = input.nextLong();
        System.out.print("Enter branch of student : ");
        String branch = input.next();
        Participant participant1 = new Participant(name,number,branch);
        System.out.print("Enter name of student : ");
        name = input.next();
        System.out.print("Enter contact number of student : ");
        number = input.nextLong();
        System.out.print("Enter branch of student : ");
        branch = input.next();
        Participant participant2 = new Participant(name,number,branch);
    }
}
