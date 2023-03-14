
package ASimulationSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Pin extends JFrame implements ActionListener{
    
    JPasswordField t1,t2,t3;
    JButton b1,b2;                               
    JLabel l1,l2,l3,l4,l5;
    String pin;
    
    Pin( String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ASimulationSystem/Pin.png"));
        Image i2 = i1.getImage().getScaledInstance(1100,680,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l5 = new JLabel(i3);
        l5.setBounds(0, 0, 1100,680);
        add(l5);
        
        l1 = new JLabel("CHANGE YOUR PIN");
        l1.setForeground(Color.black);
        l1.setFont(new Font("System", Font.BOLD, 20));
        //l1.setForeground(Color.WHITE);
        
//        l2 = new JLabel("Current Pin: ");
//        l2.setForeground(Color.BLACK);
//        l2.setFont(new Font("System", Font.BOLD, 20));
//        //l2.setForeground(Color.WHITE);
        
        
        l2 = new JLabel("New PIN:");
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("System", Font.BOLD, 20));
        //l3.setForeground(Color.WHITE);
        
        l3 = new JLabel("Re-Enter New PIN:");
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("System", Font.BOLD, 20));
        //l4.setForeground(Color.WHITE);
        
        t1 = new JPasswordField();
        t1.setBackground(Color.gray);
        t1.setForeground(Color.white);
        t1.setFont(new Font("Raleway", Font.BOLD, 25));
        
        t2 = new JPasswordField();
        t2.setBackground(Color.gray);
        t2.setForeground(Color.white);
        t2.setFont(new Font("Raleway", Font.BOLD, 25));
        
//        t3 = new JPasswordField();
//        t3.setBackground(Color.gray);
//        t3.setForeground(Color.white);
//        t3.setFont(new Font("Raleway", Font.BOLD, 25));
        
        b1 = new JButton("CHANGE");
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        
        b2 = new JButton("BACK");
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        setLayout(null);
        
        l1.setBounds(200,90,800,35);
        l5.add(l1);
        
        l2.setBounds(80,150,150,35);
        l5.add(l2);
        
        l3.setBounds(80,210,200,35);
        l5.add(l3);
        
//        l4.setBounds(80,270,200,35);
//        l5.add(l4);
//        
        t1.setBounds(310,155,230,30);
        l5.add(t1);
        
        
        t2.setBounds(310,210,230,30);
        l5.add(t2);
        
//        t3.setBounds(310,270,230,30);
//        l5.add(t3);
        
        b1.setBounds(170,345,150,35);
        l5.add(b1);
        
        b2.setBounds(360,345,150,35);
        l5.add(b2);
        
        setLayout(null);
        setSize(1100,700);
        setLocation(200,0);
        //setUndecorated(true);
        setVisible(true);        
        
    }
     public void actionPerformed(ActionEvent ae){
        try{        
            String npin = t1.getText();
            String rpin = t2.getText();
            
            if(!npin.equals(rpin)){
                JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                return;
            }
            
            if(ae.getSource()==b1){
                if (t1.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Enter New PIN");
                }
                if (t2.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Re-Enter new PIN");
                }
                
                Conn c1 = new Conn();
                String q1 = "update bank set pin = '"+rpin+"' where pin = '"+pin+"' ";
                String q2 = "update login set pin = '"+rpin+"' where pin = '"+pin+"' ";
                String q3 = "update signup3 set pin = '"+rpin+"' where pin = '"+pin+"' ";

                c1.s.executeUpdate(q1);
                c1.s.executeUpdate(q2);
                c1.s.executeUpdate(q3);

                JOptionPane.showMessageDialog(null, "PIN changed successfully");
                setVisible(false);
                new Transactions(rpin).setVisible(true);
            
            }else if(ae.getSource()==b2){
                new Transactions(pin).setVisible(true);
                setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    
    public static void main(String[] args) {
        new Pin("").setVisible(true);
        
    }

    
}
