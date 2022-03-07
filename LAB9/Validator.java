package LAB9;

import javax.naming.InvalidNameException;
import java.util.Scanner;

public class Validator extends Applicant{
    public boolean validateName(String name){
        if(name.length()==0 || name==null) return false;
        else return true;
    }
    public boolean validateJobProfile(String jobProfile){
        if (jobProfile.equals("Associate") || jobProfile.equals("Clerk") || jobProfile.equals("Executive") || jobProfile.equals("Officer")) return true;
        else if (jobProfile.equals("associate") || jobProfile.equals("clerk") || jobProfile.equals("executive") || jobProfile.equals("officer")) return true;
        else return false;
    }
    public boolean validateAge(int age){
        if (age>=18 && age<=30) return true;
        else return false;
    }
    public void validate(Applicant applicant){
        try {
            if (!validateName(applicant.getName())) throw new InvalidNameException("Invalid Name");
            else if(!validateJobProfile(applicant.getJobProfile())) throw new InvalidJobProfileException("Invalid Job Profile");
            else if(!validateAge(applicant.getAge())) throw new InvalidAgeException("Invalid Age");
            else System.out.println("Application submitted successfully");
        }catch (InvalidNameException e){
            System.out.println(e);
        }catch (InvalidJobProfileException e){
            System.out.println(e);
        }catch (InvalidAgeException e){
            System.out.println(e);
        }
    }
}
