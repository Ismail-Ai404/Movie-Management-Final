
package project;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.*;

public class lgn extends JFrame implements ActionListener{
    JLabel l1,l2,l3;
    JTextField tf1;
    JPasswordField pf2;
    JButton b1,b2,b3,back;
    public static String fname="Guest";
  
    lgn(){
        setTitle("Login Page");
        setBounds(200,40,450,40);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        
        //ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ASimulatorSystem/icons/logo.jpg"));
       // Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
       // ImageIcon i3 = new ImageIcon(i2);
       // JLabel l11 = new JLabel(i3);
        //l11.setBounds(70, 10, 100, 100);
       // add(l11);
        
        l1 = new JLabel("      WELCOME!");
        l1.setFont(new Font("Osward", Font.BOLD, 38));
        l1.setBounds(200,40,450,40);
        add(l1);
        
        l2 = new JLabel("UserName:");
        l2.setFont(new Font("Raleway", Font.BOLD, 28));
        l2.setBounds(125,150,375,30);
        add(l2);
        
        tf1 = new JTextField(15);
        tf1.setBounds(300,150,230,30);
        tf1.setFont(new Font("Arial", Font.BOLD, 14));
        add(tf1);
        
        l3 = new JLabel("Password:");
        l3.setFont(new Font("Raleway", Font.BOLD, 28));
        l3.setBounds(125,220,375,30);
        add(l3);
        
        pf2 = new JPasswordField(15);
        pf2.setFont(new Font("Arial", Font.BOLD, 14));
        pf2.setBounds(300,220,230,30);
        add(pf2);
                
        b1 = new JButton("Login");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2 = new JButton("CLEAR");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        b3 = new JButton("SIGN UP");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);

        back = new JButton("Home");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        
        setLayout(null);
        
        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setBounds(300,300,100,30);
        add(b1);
        
        b2.setFont(new Font("Arial", Font.BOLD, 14));
        b2.setBounds(430,300,100,30);
        add(b2);
        
        b3.setFont(new Font("Arial", Font.BOLD, 14));
        b3.setBounds(300,350,230,30);
        add(b3);

        back.setFont(new Font("Arial", Font.BOLD, 14));
        back.setBounds(320,400,180,30);
        add(back);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        back.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,480);
        setLocation(550,200);
        setVisible(true);
        
    }

    public static String getFname() {
        return fname;
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            String userText;
            String passText;
            
            userText = tf1.getText();
            passText = pf2.getText();
            
			try {
				String path = ("UserID.txt");
				
				
				FileReader fr = new FileReader(path);
	            BufferedReader br = new BufferedReader(fr);
	            
	            boolean isLoginSuccess = false;
	           
	            int u=0;
	            String line, fpass, fusername;
	            
	            
	           
	            while((line = br.readLine()) != null)
	            {	String[]x = line.split(" ",5);
	            	fusername = x[2];


	            	fpass = x[4];
	           
	              if (fusername.equalsIgnoreCase(userText) && fpass.equalsIgnoreCase(passText)) {
	                	isLoginSuccess = true;
	                	String user;
	                	
                                user = fusername;
                      fname=x[0];
	                	dispose();
	                	new ShowtimeFrame();
		    
	                	//StudentDashboard s = new StudentDashboard(this.fn,this.ln,this.id,this.email);
		               // s.setVisible(true);
	    				
		                break;
	                }
	                else if(fusername.equalsIgnoreCase(userText) )
	                {
	                	u++;
	                }    
	            }
	            if(!isLoginSuccess)
	            {
	            	if(u>0)
	            	{
	            		JOptionPane.showMessageDialog(null, "Invalid Password!", "WARNING!!", JOptionPane.WARNING_MESSAGE);
	            	}
	            	else
	            	{
	            		JOptionPane.showMessageDialog(null, "Invalid User!", "WARNING!!", JOptionPane.WARNING_MESSAGE);
	            	}
	            }
	            
	            br.close();
	          
				
			}
				
			catch (Exception ep) {
				System.out.println("ERROR 404! File-Not-Found");
	            ep.printStackTrace();
	        }
        }
                

            
        else if(e.getSource()==b2) {
			tf1.setText("");
			pf2.setText("");
		}
    
        
        else if(e.getSource()==b3)
        { 
            setVisible(false);
            new Signup();
           // new sgnup();
        }

        else if(e.getSource()==back)
        {
            setVisible(false);
            new MainFrame();
            // new sgnup();
        }
        
    }
    


    
}
