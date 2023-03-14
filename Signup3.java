package ASimulationSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener{
    
        JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9, l10,l11,l12,l13;
        JButton b1, b2;
        JRadioButton r1,r2,r3,r4;
        JTextField t1;
        JCheckBox c1,c2,c3,c4,c5,c6,c7;
       // String formno;
        
        Signup3(){
            //this.formno = formno;
            setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");
             
             // label
            l1 = new JLabel("Page 3: Account Details");
            l1.setFont(new Font("Raleway",Font.BOLD,22));
            l1.setBounds(240,30,400,40);
            add(l1);
             
            l2 = new JLabel("Account Type: ");
            l2.setFont(new Font("Raleway",Font.BOLD,18));
            l2.setBounds(90,90,200,30);
            add(l2);
            
            l3 = new JLabel("Card Number: ");
            l3.setFont(new Font("Raleway",Font.BOLD,18));
            l3.setBounds(90,215,200,30);
            add(l3);
            
            l4 = new JLabel("XXXX-XXXX-XXXX-1924");
            l4.setFont(new Font("Raleway",Font.BOLD,18));
            l4.setBounds(330,215,300,30);
            add(l4);
            
            l5 = new JLabel("(Your 16-digit Card number)");
            l5.setFont(new Font("Raleway",Font.BOLD,12));
            l5.setBounds(90,240,200,30);
            add(l5);
            
            l6 = new JLabel("It would appear on ATM/Cheque book and statements ");
            l6.setFont(new Font("Raleway",Font.BOLD,12));
            l6.setBounds(330,240,330,30);
            add(l6);
            
            l7 = new JLabel("PIN: ");
            l7.setFont(new Font("Raleway",Font.BOLD,18));
            l7.setBounds(90,290,200,30);
            add(l7);
            
            l8 = new JLabel("XXXX");
            l8.setFont(new Font("Raleway",Font.BOLD,18));
            l8.setBounds(330,290,200,30);
            add(l8);
             
            l9 = new JLabel("(4-digit password)");
            l9.setFont(new Font("Raleway",Font.BOLD,12));
            l9.setBounds(90,315,200,30);
            add(l9);
            
            l10 = new JLabel("Services Required: ");
            l10.setFont(new Font("Raleway",Font.BOLD,18));
            l10.setBounds(90,360,200,30);
            add(l10);
            
            l11 = new JLabel("Form No: ");
            l11.setFont(new Font("Raleway", Font.BOLD,14));
            l11.setBounds(550,8,70,30);
            add(l11);
            
            l12 = new JLabel();
            l12.setFont(new Font("Raleway", Font.BOLD,14));
            l12.setBounds(600,8,70,30);
            add(l12);
            
            
            
            // check Box 
            
            c1 = new JCheckBox("ATM CARD");
            c1.setBackground(Color.white);
            c1.setBounds(100,400,200,30);
            c1.setFont(new Font("Raleway",Font.BOLD,16));
            add(c1);
            
            c2 = new JCheckBox("Mobile Banking");
            c2.setBackground(Color.white);
            c2.setBounds(100,450,200,30);
            c2.setFont(new Font("Raleway",Font.BOLD,16));
            add(c2);
            
            c3 = new JCheckBox("Cheque Book ");
            c3.setBackground(Color.white);
            c3.setBounds(100,500,200,30);
            c3.setFont(new Font("Raleway",Font.BOLD,16));
            add(c3);
            
            c4 = new JCheckBox("Internet Banking ");
            c4.setBackground(Color.white);
            c4.setBounds(360,400,200,30);
            c4.setFont(new Font("Raleway",Font.BOLD,16));
            add(c4);
            
            c5 = new JCheckBox("EMAIL Alerts");
            c5.setBackground(Color.white);
            c5.setBounds(360,450,200,30);
            c5.setFont(new Font("Raleway",Font.BOLD,16));
            add(c5);
            
            c6 = new JCheckBox("E-Statement");
            c6.setBackground(Color.white);
            c6.setBounds(360,500,200,30);
            c6.setFont(new Font("Raleway",Font.BOLD,16));
            add(c6);
            
            c7 = new JCheckBox("I hereby declares that the above entered details correct to the best of my knowledge", true);
            c7.setBackground(Color.white);
            c7.setBounds(90,565,600,30);
            c7.setFont(new Font("Raleway",Font.BOLD,12));
            add(c7);
            
            
            
            b1  = new JButton("Submit");
            b1.setBounds(250,610, 100, 30);
            b1.setFont(new Font("Raleway",Font.BOLD,14));
            b1.setBackground(Color.BLACK);
            b1.setForeground(Color.white);
            add(b1);
            
            b2  = new JButton("Cancel");
            b2.setBounds(395,610,100,30);
            b2.setBackground(Color.BLACK);
            b2.setForeground(Color.white);
            b2.setFont(new Font("Raleway",Font.BOLD,14));
            add(b2);
            
            
            
            
            
            //radioButton 
            r1 = new JRadioButton("Saving Account");
            r1.setBounds(110,130,150,30);
            r1.setFont(new Font("Raleway",Font.BOLD,16));
            r1.setBackground(Color.white);
            add(r1);
            
            r2 = new JRadioButton("Fixed Deposit Account");
            r2.setBounds(360,130,300,30);
            r2.setFont(new Font("Raleway",Font.BOLD,16));
            r2.setBackground(Color.white);
            add(r2);
            
            r3 = new JRadioButton("Current Account");
            r3.setBounds(110,170,250,30);
            r3.setFont(new Font("Raleway",Font.BOLD,16));
            r3.setBackground(Color.white);
            add(r3);
            
            r4 = new JRadioButton("Recurring Deposit Account");
            r4.setBounds(360,170,250,30);
            r4.setFont(new Font("Raleway",Font.BOLD,16));
            r4.setBackground(Color.white);
            add(r4);
            
            b1.addActionListener(this);
            b2.addActionListener(this);
             
            setLayout(null);
            getContentPane().setBackground(Color.white);
            setBounds(300, 10, 730,750);
            setVisible(true);
        }
        
        public void actionPerformed(ActionEvent ae){
            
           String a = null;
           if(r1.isSelected())
           {
               a = "Saving Account ";
           }
           else if(r2.isSelected()){
               a = "Fixed Deposit Accout";
           }
           else if(r3.isSelected()){
               a = "Current Account";
           }
           else if(r4.isSelected()){
               a = "Reccuring Deposit Account";
           }
            
            Random ran = new Random();
            long first7 = (ran.nextLong() % 9000000L) + 5040936000000000L;
            long first8 = Math.abs(first7);
            
            long first3 = (ran.nextLong() % 9000L) + 1000L;
            long first4 = Math.abs(first3);
            
            String b = "";
            if(c1.isSelected()){
                 b = b+" ATM CARD";
            }
            else if(c2.isSelected()){
                 b = b+" Internet Banking";
            }
            else if(c3.isSelected()){
                 b = b+" Mobile Banking";
            }
            else if(c4.isSelected()){
                 b = b+" EMAIL Alerts";
            }
            else if(c5.isSelected()){
                 b = b+" Cheque Book";
            } 
            else if(c6.isSelected()){
                 b = b+" E-Statement";
            }
            
            try{
                if(ae.getSource() == b1){
                    
                    if(b1.equals("")){
                        JOptionPane.showMessageDialog(null,"Fill all the required fields" );
                    }
                    else{
                        
                        Conn c1 = new Conn();
                        String q1 = "insert into Signup3 values('"+a+"','"+first7+"','"+first8+"','"+b+"')";
                        String q2 = "insert into login values('"+first8+"','"+first4+"')";
                        
                        c1.s.executeUpdate(q1);
                        c1.s.executeUpdate(q2);
                        
                        JOptionPane.showMessageDialog(null,"Card Number: "+first8+ "\n Pin: "+first4);
                        
                        new Deposit("").setVisible(true);
                        setVisible(false);
                    }
                }else if(ae.getSource() == b2){
                    System.exit(0);
                }
            }catch(Exception ex){
                ex.printStackTrace();
            }
            
            
           
        }
        
    public static void main(String[] args) {
        
        Signup3 s = new Signup3();
        s.setVisible(true);
    }
    
    
}
