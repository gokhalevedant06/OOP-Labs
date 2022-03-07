package LAB13;

import java.sql.ResultSet;

public class ViewEmployee {
    ViewEmployee() {
        try {
            Conn c1 = new Conn();
            ResultSet rs = c1.s.executeQuery("SELECT * FROM Employee");
            int i = 1;
            while (rs.next()) {
                System.out.println("Employee Number " + i);
                System.out.print("ID: " + rs.getInt(1));
                System.out.println();
                System.out.print("Name: " + rs.getString(2));
                System.out.println();
                System.out.print("Pune: " + rs.getString(3));
                System.out.println();
                System.out.print("Contact Number: " + rs.getInt(4));
                System.out.println();
                System.out.println();
                i++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
