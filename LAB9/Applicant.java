package LAB9;

import java.util.Scanner;

public class Applicant {
    private String name;
    private String jobProfile;
    private int age;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getJobProfile() {
        return jobProfile;
    }

    public void setJobProfile(String jobProfile) {
        this.jobProfile = jobProfile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Applicant applicant = new Applicant();
        System.out.print("Enter applicant name: ");
        String name = input.next();
        applicant.setName(name);
        System.out.print("Enter job profile: ");
        String jobProfile = input.next();
        applicant.setJobProfile(jobProfile);
        System.out.print("Enter applicant age: ");
        int age = input.nextInt();
        applicant.setAge(age);
        Validator val = new Validator();
        val.validate(applicant);
    }
}
