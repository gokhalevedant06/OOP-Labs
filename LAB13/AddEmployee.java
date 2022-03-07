package LAB13;

import java.sql.SQLException;

public class AddEmployee {
    int id;
    String name;
    String city;
    int number;

    AddEmployee(int id,String name,String city, int number) throws SQLException {
        setCity(city);
        setId(id);
        setNumber(number);
        setName(name);

        Conn c2 = new Conn();
        String query = "insert into Employee values('" + getId() + "','" + getName() + "','" + getCity() + "','" + getNumber() + "')";
        c2.s.executeUpdate(query);
        System.out.println("New Employee Added");

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
