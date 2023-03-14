
package ASimulationSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class WithDrawl extends JFrame implements ActionListener{
    
    JTextField t1,t2,t3;
    JButton b1, b2,b3;
    JLabel l1,l2,l3,l4;
    String pin;
    
    WithDrawl(String pin){
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ASimulationSystem/ATM3.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100,700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l4 = new JLabel(i3);
        l4.setBounds(0, 0, 1100, 700);
        add(l4);
        
        
        l1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        l1.setFont(new Font("System",Font.BOLD,20));
        l1.setForeground(Color.cyan);
        l1.setBounds(335, 140, 500 ,35);
        l4.add(l1);
        
        l2 = new JLabel("MAXIMUM WITHDRAWL IS TAKA.10,000/=");
        l2.setFont(new Font("System",Font.BOLD,25));
        l2.setForeground(Color.white);
        l2.setBounds(300, 80, 500 ,35);
        l4.add(l2);
        
        l3 = new JLabel("Enter Pin: ");
        l3.setFont(new Font("Raleway",Font.BOLD,15));
        l3.setForeground(Color.cyan);
        l3.setBounds(900,20,80,30);
        l4.add(l3);
        
        
        t1 = new JTextField();
        t1.setFont(new Font("Raleway",Font.BOLD,22));
        t1.setBounds(365,200,355,30);
        l4.add(t1);
        
        t2 = new JTextField();
        t2.setFont(new Font("Raleway",Font.BOLD,22));
        t2.setBounds(980,20,50,30);
        l4.add(t2);
        
        b1 = new JButton("WITHDRAWL");
        b1.setForeground(Color.black);
        b1.setBackground(Color.white);
        b1.setFont(new Font("Raleway",Font.BOLD,16));
        b1.setBounds(365,280,160,30);
        l4.add(b1);
        
        b2 = new JButton("BACK");
        b2.setForeground(Color.black);
        b2.setBackground(Color.white);
        b2.setFont(new Font("Raleway",Font.BOLD,16));
        b2.setBounds(560,280,160,30);
        l4.add(b2);
        
        
        b3 = new JButton("EXIT");
        b3.setForeground(Color.black);
        b3.setBackground(Color.white);
        b3.setFont(new Font("Raleway",Font.BOLD,16));
        b3.setBounds(470,350,170,30);
        l4.add(b3);
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);


        
        setBounds(200,5,1100,700);
        setLayout(null);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
            
        try{
            String a = t1.getText();
            String b = t2.getText();
            
            
            if(ae.getSource() == b1)
            {
                if(t1.getText().equals("")){
                    
                JOptionPane.showMessageDialog(null, "Enter The Amount You Want To WithDrawl");
            }
            else {
                Conn c1 = new Conn();
                
                ResultSet rs = c1.s.executeQuery("select * From bank where pin = '"+b+"'");
                double balance = 0;
                if(rs.next()){
                    String pin = rs.getString("pin");
                    balance = rs.getDouble("balance");
                    
                    double d = Double.parseDouble(a);
                    balance -= d;
                    String q1 = "insert into bank values('"+pin+"','"+d+"','"+balance+"')";
                    c1.s.executeUpdate(q1);
                }
                
                
                JOptionPane.showMessageDialog(null,"Taka. "+a+" Debited Succeessfully");
                
                new Transactions(pin).setVisible(true);
                setVisible(false);
            
        }
            }
         else if(ae.getSource()== b2){
                    new Transactions(pin).setVisible(true);
                    setVisible(false);
                    }
         else if (ae.getSource()==b3){
             System.exit(0);
         }
            
            
        
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    
    public static void main(String[] args) {
        
        
       new WithDrawl("").setVisible(true);
       
    }
  
    
}
