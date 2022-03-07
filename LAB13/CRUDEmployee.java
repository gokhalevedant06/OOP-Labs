package LAB13;

import java.sql.SQLException;
import java.util.Scanner;

public class CRUDEmployee {
    public static void main(String[] args) throws SQLException {
        Scanner input = new Scanner(System.in);
        int n;
        int id;
        String name;
        String city;
        int contact;
        do {
            System.out.println("1. Add Employee ");
            System.out.println("2. Delete Employee ");
            System.out.println("3. Update Employee ");
            System.out.println("4. View Employee ");
            System.out.println("5. Exit ");
            n = input.nextInt();
            if (n == 1) {
                System.out.print("Enter employee ID: ");
                id = input.nextInt();
                System.out.print("Enter employee Name: ");
                name = input.next();
                System.out.print("Enter employee City: ");
                city = input.next();
                System.out.print("Enter employee Contact: ");
                contact = input.nextInt();
                AddEmployee a = new AddEmployee(id, name, city, contact);
            } else if (n == 2) {
                System.out.print("Enter ID of Employee: ");
                id = input.nextInt();
                RemoveEmployee r = new RemoveEmployee(id);
            } else if (n == 3) {
                System.out.print("Enter employee ID: ");
                id = input.nextInt();
                System.out.print("Enter employee Name: ");
                name = input.next();
                System.out.print("Enter employee City: ");
                city = input.next();
                System.out.print("Enter employee Contact: ");
                contact = input.nextInt();
                UpdateEmployee u = new UpdateEmployee(id, name, city, contact);
            } else if (n == 4) {
                System.out.println("Employee Details");
                ViewEmployee v = new ViewEmployee();
            } else {
                n = 5;
            }
        } while (n != 5);
    }
}
