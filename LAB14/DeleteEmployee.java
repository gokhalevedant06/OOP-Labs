package LAB14;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DeleteEmployee extends JFrame implements ActionListener {
    JButton back,remove;
    JLabel tableTitle,id;
    JTextField idTF;
    JTable employeeDetails;
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == remove) {
            try {
                Conn c1 = new Conn();
                String id = idTF.getText();
                String query = "DELETE FROM employee where ID = " + id + "";
                c1.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, " Employee Record Deleted");
                System.out.println("Employee Removed");
            } catch (Exception e) {
                System.out.println(e);
            }
        }else if(ae.getSource()==back){
            new Index().setVisible(true);
            setVisible(false);
        }
    }

    DeleteEmployee(){
        setTitle("EMPLOYEE MANAGEMENT SYSTEM");
        Conn c1 = new Conn();
        setLayout(null);


        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(20, 10, 100, 40);
        add(back);
        back.addActionListener(this);

        tableTitle = new JLabel("Delete From Record");
        tableTitle.setFont(new Font("Osward", Font.BOLD, 30));
        tableTitle.setBounds(500, 40, 600, 40);
        add(tableTitle);

        id = new JLabel("Enter ID");
        id.setFont(new Font("Osward", Font.BOLD, 20));
        id.setBounds(50, 120, 600, 40);
        add(id);

        idTF = new JTextField(15);
        idTF.setBounds(250, 125, 230, 30);
        idTF.setFont(new Font("Arial", Font.BOLD, 14));
        add(idTF);

        remove = new JButton("Remove");
        remove.setBackground(Color.BLACK);
        remove.setForeground(Color.WHITE);
        remove.setBounds(500, 125, 100, 30);
        add(remove);

        remove.addActionListener(this);


        String[][] data = {{"1000", "Vedant", "Pune", "12312"}
        };
        String[] column = {"ID", "Name", "City", "ContactNumber"};


        employeeDetails = new JTable(data, column);
        employeeDetails.setBounds(50, 200, 1400, 550);
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
