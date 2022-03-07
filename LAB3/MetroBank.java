package LAB3;

import java.util.Scanner;

// https://infyspringboard.onwingspan.com/en/viewer/hands-on/lex_auth_01293446572032000041_shared?collectionId=lex_auth_01304972186110361645_shared&collectionType=Course
public class MetroBank {
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

        if (checkAccountNumber(accountNumber) && accountBalance >= 1000) {
            if (salary > 25000 && loanType.equals("Car") && loanAmount <= 500000 && emiCount <= 36) {
                System.out.println("Account Number : " + accountNumber);
                System.out.println("Eligible Loan amount : " + 500000);
                System.out.println("Requested Loan amount : " + loanAmount);
                System.out.println("Maximum number of EMIs : " + 36);
                System.out.println("Loan Request Approved");
            } else {
                if (salary < 25000) System.out.println("Loan Request Rejected : Low Salary");
                else if (loanAmount > 500000) System.out.println("Loan Request Rejected : Loan amount limit exceeded");
                else System.out.println("Loan Request Rejected : EMI count should be less than 36");
            }
            if (salary > 50000 && loanType.equals("House") && loanAmount <= 6000000 && emiCount <= 60) {
                System.out.println("Account Number : " + accountNumber);
                System.out.println("Eligible Loan amount : " + 6000000);
                System.out.println("Requested Loan amount : " + loanAmount);
                System.out.println("Maximum number of EMIs : " + 60);
                System.out.println("Loan Request Approved");
            } else {
                if (salary < 50000) System.out.println("Loan Request Rejected : Low Salary");
                else if (loanAmount > 6000000) System.out.println("Loan Request Rejected : Loan amount limit exceeded");
                else System.out.println("Loan Request Rejected : EMI count should be less than 60");
            }
            if (salary > 75000 && loanType.equals("Business") && loanAmount <= 7500000 && emiCount <= 84) {
                System.out.println("Account Number : " + accountNumber);
                System.out.println("Eligible Loan amount : " + 7500000);
                System.out.println("Requested Loan amount : " + loanAmount);
                System.out.println("Maximum number of EMIs : " + 84);
                System.out.println("Loan Request Approved");
            } else {
                if (salary < 75000) System.out.println("Loan Request Rejected : Low Salary");
                else if (loanAmount > 7500000) System.out.println("Loan Request Rejected : Loan amount limit exceeded");
                else System.out.println("Loan Request Rejected : EMI count should be less than 84");
            }

        } else {
            if (accountBalance < 1000) System.out.println("Loan Request Rejected : Account balance less than 1000");
            else if (!checkAccountNumber(accountNumber))
                System.out.println("Loan Request Rejected : Incorrect account number");

        }
    }

//    private static boolean checkAccountNumber(int accountNumber) {
//        int count = 0;
//        while (accountNumber > 0) {
//            int temp = accountNumber % 10;
//            accountNumber /= 10;    // 51678
//            count++;
//
//            if (count == 4 && temp == 1) return true;
//        }
//        return false;
//    }
    private static boolean checkAccountNumber(int accountNumber) {
        return (accountNumber / 1000) == 1;
    }

}
