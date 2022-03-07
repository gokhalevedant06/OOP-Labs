package LAB13;

import java.sql.SQLException;

public class RemoveEmployee {
    RemoveEmployee(int id) throws SQLException {
        Conn c2 = new Conn();
        String query = "DELETE FROM Employee where ID = " + id + "";
        c2.s.executeUpdate(query);
        System.out.println("Employee Record Deleted");
    }
}
