package LAB14;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewEmployee extends JFrame implements ActionListener {


    JButton back;
    JTable employeeDetails;
    JLabel tableTitle;

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){
            new Index().setVisible(true);
            setVisible(false);
        }
    }
    ViewEmployee(){
        setTitle("EMPLOYEE MANAGEMENT SYSTEM");
        setLayout(null);


        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(20, 10, 100, 40);
        add(back);
        back.addActionListener(this);

        tableTitle = new JLabel("Employee Details");
        tableTitle.setFont(new Font("Osward", Font.BOLD, 30));
        tableTitle.setBounds(580, 40, 600, 40);
        add(tableTitle);


        String[][] data = {{"1000", "Vedant", "Pune", "12312"}
        };
        String[] column = {"ID", "Name", "City", "ContactNumber"};


        employeeDetails = new JTable(data, column);
        employeeDetails.setBounds(50, 100, 1400, 600);
        employeeDetails.setBackground(Color.darkGray);
        employeeDetails.setGridColor(Color.white);
        employeeDetails.setForeground(Color.white);
        employeeDetails.setRowHeight(40);

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(column);
        employeeDetails.setModel(model);


        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> id = new ArrayList<>();
        ArrayList<Integer> number = new ArrayList<>();
        ArrayList<String> city = new ArrayList<>();


        int count = 0;
        try {
            Conn c1 = new Conn();
            ResultSet rs = c1.s.executeQuery("SELECT * FROM employee" );
            String name = null;
            while (rs.next()) {
                names.add(rs.getString(2));
                id.add(rs.getInt(1));
                city.add(rs.getString(3));
                number.add(rs.getInt(4));
                count++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        for (int i = 0; i < count; i++) {
            String[] rowData = { String.valueOf(id.get(i)),names.get(i), city.get(i), String.valueOf(number.get(i)) };
            model.addRow(rowData);
        }

        add(employeeDetails);

        getContentPane().setBackground(Color.WHITE);

        setSize(1510, 840);
        setLocation(10, 10);
        setVisible(true);
    }


}
