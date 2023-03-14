
package ASimulationSystem;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

import java.util.*;

public class Signup extends JFrame implements ActionListener {
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9, l10,l11,l12,l13,l14,l15;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JRadioButton r1,r2,r3,r4,r5;
    JButton b;
    JComboBox c1 , c2, c3;
    
    String day[] = new String[31];
    String month[] = new String[12];
    String year[] = new String[26];

//    JDateChooser dateChooser;
    
    
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L ) + 1000L;
    String first = "" + Math.abs(first4);
    
    
    Signup(){
        
        setTitle("NEW ACCOUNT APPLICATION FORM");
        
//        
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ASimulation/src/logo.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel l11 = new JLabel(i3);
//        l11.setBounds(70,10,100,100);
//        add(l11);
        
        l1 = new JLabel("Application Form No: "+first);
        l1.setFont( new Font("Raleway", Font.BOLD, 38));
        l1.setBounds(140,20,550,40);
        add(l1);
        
        
        l2 = new JLabel("Page 1: Personal Details ");
        l2.setFont( new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(290,80,550,30);
        add(l2);
        
        l3 = new JLabel("Name: ");
        l3.setFont( new Font("Raleway", Font.BOLD, 20));
        l3.setBounds(100,140,100,30);
        add(l3);
        
        t1 = new JTextField();
        t1.setBounds(300,140,400,30);
        t1.setFont( new Font("Raleway", Font.BOLD, 14));
        add(t1);
        
        
        l4 = new JLabel("Father's Name: ");
        l4.setFont( new Font("Raleway", Font.BOLD, 20));
        l4.setBounds(100,190,200,30);
        add(l4);
        
        t2 = new JTextField();
        t2.setBounds(300,190,400,30);
        t2.setFont( new Font("Raleway", Font.BOLD, 14));
        add(t2);
        
        l5 = new JLabel("Date Of Birth: ");
        l5.setFont( new Font("Raleway", Font.BOLD, 20));
        l5.setBounds(100,240,200,30);
        add(l5);
        // gender start 
        l6 = new JLabel("Gender: ");
        l6.setFont( new Font("Raleway", Font.BOLD, 20));
        l6.setBounds(100,290,200,30);
        add(l6);
        
        
        r1 = new JRadioButton("Male");
        r1.setFont( new Font("Raleway", Font.BOLD, 18));
        r1.setBackground(Color.white);
        r1.setBounds(299,290,200,30);
        add(r1);
        
        r2 = new JRadioButton("Female");
        r2.setFont( new Font("Raleway", Font.BOLD, 18));
        r2.setBackground(Color.white);
        r2.setBounds(600,290,200,30);
        add(r2);
        
        ButtonGroup groupGender = new ButtonGroup();
        groupGender.add(r1);
        groupGender.add(r2);
        // gender end 
        
        
        // email start 
        l7 = new JLabel("Email Address: ");
        l7.setFont( new Font("Raleway", Font.BOLD, 18));
        l7.setBounds(100,340,200,30);
        add(l7);
        
        t3 = new JTextField();
        t3.setFont( new Font("Raleway", Font.BOLD, 14));
        t3.setBounds(300, 340, 400, 30);
        add(t3);
        // email end 
        
        // martial start 
        
        l8 = new JLabel("Marital Status: ");
        l8.setFont( new Font("Raleway", Font.BOLD, 18));
        l8.setBounds(100,390,200, 30);
        add(l8);
        
         
        r3 = new JRadioButton("Married");
        r3.setFont( new Font("Raleway", Font.BOLD, 18));
        r3.setBackground(Color.white);
        r3.setBounds(299,390,200,30);
        add(r3);
        
        r4 = new JRadioButton("Unmarried");
        r4.setFont( new Font("Raleway", Font.BOLD, 18));
        r4.setBackground(Color.white);
        r4.setBounds(420,390,200,30);
        add(r4);

        
        r5 = new JRadioButton("Other");
        r5.setFont( new Font("Raleway", Font.BOLD, 18));
        r5.setBackground(Color.white);
        r5.setBounds(600,390,200,30);
        add(r5);


        ButtonGroup groupstatus = new ButtonGroup();
        groupstatus.add(r3);
        groupstatus.add(r4);
        groupstatus.add(r4);
        // end marital 

        // start address 

        l9 = new JLabel("Address: ");
        l9.setFont( new Font("Raleway", Font.BOLD, 18));
        l9.setBounds(100, 440, 200, 30);
        add(l9);


        t4 = new JTextField();
        t4.setFont( new Font("Raleway", Font.BOLD, 14));
        t4.setBounds(300, 440, 400, 30);
        add(t4);
        
        //city
        l10 = new JLabel("City: ");
        l10.setFont( new Font("Raleway", Font.BOLD, 18));
        l10.setBounds(100, 490, 200, 30);
        add(l10);


        t5 = new JTextField();
        t5.setFont( new Font("Raleway", Font.BOLD, 14));
        t5.setBounds(300, 490, 400, 30);
        add(t5);

        // pin code 
        l11 = new JLabel("Pin Code: ");
        l11.setFont( new Font("Raleway", Font.BOLD, 18));
        l11.setBounds(100, 540, 200, 30);
        add(l11);

        t6 = new JTextField();
        t6.setFont( new Font("Raleway", Font.BOLD, 14));
        t6.setBounds(300, 540, 400, 30);
        add(t6);
        
        // state 
         l12 = new JLabel("State : ");
        l12.setFont( new Font("Raleway", Font.BOLD, 18));
        l12.setBounds(100, 590, 200, 30);
        add(l12);

        t7 = new JTextField();
        t7.setFont( new Font("Raleway", Font.BOLD, 14));
        t7.setBounds(300, 590, 400, 30);
        add(t7);


        // date of births 
        for (int i = 1; i < 31; i++) {
            day[i-1] = String.valueOf(i);
        }
        c1 = new JComboBox(day);
        c1.setBounds(335,240, 60,30);
        add(c1);
        
        l13 = new JLabel("Day");
        l13.setFont( new Font("Raleway", Font.BOLD, 17));
        l13.setBounds(300, 235, 70, 40);
        add(l13);
        
        for (int i = 1; i < 12; i++) {
            month[i-1] = String.valueOf(i);
        }
        c2 = new JComboBox(month);
        c2.setBounds(490,240, 60,30);
        add(c2);
        
        l14 = new JLabel("Month");
        l14.setFont( new Font("Raleway", Font.BOLD, 17));
        l14.setBounds(435, 235, 70, 40);
        add(l14);
        
        for (int i = 1990; i < 2015; i++) {
            year[i-1990] = String.valueOf(i);
        }
        
        c3 = new JComboBox(year);
        c3.setBounds(638,240, 60,30);
        add(c3);
        
        l15 = new JLabel("Year");
        l15.setFont( new Font("Raleway", Font.BOLD, 17));
        l15.setBounds(600, 235, 70, 40);
        add(l15);
        
        // Button 
         
        b = new JButton("Next");
        b.setFont( new Font("Raleway", Font.BOLD, 17));
        b.setBackground(Color.black);
        b.setForeground(Color.white);
        b.setBounds(620,660,80,30);
        add(b);

        b.addActionListener(this);
        
        setLayout(null);
        getContentPane().setBackground(Color.white);
        setBounds(300, 30, 830,790);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        //String formno = first;
        String a = t1.getText();
        String b = t2.getText();
        
        String ac = (String)c1.getSelectedItem();
        String bc = (String)c2.getSelectedItem();
        String cc = (String)c3.getSelectedItem();
        
        String d = null;
        
        if(r1.isSelected()){
            d = "Male";
        }else if(r2.isSelected()){
            d = "Female";
        }
        String e = t3.getText();
        String f = null;
        
        if(r3.isSelected()){
            f = "Married";
        }
        else if(r4.isSelected()){
            f = "Unmarried";
        }
        else
        {
            f = "Other";
        }
        
         String g = t4.getText(); 
         String h = t5.getText();
         String i = t6.getText();
         String j = t7.getText();
        
         try{
             
             if(t6.getText().equals("")){
                 JOptionPane.showMessageDialog(null,"Fill all the required fields");
             }
             else{
                 Conn c1 = new Conn();
                 String q1 = "insert into signup values('"+a+"','"+b+"',"
                         + "'"+ac+"','"+bc+"','"+cc+"','"+d+"','"+e+"','"+f+"'"
                         + ",'"+g+"','"+h+"''"+i+"','"+j+"')";
                 c1.s.executeUpdate(q1);
                 
                 new Signup2().setVisible(true);
                 setVisible(false);
             }
             
         }catch(Exception ex){
             ex.printStackTrace();
         }
    }
    
    public static void main(String[] args) {
        
        Signup s = new Signup();
        s.setVisible(true);
    }

   
}
