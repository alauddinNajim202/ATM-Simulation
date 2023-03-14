
package ASimulationSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class Signup2 extends JFrame implements ActionListener {
    
        JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9, l10,l11,l12,l13;
        JButton b;
        JRadioButton r1,r2,r3,r4;
        JTextField t1,t2;
        JComboBox c1,c2,c3,c4,c5;
        
        
        Signup2(){
            
            setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
            
            l1 = new JLabel("Page 2: Additonal Details");
            l1.setFont(new Font("Raleway",Font.BOLD, 22));
            l1.setBounds(280,30,600,40);
            add(l1);
            //end l1
            
            // start religion 
            //label 
            l2 = new JLabel("Religion: ");
            l2.setBounds(100,120,100,30);
            l2.setFont(new Font("Raleway",Font.BOLD, 18));
            add(l2);
            
            l3 = new JLabel("Category: ");
            l3.setBounds(100,170,100,30);
            l3.setFont(new Font("Raleway",Font.BOLD, 18));
            add(l3);
            
            l4 = new JLabel("Income: ");
            l4.setBounds(100,220,100,30);
            l4.setFont(new Font("Raleway",Font.BOLD, 18));
            add(l4);
            
            l5 = new JLabel("Educational ");
            l5.setBounds(100,268,150,30);
            l5.setFont(new Font("Raleway",Font.BOLD, 18));
            add(l5);
            
            l11 = new JLabel("Qualification: ");
            l11.setBounds(100,288,150,30);
            l11.setFont(new Font("Raleway",Font.BOLD, 18));
            add(l11);
            
            l6 = new JLabel("Occupation: ");
            l6.setBounds(100,326,150,30);
            l6.setFont(new Font("Raleway",Font.BOLD, 18));
            add(l6);
            
            l7 = new JLabel("PAN Number: ");
            l7.setBounds(100,376,150,30);
            l7.setFont(new Font("Raleway",Font.BOLD, 18));
            add(l7);
            
            t1 = new JTextField();
            t1.setFont(new Font("Raleway",Font.BOLD, 18));
            t1.setBounds(350,376,320,30);
            add(t1);
            
            l8 = new JLabel("Aadar Number: ");
            l8.setBounds(100,426,150,30);
            l8.setFont(new Font("Raleway",Font.BOLD, 18));
            add(l8);
            
            t2 = new JTextField();
            t2.setFont(new Font("Raleway",Font.BOLD, 18));
            t2.setBounds(350,426,320,30);
            add(t2);
            
            l9 = new JLabel("Senior Citizen: ");
            l9.setBounds(100,476,150,30);
            l9.setFont(new Font("Raleway",Font.BOLD, 18));
            add(l9);
            
            l10 = new JLabel("Existing Account: ");
            l10.setBounds(100,526,170,30);
            l10.setFont(new Font("Raleway",Font.BOLD, 18));
            add(l10);
            
            
            
            // radio button 
            
            r1 = new JRadioButton("Yes");
            r1.setBounds(350,476,100,30);
            r1.setFont(new Font("Raleway",Font.BOLD, 18));
            r1.setBackground(Color.white);
            add(r1);
            
            r2 = new JRadioButton("No");
            r2.setBounds(470,476,100,30);
            r2.setFont(new Font("Raleway",Font.BOLD, 18));
            r2.setBackground(Color.white);
            add(r2);
            
            ButtonGroup groupOption = new ButtonGroup();
            groupOption.add(r1);
            groupOption.add(r2);
            
            r3 = new JRadioButton("Yes");
            r3.setBounds(350,526,100,30);
            r3.setFont(new Font("Raleway",Font.BOLD, 18));
            r3.setBackground(Color.white);
            add(r3);
            
            r4 = new JRadioButton("No");
            r4.setBounds(470,526,100,30);
            r4.setFont(new Font("Raleway",Font.BOLD, 18));
            r4.setBackground(Color.white);
            add(r4);
            
            ButtonGroup groupOption1 = new ButtonGroup();
            groupOption1.add(r3);
            groupOption1.add(r4);
            
            
            
            
            // combobox start
             String religion[] = {"Muslim","Hindu","Sikh","Christian","Other"};
             c1 = new JComboBox(religion);
             c1.setBackground(Color.white);
             c1.setBounds(350,120,320,30);
             c1.setFont(new Font("Raleway",Font.BOLD, 14));
             add(c1);
            
            String category[] = {"General","OBC","SC","ST","Other"};
            c2 = new JComboBox(category);
            c2.setBackground(Color.white);
            c2.setBounds(350,170,320,30);
            c2.setFont(new Font("Raleway",Font.BOLD, 14));
            add(c2);
            
            String income[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
            c3 = new JComboBox(income);
            c3.setBounds(350,220,320,30);
            c3.setBackground(Color.white);
            c3.setFont( new Font("Raleway",Font.BOLD,14));
            add(c3);
            
            String education[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
            c4 = new JComboBox(education);
            c4.setBounds(350,276,320,30);
            c4.setBackground(Color.white);
            c4.setFont( new Font("Raleway",Font.BOLD,14));
            add(c4);
            
            String occupation[] = {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
            c5 = new JComboBox(occupation);
            c5.setBounds(350,326,320,30);
            c5.setBackground(Color.white);
            c5.setFont( new Font("Raleway",Font.BOLD,14));
            add(c5);
            
            // end combobox 
            
            
            b = new JButton("Next");
            b.setBounds(570, 620,100,30);
            b.setFont( new Font("Raleway",Font.BOLD,14));
            b.setBackground(Color.black);
            b.setForeground(Color.white);
            add(b);
            
            b.addActionListener(this);
            
            setLayout(null);
            getContentPane().setBackground(Color.white);
            setBounds(300, 10, 830,790);
            setVisible(true);
        }
      public void actionPerformed(ActionEvent ae){
          
        String a = (String)c1.getSelectedItem();
        String b = (String)c2.getSelectedItem();
        String c = (String)c3.getSelectedItem();
        String d= (String)c1.getSelectedItem();
        String e = (String)c2.getSelectedItem();
        
        String f = t1.getText();
        String g = t2.getText();
        
        String h = null;
        if(r1.isSelected()){
            h = "Yes";
        }
        else if(r2.isSelected()){
            h ="No";
        }
        
        String i = null;
         if(r1.isSelected()){
            i = "Yes";
        }
        else if(r2.isSelected()){
            i ="No";
        }
        String j = t2.getText();
        
         try{
             
             if(t2.getText().equals("")){
                 JOptionPane.showMessageDialog(null,"Fill all the required fields");
             }
             else{
                 Conn c1 = new Conn();
                 String q1 = "insert into signup2 values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"')";
                 c1.s.executeUpdate(q1);
                 
                 new Signup3().setVisible(true);
                 setVisible(false);
             }
             
         }catch(Exception ex){
             ex.printStackTrace();
         }
        
      }  
        
         
    public static void main(String[] args) {
        
        Signup2 s = new Signup2();
        s.setVisible(true);
    }
        
}
