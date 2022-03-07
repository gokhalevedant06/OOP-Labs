package LAB14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateEmployee extends JFrame implements ActionListener {
    JLabel WindowTitle, employeeName, employeeID, employeeCity, employeeContact;
    JButton updateEmployee, back;
    JTextField employeeNameTF, employeeIDTF, employeeCityTF, employeeContactTF;
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == updateEmployee) {
            try {
                String name = employeeNameTF.getText();
                int id = Integer.parseInt(employeeIDTF.getText());
                int number = Integer.parseInt(employeeContactTF.getText());
                String city = employeeCityTF.getText();

                Conn c2 = new Conn();
                String query = "UPDATE employee SET Name = '" + name + "',City = '" + city + "',PhoneNumber = '" + number + "'WHERE ID = '"+id+"';";
                c2.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Record Updated");
                System.out.println("Record Updated");

            } catch (Exception e) {
                System.out.println(e);
            }
        }else if(ae.getSource()==back){
            new Index().setVisible(true);
            setVisible(false);
        }
    }
    UpdateEmployee(){
        setTitle("EMPLOYEE MANAGEMENT SYSTEM");
        setLayout(null);
        WindowTitle = new JLabel("Update Employee - Fill Details");
        WindowTitle.setFont(new Font("Osward", Font.BOLD, 30));
        WindowTitle.setBounds(450, 40, 600, 40);
        add(WindowTitle);

        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(20, 10, 100, 40);
        add(back);
        back.addActionListener(this);

        employeeID = new JLabel("Enter ID");
        employeeID.setFont(new Font("Raleway", Font.BOLD, 20));
        employeeID.setBounds(50, 120, 450, 40);
        add(employeeID);

        employeeIDTF = new JTextField(15);
        employeeIDTF.setBounds(300, 120, 230, 40);
        employeeIDTF.setFont(new Font("Arial", Font.BOLD, 14));
        add(employeeIDTF);

        employeeName = new JLabel("Enter Name");
        employeeName.setFont(new Font("Raleway", Font.BOLD, 20));
        employeeName.setBounds(50, 180, 450, 40);
        add(employeeName);

        employeeNameTF = new JTextField(15);
        employeeNameTF.setBounds(300, 180, 230, 40);
        employeeNameTF.setFont(new Font("Arial", Font.BOLD, 14));
        add(employeeNameTF);



        employeeCity = new JLabel("Enter City");
        employeeCity.setFont(new Font("Raleway", Font.BOLD, 20));
        employeeCity.setBounds(50, 240, 450, 40);
        add(employeeCity);

        employeeCityTF = new JTextField(15);
        employeeCityTF.setBounds(300, 240, 230, 40);
        employeeCityTF.setFont(new Font("Arial", Font.BOLD, 14));
        add(employeeCityTF);

        employeeContact = new JLabel("Enter Contact Number");
        employeeContact.setFont(new Font("Raleway", Font.BOLD, 20));
        employeeContact.setBounds(50, 300, 450, 40);
        add(employeeContact);

        employeeContactTF = new JTextField(15);
        employeeContactTF.setBounds(300, 300, 230, 40);
        employeeContactTF.setFont(new Font("Arial", Font.BOLD, 14));
        add(employeeContactTF);

        updateEmployee = new JButton("Update Details");
        updateEmployee.setBackground(Color.BLACK);
        updateEmployee.setForeground(Color.WHITE);
        updateEmployee.setBounds(140, 400, 250, 45);
        add(updateEmployee);

        updateEmployee.addActionListener(this);
        getContentPane().setBackground(Color.WHITE);

        setSize(1510, 840);
        setLocation(10, 10);
        setVisible(true);
    }


}
