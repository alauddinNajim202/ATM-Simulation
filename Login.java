
package ASimulationSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class Login extends JFrame implements ActionListener {

    JLabel l1, l2, l3,background;
    JTextField tf1;
    JPasswordField pf2;
    JButton b1,b2,b3;
    JLabel imgLabel;
    ImageIcon img;
    
    Login(){
        
        setTitle("AUTOMATED TELLER MACHINE");
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ASimulationSystem/ATM1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800,550, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l22 = new JLabel(i3);
        l22.setBounds(0, 0, 800, 550);
        add(l22);
        
        
        
       
        
        l1 = new JLabel("WELCOME TO ATM");
        l1.setForeground(Color.cyan);
        l1.setBounds(180,50,350,40);
        l1.setFont(new Font("Osward", Font.BOLD,30));
        l22.add(l1);
        
       
        
        l2 = new JLabel("Card No : ");
        l2.setForeground(Color.cyan);
        l2.setBounds(110,150,350,30);
        l2.setFont(new Font("Osward", Font.BOLD,22));
        l22.add(l2);
        
        
        tf1 = new JTextField();
        tf1.setBounds(250,150,230,30);
        tf1.setBackground(Color.white);
        tf1.setForeground(Color.black);
        tf1.setFont(new Font("Arial", Font.BOLD,18));
        l22.add(tf1);
            
        l3 = new JLabel("PIN : ");
        l3.setBounds(110,210,350,30);
        l3.setForeground(Color.cyan);
        l3.setFont(new Font("Raleway", Font.BOLD,22));
        l22.add(l3);
        
        pf2 = new JPasswordField();
        pf2.setBounds(250,210,230,30);
        pf2.setBackground(Color.white);
        pf2.setForeground(Color.black);
        pf2.setFont(new Font("Arial", Font.BOLD,18));
        l22.add(pf2);
        
        b1 = new JButton("SIGN IN");
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.setBounds(250, 300,90,30);
        b1.setFont(new Font("Arial", Font.BOLD,13));
        l22.add(b1);
        
        
        b2 = new JButton("CLEAR");
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setBounds(388, 300,90,30);
        b2.setFont(new Font("Arial", Font.BOLD,13));
        l22.add(b2);
        
        
        b3 = new JButton("SIGN UP");
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        b3.setBounds(250, 350,230,30);
        b3.setFont(new Font("Arial", Font.BOLD,13));
        l22.add(b3);
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        setLayout(null);
        //getContentPane().setBackground(Color.pink);
        setBounds(360, 150,800, 550);
        setVisible(true);
        
        
        
    }
   
    public void actionPerformed(ActionEvent ae){
        try{        
            if(ae.getSource()==b1){
                Conn c1 = new Conn();
                String cardno  = tf1.getText();
                String pin  = pf2.getText();
                String q  = "select * from login where cardno = '"+cardno+"' and pin = '"+pin+"'";

                ResultSet rs = c1.s.executeQuery(q);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pin).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }
            }else if(ae.getSource()==b2){
                tf1.setText("");
                pf2.setText("");
            }else if(ae.getSource()==b3){
                setVisible(false);
                new Signup().setVisible(true);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        
        
        Login lg = new Login();
        lg.setVisible(true);
        lg.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
        
        
        
    }
  
    


}
