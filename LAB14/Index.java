package LAB14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Index extends JFrame implements ActionListener {
    JButton add,remove,update,view;
    JLabel l1;
    public void actionPerformed(ActionEvent ae){
        try{
            if(ae.getSource()==add){
                new AddEmployee().setVisible(true);
                setVisible(false);
            }else if (ae.getSource()==remove){
                new DeleteEmployee().setVisible(true);
                setVisible(false);
            }else if(ae.getSource()==view){
                new ViewEmployee().setVisible(true);
                setVisible(false);
            }else if(ae.getSource()==update){
                new UpdateEmployee().setVisible(true);
                setVisible(false);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    Index(){
        setTitle("EMPLOYEE MANAGEMENT SYSTEM");
        setLayout(null);
        l1 = new JLabel("Manage Employees");
        l1.setFont(new Font("Osward",Font.BOLD,22));
        l1.setBounds(260,40,450,40);
        add(l1);

        add = new JButton("Add Employee");
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.setBounds(150,120,150,80);
        add(add);

        remove = new JButton("Remove Employee");
        remove.setBackground(Color.BLACK);
        remove.setForeground(Color.WHITE);
        remove.setBounds(450,120,150,80);
        add(remove);

        update = new JButton("Update Employee");
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.setBounds(150,280,150,80);
        add(update);

        view = new JButton("View Employee List");
        view.setBackground(Color.BLACK);
        view.setForeground(Color.WHITE);
        view.setBounds(450,280,150,80);
        add(view);

        add.addActionListener(this);
        remove.addActionListener(this);
        update.addActionListener(this);
        view.addActionListener(this);


        getContentPane().setBackground(Color.WHITE);

        setSize(800, 480);
        setLocation(450, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        Index i = new Index();
    }
}
