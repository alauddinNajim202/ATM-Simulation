
package ASimulationSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class Transactions extends JFrame {
    
    JLabel l1 ;
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    
    
    Transactions( String pin){
        
        this.pin = pin;

        setTitle("TRANSACTION");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ASimulationSystem/atm-background.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100,700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l2 = new JLabel(i3);
        l2.setBounds(0, 0, 1100, 700);
        add(l2);
        
        
        l1 = new JLabel("Please select your Transaction");
        l1.setForeground(Color.cyan);
        l1.setBounds(580,50,650,35);
        l1.setFont(new Font("System",Font.BOLD,24));
        l2.add(l1);
        
        b1 = new JButton("DEPOSIT");
        b1.setBounds(500, 150, 200, 35);
        b1.setFont(new Font("System",Font.BOLD,14));
        b1.setBackground(Color.white);
        b1.setForeground(Color.black);
        l2.add(b1);
        
        b2 = new JButton("CASH WITHDRAWL");
        b2.setBounds(800, 150, 200, 35);
        b2.setFont(new Font("System",Font.BOLD,14));
        b2.setBackground(Color.white);
        b2.setForeground(Color.black);
        l2.add(b2);
        
        
        b3 = new JButton("FAST CASH");
        b3.setBounds(500, 220, 200, 35);
        b3.setFont(new Font("System",Font.BOLD,14));
        b3.setBackground(Color.white);
        b3.setForeground(Color.black);
        l2.add(b3);
        
        
        b4 = new JButton("MINI STATEMENT");
        b4.setBounds(800, 220, 200, 35);
        b4.setFont(new Font("System",Font.BOLD,14));
        b4.setBackground(Color.white);
        b4.setForeground(Color.black);
        l2.add(b4);
        
        b5 = new JButton("PIN CHANGE");
        b5.setBounds(500, 300, 200, 35);
        b5.setFont(new Font("System",Font.BOLD,14));
        b5.setBackground(Color.white);
        b5.setForeground(Color.black);
        l2.add(b5);
        
        
        b6 = new JButton("BALANCE ENQUIRY");
        b6.setBounds(800, 300, 200, 35);
        b6.setFont(new Font("System",Font.BOLD,14));
        b6.setBackground(Color.white);
        b6.setForeground(Color.black);
        l2.add(b6);
        
        
        b7 = new JButton("EXIT");
        b7.setBounds(650,380, 200, 35);
        b7.setFont(new Font("System",Font.BOLD,14));
        b7.setBackground(Color.white);
        b7.setForeground(Color.black);
        l2.add(b7);
        
//        b1.addActionListener(this);
//        b2.addActionListener(this);
//        b3.addActionListener(this);
//        b4.addActionListener(this);
//        b5.addActionListener(this);
//        b6.addActionListener(this);
//        b7.addActionListener(this);
//      

        
        
        setBounds(200,5,1100,700);
        setLayout(null);
        setVisible(true);
        
    }
    
//    public void actionPerformed( ActionEvent ae){
//        
//        if(ae.getSource() == b1 ){
//            
//            new Deposit().setVisible(true);
//            setVisible(false);
//        }
//        else if(ae.getSource() == b2){
//            new WithDrawl().setVisible(true);
//            setVisible(false);
//            
//        }
//        else if(ae.getSource() == b3){
//            new FastCash().setVisible(true);
//              setVisible(false);
//        }
//        else if(ae.getSource()== b4){
//            new Login().setVisible(true);
//            setVisible(false);
//        }
//        else if (ae.getSource()== b5){
//            new Pin().setVisible(true);
//            setVisible(false);
//        }
//        else if(ae.getSource() == b6){
//            
//            String pinn = JOptionPane.showInputDialog("Enter Pin: ");
//            Conn c1 = new Conn();
//            
//            try{
//                
//                ResultSet rs = c1.s.executeQuery("SELECT balance FROM Bank ORDER BY pin = '"+pinn+"' DESC LIMIT 1");
//                if(rs.next()){
//                    String balance = rs.getString("balance");
//                    JOptionPane.showMessageDialog(null,"Your Account Balance is: "+balance);
//                }
//            }catch(Exception e){
//                e.printStackTrace();
//            }
//            
//        }
//    }
    
    public static void main(String[] args) {
        new Transactions("").setVisible(true);
    }
}
