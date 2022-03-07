package LAB13;

import java.sql.SQLException;

public class UpdateEmployee {
    UpdateEmployee(int id,String name,String city, int number) throws SQLException {
        Conn c2 = new Conn();
        String query = "UPDATE Employee SET Name = '"+name+"', City = '"+city+"', PhoneNumber = '"+number+"' WHERE ID = '"+id+"';";
        c2.s.executeUpdate(query);
        System.out.println("Employee Record Updated");
    }
}
