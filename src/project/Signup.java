
package project;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class Signup extends JFrame implements ActionListener{
    String path ="UserID.txt";
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField tf1,tf2,tf3,tf4,tf5;
    JButton b1,back;
    JPasswordField pf;
    JCheckBox showPassword = new JCheckBox();
    JCheckBox cb1,cb2,cb3;
    

  
    Signup(){
        setTitle("Signup Page");
        setBounds(200,40,500,40);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        
        //ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ASimulatorSystem/icons/logo.jpg"));
       // Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
       // ImageIcon i3 = new ImageIcon(i2);
       // JLabel l11 = new JLabel(i3);
        //l11.setBounds(70, 10, 100, 100);
       // add(l11);
        
        l1 = new JLabel("      Signup");
        l1.setFont(new Font("Arial", Font.BOLD, 30));
        l1.setBounds(200,40,450,40);
        add(l1);
        
        l2 = new JLabel(" First Name:");
        l2.setFont(new Font("Raleway", Font.BOLD, 28));
        l2.setBounds(100,100,375,30);
        add(l2);
        
        tf1 = new JTextField(15);
        tf1.setBounds(340,100,230,30);
        tf1.setFont(new Font("Arial", Font.BOLD, 14));
        add(tf1);
        
        l3 = new JLabel("Last Name:");
        l3.setFont(new Font("Raleway", Font.BOLD, 28));
        l3.setBounds(100,150,375,30);
        add(l3);
        tf2 = new JTextField(15);
        tf2.setBounds(340,150,230,30);
        tf2.setFont(new Font("Arial", Font.BOLD, 14));
        add(tf2);
        l4 = new JLabel("Set Username:");
        l4.setFont(new Font("Raleway", Font.BOLD, 28));
        l4.setBounds(100,200,375,30);
        add(l4);
        tf3 = new JTextField(15);
        tf3.setBounds(340,200,230,30);
        tf3.setFont(new Font("Arial", Font.BOLD, 14));
        add(tf3);
        l5 = new JLabel("Email Address");
        l5.setFont(new Font("Raleway", Font.BOLD, 28));
        l5.setBounds(100,250,375,30);
        add(l5);
        tf4 = new JTextField(15);
        tf4.setBounds(340,250,230,30);
        tf4.setFont(new Font("Arial", Font.BOLD, 14));
        add(tf4);
        l6 = new JLabel("Phone Number");
        l6.setFont(new Font("Raleway", Font.BOLD, 28));
        l6.setBounds(100,300,375,30);
        add(l6);
        tf5 = new JTextField(15);
        tf5.setBounds(340,300,230,30);
        tf5.setFont(new Font("Arial", Font.BOLD, 14));
        add(tf5);
        l7 = new JLabel("Set Password");
        l7.setFont(new Font("Raleway", Font.BOLD, 28));
        l7.setBounds(100,350,375,30);
        add(l7);
        pf = new JPasswordField(15);
        pf.setBounds(340,350,230,30);
        pf.setFont(new Font("Arial", Font.BOLD, 14));
        add(pf);
        showPassword.setBounds(580, 360, 20, 20);
        showPassword.setToolTipText("Show Password");
        showPassword.setBackground(Color.gray);
        //add(showPassword);
                
       
        
        b1 = new JButton("SIGN UP");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);

        back = new JButton("Home");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        setLayout(null);

        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setBounds(400,400,150,30);
        add(b1);

        b1.addActionListener(this);

        back.setFont(new Font("Arial", Font.BOLD, 14));
        back.setBounds(200,400,150,30);
        add(back);

        back.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,480);
        setLocation(550,200);
        setVisible(true);
        
    }
    public boolean check(String username)
    { 
        int y=5;
        String line;
        try{
            FileReader f= new FileReader(path);
            BufferedReader br= new BufferedReader(f);
            
            
        
              while((line = br.readLine()) != null)
	            {	String[]x = line.split(" ",5);
                       if(x[1].compareToIgnoreCase(username)==0)
                       return true;
	            	
                    } }
              catch(Exception ep)
                      {
                      System.out.println("Error!");
                      
                      }
        return false;
        }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == b1) 
		{
			try
			{       if(!check(tf1.getText()) &&!check(tf2.getText()) &&!check(tf3.getText()) &&!check(tf4.getText()) &&!check(tf5.getText() ))
                        {
			    
			       String path ="UserID.txt";
			    	  
			    	  FileWriter myWriter = new FileWriter(path,true);

                      myWriter.write(tf1.getText()+" "+tf2.getText()+" "+tf3.getText()+" "+tf4.getText()+" "+tf5.getText()+"\n");
                      myWriter.close();
                      JOptionPane.showMessageDialog(null, "Successfully Registered");
                      this.dispose();
                      new lgn();


                    //  JOptionPane.showMessageDialog(null, "Fields Can't be blank");

                        }
                        else {

                JOptionPane.showMessageDialog(null, "All Fields must be fulfill");
                this.dispose();
                new MainFrame();
            }

			 }
			catch (IOException ep) {
			      System.out.println("ERROR 404! File-Not-Found");
			      ep.printStackTrace();
			    }
		}
    
    
    
     if (e.getSource() == showPassword) 
        {
			
            if (showPassword.isSelected()) 
            {
                pf.setEchoChar((char) 0);
            }
            else 
            {
                pf.setEchoChar((char) 8226);
            }
        }

     if(e.getSource() == back){
         this.dispose();
         new MainFrame();
     }

    }

}
