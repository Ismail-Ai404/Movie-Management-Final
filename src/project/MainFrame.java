package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;

// upComing,login,signup
public class MainFrame extends JFrame implements ActionListener {
    JButton showtimeButton;
    JButton dvdButton;
    JButton loginButton;
    JButton signupButton;
    JButton upcomingButton;
    JButton adminPass;
    JButton seePolicies;

    
    JLabel label;
    MainFrame(){
        //Jthis this=new Jthis();


        ImageIcon icon=new ImageIcon("src/project/img/MainFrameImages/pexels-daria-shevtsova-7334368.jpg");
        ImageIcon main1=new ImageIcon("src/project/img/MainFrameImages/pexels-michelle-still-creates-5151828.jpg");
        ImageIcon main2=new ImageIcon("src/project/img/MainFrameImages/pexels-dmitry-demidov-3921000.jpg");
        ImageIcon main3=new ImageIcon("src/project/img/MainFrameImages/pexels-michelle-still-creates-5151830.jpg");
        ImageIcon main4=new ImageIcon("src/project/img/MainFrameImages/pexels-ricardo-ortiz-6447217.jpg");
        ImageIcon main5=new ImageIcon("src/project/img/MainFrameImages/pexels-skitterphoto-390089.jpg");
        ImageIcon main6=new ImageIcon("src/project/img/MainFrameImages/soon.jpg");



        label=new JLabel();
        int x= (int) (1+Math.random()*6);
        if(x==1)
        label.setIcon(main2);
        if (x==2)
            label.setIcon(main1);
        if(x==3)
            label.setIcon(main3);
        if (x==4)
            label.setIcon(main4);
        if(x==5)
            label.setIcon(main5);
        if (x==6)
            label.setIcon(main6);


        //label.setBounds(150,150,2500,1000);
        label.setVisible(true);
        label.setOpaque(true);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
        label.setText("HOME");
        //label.setHorizontalTextPosition(50);
        label.setHorizontalTextPosition(JLabel.CENTER);
        //label.setVerticalTextPosition(JLabel.TOP);
        //label.setIconTextGap(-25);
        label.setForeground(Color.yellow); //set font color of text
        label.setFont(new Font("MS Gothic",Font.BOLD,100)); //set font of text
        //label.setBounds(0,0,2000,1000);


        //frame.getContentPane().setBackground(Color.BLACK);
        //this.getContentPane().setBackground(new Color(0x000000));


        showtimeButton=new JButton();
        showtimeButton.setBounds(100,100,250,100);
        //showtimeButton.setHorizontalAlignment(JshowtimeButton.TOP);
        //showtimeButton.addActionListener(e -> System.out.println("poo"));
        showtimeButton.addActionListener(this);
        showtimeButton.setText("Showtimes");
        showtimeButton.setFocusable(false);
        //showtimeButton.setIcon(icon);
        //showtimeButton.setHorizontalTextPosition(JshowtimeButton.CENTER);
        showtimeButton.setFont(new Font("Comic Sans",Font.BOLD,30));
        showtimeButton.setIconTextGap(-15);
        showtimeButton.setForeground(Color.RED);
        //showtimeButton.setBackground(Color.BLACK);
        showtimeButton.setOpaque(false);
        showtimeButton.setContentAreaFilled(false);
        showtimeButton.setBorderPainted(false);
        //showtimeButton.setBackground(new Color(123,50,250));
        showtimeButton.setBorder(BorderFactory.createCompoundBorder());
        //showtimeButton.setEnabled(false);
        showtimeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            //Font originalFont = new Font("Game on",Font.BOLD,30);

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                //originalFont = showtimeButton.getFont();
                showtimeButton.setFont(new Font("MS Gothic",Font.BOLD,35));
                showtimeButton.setForeground(Color.MAGENTA);
                //Map attributes = originalFont.getAttributes();
                //attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
                //jButton1.setFont(originalFont.deriveFont(attributes));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {

                //showtimeButton.setForeground(UIManager.getColor("control"));
                showtimeButton.setForeground(Color.RED);
                showtimeButton.setFont(new Font("Comic Sans",Font.BOLD,30));
            }
        });

        dvdButton=new JButton();
        dvdButton.setBounds(100,300,250,100);
        //dvdButton.setHorizontalAlignment(JdvdButton.TOP);
        //dvdButton.addActionListener(e -> System.out.println("poo"));
        dvdButton.addActionListener(this);
        dvdButton.setText("DVD");
        dvdButton.setFocusable(false);
        //dvdButton.setIcon(icon);
        //dvdButton.setHorizontalTextPosition(JdvdButton.CENTER);
        dvdButton.setFont(new Font("Comic Sans",Font.BOLD,30));
        dvdButton.setIconTextGap(-15);
        dvdButton.setForeground(Color.RED);
        //dvdButton.setBackground(Color.BLACK);
        dvdButton.setOpaque(false);
        dvdButton.setContentAreaFilled(false);
        dvdButton.setBorderPainted(false);
        //dvdButton.setBackground(new Color(123,50,250));
        dvdButton.setBorder(BorderFactory.createCompoundBorder());
        //dvdButton.setEnabled(false);
        dvdButton.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                
                dvdButton.setFont(new Font("MS Gothic",Font.BOLD,35));
                dvdButton.setForeground(Color.BLUE);
                
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {

                
                dvdButton.setForeground(Color.RED);
                dvdButton.setFont(new Font("Comic Sans",Font.BOLD,30));
            }
        });

        upcomingButton=new JButton();
        upcomingButton.setBounds(100,500,350,100);
        //upcomingButton.setHorizontalAlignment(JupcomingButton.TOP);
        //upcomingButton.addActionListener(e -> System.out.println("poo"));
        upcomingButton.addActionListener(this);
        upcomingButton.setText("Coming Soon");
        upcomingButton.setFocusable(false);
        //upcomingButton.setIcon(icon);
        //upcomingButton.setHorizontalTextPosition(JupcomingButton.CENTER);
        upcomingButton.setFont(new Font("Comic Sans",Font.BOLD,30));
        upcomingButton.setIconTextGap(-15);
        upcomingButton.setForeground(Color.RED);
        //upcomingButton.setBackground(Color.BLACK);
        upcomingButton.setOpaque(false);
        upcomingButton.setContentAreaFilled(false);
        upcomingButton.setBorderPainted(false);
        //upcomingButton.setBackground(new Color(123,50,250));
        upcomingButton.setBorder(BorderFactory.createCompoundBorder());
        //upcomingButton.setEnabled(false);
        upcomingButton.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {

                upcomingButton.setFont(new Font("MS Gothic",Font.BOLD,35));
                upcomingButton.setForeground(Color.ORANGE);

            }
            public void mouseExited(java.awt.event.MouseEvent evt) {


                upcomingButton.setForeground(Color.RED);
                upcomingButton.setFont(new Font("Comic Sans",Font.BOLD,30));
            }
        });

        loginButton=new JButton();
        loginButton.setBounds(1100,50,150,50);
        //loginButton.setHorizontalAlignment(JloginButton.TOP);
        //loginButton.addActionListener(e -> System.out.println("poo"));
        loginButton.addActionListener(this);
        loginButton.setText("Login");
        loginButton.setFocusable(false);
        //loginButton.setIcon(icon);
        loginButton.setHorizontalTextPosition(JButton.CENTER);
        loginButton.setFont(new Font("Comic Sans",Font.BOLD,30));
        loginButton.setIconTextGap(50);
        loginButton.setForeground(Color.RED);
        //loginButton.setBackground(Color.BLACK);
        loginButton.setOpaque(false);
        loginButton.setContentAreaFilled(false);
        loginButton.setBorderPainted(false);


        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {

                loginButton.setFont(new Font("MS Gothic",Font.BOLD,35));
                loginButton.setForeground(Color.GREEN);

            }
            public void mouseExited(java.awt.event.MouseEvent evt) {


                loginButton.setForeground(Color.RED);
                loginButton.setFont(new Font("Comic Sans",Font.BOLD,30));
            }
        });


        signupButton=new JButton();
        signupButton.setBounds(900,50,200,50);
        //signupButton.setHorizontalAlignment(JsignupButton.TOP);
        //signupButton.addActionListener(e -> System.out.println("poo"));
        signupButton.addActionListener(this);
        signupButton.setText("Sign up");
        signupButton.setFocusable(false);
        //signupButton.setIcon(icon);
        signupButton.setHorizontalTextPosition(JButton.CENTER);
        signupButton.setFont(new Font("Comic Sans",Font.BOLD,30));
        signupButton.setIconTextGap(50);
        signupButton.setForeground(Color.RED);
        //signupButton.setBackground(Color.BLACK);
        signupButton.setOpaque(false);
        signupButton.setContentAreaFilled(false);
        signupButton.setBorderPainted(false);


        
        signupButton.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {

                signupButton.setFont(new Font("MS Gothic",Font.BOLD,35));
                signupButton.setForeground(Color.GREEN);

            }
            public void mouseExited(java.awt.event.MouseEvent evt) {


                signupButton.setForeground(Color.RED);
                signupButton.setFont(new Font("Comic Sans",Font.BOLD,30));
            }
        });

        seePolicies=new JButton();
        seePolicies.setBounds(1100,150,180,50);
        //seePolicies.setHorizontalAlignment(JseePolicies.TOP);
        //seePolicies.addActionListener(e -> System.out.println("poo"));
        seePolicies.addActionListener(this);
        seePolicies.setText("Policies");
        seePolicies.setFocusable(false);
        //seePolicies.setIcon(icon);
        seePolicies.setHorizontalTextPosition(JButton.CENTER);
        seePolicies.setFont(new Font("Comic Sans",Font.BOLD,20));
        seePolicies.setIconTextGap(50);
        seePolicies.setForeground(Color.RED);
        //seePolicies.setBackground(Color.BLACK);
        seePolicies.setOpaque(false);
        seePolicies.setContentAreaFilled(false);
        seePolicies.setBorderPainted(false);


        seePolicies.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {

                seePolicies.setFont(new Font("MS Gothic",Font.BOLD,25));
                seePolicies.setForeground(Color.MAGENTA);

            }
            public void mouseExited(java.awt.event.MouseEvent evt) {


                seePolicies.setForeground(Color.RED);
                seePolicies.setFont(new Font("Comic Sans",Font.BOLD,20));
            }
        });



        adminPass=new JButton();
        adminPass.setBounds(900,400,400,90);
        adminPass.addActionListener(this);
        adminPass.setFocusable(false);
        adminPass.setOpaque(false);
        adminPass.setContentAreaFilled(false);
        adminPass.setBorderPainted(false);

        this.setTitle("Movie Management");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);
        this.add(showtimeButton);
        this.add(dvdButton);
        this.add(upcomingButton);
        this.add(loginButton);
        this.add(signupButton);
        this.add(adminPass);
        this.add(seePolicies);
        this.add(label);
        this.pack();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==showtimeButton){
            this.dispose();
            new ShowtimeFrame();
            //label.setVisible(true);
        }
        if(e.getSource()==seePolicies){

            try {
                UserAgreement.getReturnAndRefund();
                UserAgreement.getTermsAndCondition();
                UserAgreement.getPrivacyPolicy();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            //label.setVisible(true);
        }

        if(e.getSource()==dvdButton){
            this.dispose();
            new DvdFrame();
            //label.setVisible(true);
        }
        if(e.getSource()==adminPass){
            this.dispose();
            new AdminPass();
            //label.setVisible(true);
        }
        if(e.getSource()==upcomingButton){

            try {
                UpComingFrame.getPrivacyPolicy();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            //label.setVisible(true);
        }
        if(e.getSource()==loginButton){
            this.dispose();
            new lgn();

            //label.setVisible(true);
        }
        if(e.getSource()==signupButton){
            this.dispose();
            try {
                new Signup();
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            //label.setVisible(true);
        }
    }
}
