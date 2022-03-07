package LAB3;

import java.util.Scanner;

public class MetroBank1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int accountNumber, accountBalance, salary, loanAmount, emiCount;
        String loanType;
        System.out.print("Enter account number : ");
        accountNumber = input.nextInt();
        System.out.print("Enter account balance : ");
        accountBalance = input.nextInt();
        System.out.print("Enter salary of customer : ");
        salary = input.nextInt();
        System.out.print("Enter type of loan : ");
        loanType = input.next();
        System.out.print("Enter expected loan amount : ");
        loanAmount = input.nextInt();
        System.out.print("Enter number of EMIs : ");
        emiCount = input.nextInt();

        if (checkAccountNumber(accountNumber)) {
            if (accountBalance >= 1000) {
                if (salary > 25000 && loanType.equals("Car") && loanAmount <= 500000 && emiCount <= 36) {
                    System.out.println("Account Number : " + accountNumber);
                    System.out.println("Eligible Loan amount : " + 500000);
                    System.out.println("Requested Loan amount : " + loanAmount);
                    System.out.println("Maximum number of EMIs : " + 36);
                    System.out.println("Loan Request Approved");
                }
                if (salary > 50000 && loanType.equals("House") && loanAmount <= 6000000 && emiCount <= 60) {
                    System.out.println("Account Number : " + accountNumber);
                    System.out.println("Eligible Loan amount : " + 6000000);
                    System.out.println("Requested Loan amount : " + loanAmount);
                    System.out.println("Maximum number of EMIs : " + 60);
                    System.out.println("Loan Request Approved");
                }
                if (salary > 75000 && loanType.equals("Business") && loanAmount <= 7500000 && emiCount <= 84) {
                    System.out.println("Account Number : " + accountNumber);
                    System.out.println("Eligible Loan amount : " + 7500000);
                    System.out.println("Requested Loan amount : " + loanAmount);
                    System.out.println("Maximum number of EMIs : " + 84);
                    System.out.println("Loan Request Approved");
                }
            }
            else System.out.println("Loan Request Rejected : Account balance less than 1000");
        } else {
            if (!checkAccountNumber(accountNumber)) System.out.println("Loan Request Rejected : Incorrect account number");
        }
    }
    private static boolean checkAccountNumber(int accountNumber) {
        return (accountNumber / 1000) == 1;  //51678
    }
}
